CREATE TABLE funcionarios (
  codigo          SERIAL       PRIMARY KEY,
  nome            VARCHAR(50)  NOT NULL,
  cpf             VARCHAR(11)  NOT NULL UNIQUE,
  data_nascimento DATE,
  genero          SMALLINT,
  salario         NUMERIC(9, 2),
  atualizacao     TIMESTAMP,
  foto            BYTEA
);

INSERT INTO funcionarios VALUES (
    DEFAULT, 'Marcio Torres', '88822233344', 
    '1976-10-25', 0, 999.99, NOW(), NULL
);

SELECT * FROM funcionarios;

SELECT * FROM funcionarios WHERE codigo = 1;

CREATE TABLE pontos (
    codigo          SERIAL       PRIMARY KEY,
    entrada         TIMESTAMP,
    saida           TIMESTAMP,
    cod_funcionario INTEGER, 
    CONSTRAINT funcionario_fk 
    FOREIGN KEY (cod_funcionario)
    REFERENCES funcionarios (codigo)
    ON DELETE CASCADE
);

SELECT * FROM pontos;

SELECT entrada, saida, f.nome 
FROM pontos p
JOIN funcionarios f
ON p.cod_funcionario = f.codigo;

CREATE TABLE departamentos (
    codigo SERIAL        PRIMARY KEY,
    nome   VARCHAR(20)   NOT NULL
);

INSERT INTO departamentos (nome) 
VALUES ('RH'), ('Vendas'), ('Gerência');

ALTER TABLE funcionarios
ADD COLUMN cod_departamento INTEGER
REFERENCES departamentos (codigo)
ON DELETE SET NULL;

SELECT * FROM departamentos;





--