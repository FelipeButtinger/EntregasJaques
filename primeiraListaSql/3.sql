create database exercicio3;

CREATE TABLE EMPREGADO (
    idemp INT PRIMARY KEY,
    nomeemp VARCHAR(100),
    aniversario DATE,
    enderecoemp VARCHAR(100),
    sexoemp VARCHAR(1),
    salarioemp DECIMAL(10,2),
    nrdep INT,
    FOREIGN KEY (nrdep) REFERENCES DEPARTAMENTO(nrdep)
);

CREATE TABLE DEPARTAMENTO (
    nrdep INT PRIMARY KEY,
    nomedep VARCHAR(100),
    idgerente INT,
    horario VARCHAR(50),
    FOREIGN KEY (idgerente) REFERENCES EMPREGADO(idemp)
);

CREATE TABLE LOCALIZACAO (
    localizacao VARCHAR(100),
    nrdep INT,
    PRIMARY KEY (localizacao, nrdep),
    FOREIGN KEY (nrdep) REFERENCES DEPARTAMENTO(nrdep)
);

CREATE TABLE TRABALHA_EM (
    idemp INT,
    nrprojeto INT,
    horas INT,
    PRIMARY KEY (idemp, nrprojeto),
    FOREIGN KEY (idemp) REFERENCES EMPREGADO(idemp),
    FOREIGN KEY (nrprojeto) REFERENCES PROJETO(nrproj)
);

CREATE TABLE PROJETO (
    nrproj INT PRIMARY KEY,
    nomeproj VARCHAR(100),
    nrdep INT,
    FOREIGN KEY (nrdep) REFERENCES DEPARTAMENTO(nrdep)
);

CREATE TABLE DEPENDENTE (
    iddepende INT PRIMARY KEY,
    idemp INT,
    nomedep VARCHAR(100),
    sexodep VARCHAR(1),
    aniversariodep DATE,
    parentesco VARCHAR(50),
    FOREIGN KEY (idemp) REFERENCES EMPREGADO(idemp)
);

INSERT INTO EMPREGADO (idemp, nomeemp, aniversario, enderecoemp, sexoemp, salarioemp, nrdep) VALUES
(1, 'Cesar', '1990-05-15', 'Rua A, 123', 'M', 4100.00, 1),
(2, 'Junior', '1985-10-20', 'Rua B, 456', 'M', 3100.00, 1),
(3, 'João', '1988-03-25', 'Rua C, 789', 'M', 3800.00, 2),
(4, 'Ana', '1992-07-10', 'Rua D, 012', 'F', 2300.00, 3);

INSERT INTO DEPARTAMENTO (nrdep, nomedep, idgerente, horario) VALUES
(1, 'Compras', 1, 'Segunda a Sexta, 07:30-15:30'),
(2, 'Financeiro', 2, 'Segunda a Sexta, 010:00-22:00'),
(3, 'Produção', 3, 'Segunda a Sexta, 08:00-16:30');

INSERT INTO LOCALIZACAO (localizacao, nrdep) VALUES
('Rio de Janeiro', 1),
('Rio Grande do Sul', 2),
('Rio de Janeiro', 3);

INSERT INTO TRABALHA_EM (idemp, nrprojeto, horas) VALUES
(1, 101, 40),
(2, 102, 35),
(3, 101, 45),
(4, 103, 38);

INSERT INTO PROJETO (nrproj, nomeproj, nrdep) VALUES
(101, 'Projeto A', 1),
(102, 'Projeto B', 2),
(103, 'Projeto C', 3);

INSERT INTO DEPENDENTE (iddepende, idemp, nomedep, sexodep, aniversariodep, parentesco) VALUES
(1, 1, 'Filho', 'M', '2010-03-12', 'Filho'),
(2, 1, 'Esposa', 'F', '1988-12-05', 'Esposa'),
(3, 2, 'Filha', 'F', '2015-07-20', 'Filha'),
(4, 3, 'Filho', 'M', '2012-01-10', 'Filho');

-- 1
SELECT nomeemp, enderecoemp 
FROM EMPREGADO 
WHERE nrdep = (SELECT nrdep FROM DEPARTAMENTO WHERE nomedep = 'Compras');

-- 2
SELECT P.nrproj, P.nrdep, D.idgerente, E.enderecoemp, E.aniversario
FROM PROJETO P
JOIN DEPARTAMENTO D ON P.nrdep = D.nrdep
JOIN EMPREGADO E ON D.idgerente = E.idemp
JOIN LOCALIZACAO L ON D.nrdep = L.nrdep
WHERE L.localizacao = 'Rio de Janeiro';

-- 3
SELECT DISTINCT P.nomeproj
FROM PROJETO P
JOIN TRABALHA_EM T ON P.nrproj = T.nrprojeto
JOIN EMPREGADO E ON T.idemp = E.idemp
WHERE E.nomeemp = 'João';