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
