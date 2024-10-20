-- agora vamos inserir alguns dados na tabela que criamos 
-- insira os dados na ordem da tabela
-- vizualize a tabela com esse comando
SELECT * FROM candidatos;
-- Veja que inserimos na ordem
INSERT INTO candidatos(id_candidato,nome,area_atuacao,estado,pretensao_salarial) values 
					  (DEFAULT,	'Marcos Pinelli','Recepção','BA','2200'        );
-- vizualize agora os dados inseridos
SELECT * FROM candidatos;
-- sabendo a orde que temos que colocar inserir os parametros da tabela alter
-- pode ser cansativo, então poderiamos fazer assim
INSERT INTO candidatos values(DEFAULT,	'Jessica Jackson','Recursos ','SP','2600');
-- visualize
SELECT * FROM candidatos;
-- podemos tambem inserir muitos de uma vez, vamos la!?
INSERT INTO candidatos values (DEFAULT,	'Raphael Millan','Engenharia','RS','4550'),
(DEFAULT,	'Oskar','pogamador','B','6600'        ),
(DEFAULT,	'luas Lincon','Roterista','RJ','1800'        ),
(DEFAULT,	'Mauela','Gerente','BA','1200'        );
SELECT * FROM candidatos;