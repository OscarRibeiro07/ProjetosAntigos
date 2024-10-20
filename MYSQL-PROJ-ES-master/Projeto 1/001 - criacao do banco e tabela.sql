-- cria banco de dados 
CREATE DATABASE  banco_de_talentos;
-- seleciona o banco
USE banco_de_talentos;

-- cria tabela dentro do banco de talentos
CREATE TABLE candidatos(
id_candidato int auto_increment,
nome varchar(30),
area_atuacao varchar(15),
estado char(2),
pretensao_salarial double,
primary key(id_candidato)
)DEFAULT CHARSET = utf8;