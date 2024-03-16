create database exercicio02;

  create table ALUNO(
  aluno_id tinyint not null primary key,
nome varchar(60) not null,
curso varchar(60) not null,
nível tinyint not null,
idade tinyint not null
);
create table TURMA(
  turma_id tinyint not null primary key,
nometurma varchar(60) not null,
sala tinyint not null,
horário time not null
);

create table MATRICULA(
matricula_id tinyint not null primary key,
aluno_id tinyint not null,
turma_id tinyint not null,
nota_1 tinyint not null,
nota_2 tinyint not null,
nota_3 tinyint not null,
nota_final tinyint not null,
numerofaltas tinyint not null
);
alter table MATRICULA
modify column turma_id tinyint,
modify column nota_1 tinyint,
modify column nota_2 tinyint,
modify column nota_3 tinyint,
modify column nota_final tinyint,
modify column numerofaltas tinyint;
-- Inserções na tabela ALUNO
INSERT INTO ALUNO (aluno_id, nome, curso, nível, idade) VALUES
(1, 'João Silva', 'Engenharia', 1, 20),
(2, 'Maria Oliveira', 'Medicina', 2, 22),
(3, 'Carlos Santos', 'Administração', 1, 21),
(4, 'Ana Pereira', 'Ciência da Computação', 3, 23),
(5, 'Lucas Rodrigues', 'Direito', 2, 22);

-- Inserções na tabela TURMA
INSERT INTO TURMA (turma_id, nometurma, sala, horário) VALUES
(1, 'Turma A', 101, '08:00:00'),
(2, 'Turma B', 102, '10:30:00'),
(3, 'Turma C', 103, '14:00:00'),
(4, 'Turma D', 104, '16:30:00'),
(5, 'Turma E', 105, '19:00:00');

-- Inserções na tabela MATRICULA
INSERT INTO MATRICULA (matricula_id, aluno_id, turma_id, nota_1, nota_2, nota_3, nota_final, numerofaltas) VALUES
(1, 1, null, null, null, null, null, null),
(2, 2, 2, 90, 85, 88, 87, 1),
(3, 3, 3, 75, 80, 78, 76, 3),
(4, 4, 4, 95, 92, 90, 93, 0),
(5, 5, 5, 88, 86, 89, 87, 1);

INSERT INTO ALUNO (aluno_id, nome, curso, nível, idade) VALUES
(6, 'MEDINHO', 'Engenharia', 2, 28);
INSERT INTO TURMA (turma_id, nometurma, sala, horário) VALUES
(6, 'Turma do MEDINHO', 30, '08:00:00');
INSERT INTO MATRICULA (matricula_id, aluno_id, turma_id, nota_1, nota_2, nota_3, nota_final, numerofaltas) VALUES
(6, 6, 6, 90, 70, 85, 82, 0);


-- Adicionando chave estrangeira para aluno_id
ALTER TABLE MATRICULA
ADD CONSTRAINT fk_aluno
FOREIGN KEY (aluno_id) 
REFERENCES ALUNO(aluno_id);

-- Adicionando chave estrangeira para turma_id
ALTER TABLE MATRICULA
ADD CONSTRAINT fk_turma
FOREIGN KEY (turma_id) 
REFERENCES TURMA(turma_id);
-- 1
select nome from ALUNO;

-- 2
select MATRICULA.matricula_id from MATRICULA
inner join ALUNO on MATRICULA.aluno_id = ALUNO.aluno_id;

-- 3
select MATRICULA.matricula_id from MATRICULA
inner join ALUNO on MATRICULA.aluno_id = ALUNO.aluno_id
where MATRICULA.turma_id is null;

-- 4
select ALUNO.aluno_id from ALUNO
 join MATRICULA on ALUNO.aluno_id = MATRICULA.aluno_id
 join TURMA on MATRICULA.turma_id = TURMA.turma_id
where TURMA.sala = 30;

-- 5
select TURMA.horário from TURMA
join MATRICULA on TURMA.turma_id = MATRICULA.turma_id
join ALUNO on MATRICULA.aluno_id = ALUNO.aluno_id
where ALUNO.nome = "MEDINHO";


-- 6
select ALUNO.nome from ALUNO
join MATRICULA on ALUNO.aluno_id = MATRICULA.aluno_id
join TURMA on MATRICULA.turma_id = TURMA.turma_id
where TURMA.sala = 30;

-- 7
select ALUNO.nome from ALUNO
join MATRICULA on ALUNO.aluno_id = MATRICULA.aluno_id
join TURMA ON MATRICULA.turma_id = TURMA.turma_id
where TURMA.sala != 30;

-- 8 
select TURMA.nometurma from TURMA
join MATRICULA ON TURMA.turma_id = MATRICULA.turma_id
join ALUNO ON MATRICULA.aluno_id = ALUNO.aluno_id
where MATRICULA.nota_final >= 80;