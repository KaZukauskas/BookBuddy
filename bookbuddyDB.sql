CREATE DATABASE db_bookbuddy;
USE db_bookbuddy;

CREATE TABLE tb_usuario (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR (100) NOT NULL,
    senha VARCHAR (20) NOT NULL,
    email VARCHAR (100),
    idade int (5),
    sexo VARCHAR (20),
    genero_fav01 VARCHAR (100),
    genero_fav02 VARCHAR (100)
);

INSERT INTO tb_usuario (nome, senha) VALUES ('buddy','book');

CREATE TABLE tb_livro (
	 id_livro INT PRIMARY KEY AUTO_INCREMENT, 
     titulo VARCHAR(200) NOT NULL,
     autor VARCHAR(50) NOT NULL,
     nota INT(2) DEFAULT 0 NOT NULL,
	 genero VARCHAR(50) NOT NULL,
     num_avaliacoes INT DEFAULT 0 NOT NULL,
     soma_notas DOUBLE DEFAULT 0 NOT NULL
);

CREATE TABLE tb_genero (
	 genero VARCHAR(20) PRIMARY KEY NOT NULL
);

INSERT INTO tb_genero (genero) VALUES ('Romance');
INSERT INTO tb_genero (genero) VALUES ('Ficção');
INSERT INTO tb_genero (genero) VALUES ('Técnico');
INSERT INTO tb_genero (genero) VALUES ('Horror');
INSERT INTO tb_genero (genero) VALUES ('Thriller e Suspense');
INSERT INTO tb_genero (genero) VALUES ('Ficção Policial');
INSERT INTO tb_genero (genero) VALUES ('Mistério');

SELECT * FROM tb_genero;
SELECT * FROM tb_usuario;
SELECT * FROM tb_livro;









