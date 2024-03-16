create database exercicio01;

create table VENDEDOR(
nrvendedor tinyint not null primary key,
nomevendedor varchar(60) not null,
idade tinyint not null,
salario double(10,2) not null
);

create table PEDIDO(
nr_pedido tinyint not null primary key,
nrvendedor tinyint not null,
nrcliente tinyint not null,
quantidade_itens tinyint not null,
valor_total double(10,2) not null,
foreign key(nrcliente) references CLIENTE(nrcliente),
foreign key(nrvendedor) references VENDEDOR(nrvendedor)
);

create table CLIENTE(
nrcliente tinyint not null primary key,
nomecliente varchar(60) not null,
cidade varchar(120) not null,
tipo varchar(60) not null
);

-- Inserts for VENDEDOR table
INSERT INTO VENDEDOR (nrvendedor, nomevendedor, idade, salario) VALUES
(1, 'John Doe', 30, 50000.00),
(2, 'Jane Smith', 28, 48000.50),
(3, 'Robert Johnson', 35, 55000.75),
(4, 'Mary White', 25, 46000.25),
(5, 'Michael Brown', 40, 60000.00);
update VENDEDOR
set nomevendedor = "João"
where nrvendedor = 4;
-- Vendedores sem pedidos
INSERT INTO VENDEDOR (nrvendedor, nomevendedor, idade, salario) VALUES
(6, 'Emily Green', 28, 48000.50),
(7, 'Daniel Lee', 33, 52000.25),
(8, 'Sophia Turner', 29, 49000.75),
(9, 'William Clark', 31, 51000.00),
(10, 'Olivia Davis', 26, 47000.50);


-- Inserts for CLIENTE table
INSERT INTO CLIENTE (nrcliente, nomecliente, cidade, tipo) VALUES
(1, 'Customer1', 'City1', 'TypeA'),
(2, 'Customer2', 'City2', 'TypeB'),
(3, 'Customer3', 'City3', 'TypeC'),
(4, 'Customer4', 'City4', 'TypeA'),
(5, 'Customer5', 'City5', 'TypeB');
update CLIENTE
set tipo = "Indústria"
where nrcliente = 1;


-- Inserts for PEDIDO table
INSERT INTO PEDIDO (nr_pedido, nrvendedor, nrcliente, quantidade_itens, valor_total) VALUES
(1, 1, 1, 5, 200.50),
(2, 2, 3, 3, 150.75),
(3, 3, 2, 8, 300.00),
(4, 4, 4, 6, 250.25),
(5, 5, 5, 4, 180.50);
select nomevendedor from VENDEDOR;

SELECT
    VENDEDOR.nrvendedor FROM PEDIDO
INNER JOIN
  VENDEDOR on PEDIDO.nrcliente = VENDEDOR.nrvendedor;
  
  select VENDEDOR.nomevendedor
  from 
  VENDEDOR
  join
  PEDIDO ON VENDEDOR.nrvendedor = PEDIDO.nrvendedor
  join
  CLIENTE ON PEDIDO.nrcliente = CLIENTE.nrcliente
  where
  CLIENTE.tipo = "Indústria";
  
  -- selecionar tipo to cliente que foi atendido pelo vendedor João
  select CLIENTE.tipo
  from CLIENTE
  join
  PEDIDO on CLIENTE.nrcliente = PEDIDO.nrcliente
  join
  VENDEDOR on PEDIDO.nrvendedor = VENDEDOR.nrvendedor
  where
  VENDEDOR.nomevendedor = "João";
  
  select CLIENTE.nomecliente, CLIENTE.tipo
  from CLIENTE
  join PEDIDO on CLIENTE.nrcliente = PEDIDO.nrcliente
  where
  PEDIDO.valor_total > 180;