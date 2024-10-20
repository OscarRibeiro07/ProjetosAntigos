-- estava aqui pensando em algumas infos. importantes 
-- que devemos saber sobre o candidato vamos inseri-las na tabela!

-- alterando a tabela e inserindo nova coluna
ALTER TABLE candidatos ADD COLUMN remuneracao_anterior double;

-- vizualize
SELECT * FROM candidatos;

-- adicionando uma coluna depois de area de atuacao
ALTER TABLE candidatos ADD COLUMN experiencia varchar(199) AFTER area_atuacao;
SELECT * FROM candidatos;

-- vamos modificar o estado para receber todo o nome
ALTER TABLE candidatos MODIFY COLUMN estado varchar(20);
SELECT * FROM candidatos;

-- agora teste seu conhecimento inserindo os dados novos com isert into 
-- ao inves de colocar BA coloque Bahia ou ao inves de SP coloque São Paulo

-- vamos adicionar uma mais que tenha um valor padrao caso nao seja inserido
ALTER TABLE candidatos ADD COLUMN situacao varchar(15) DEFAULT 'DESEMPREGADO';