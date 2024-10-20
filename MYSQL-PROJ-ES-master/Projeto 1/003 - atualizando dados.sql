-- inserimos alguns dados errados, vamos corrigilos agora
-- Vizualize quais campos estao incorretos
SELECT * FROM candidatos;

-- vamos corrigilos utilizando o id como referencia
-- pedimos para o msq = atualiza na tabela CANDIDATOS o nome onde o id é = 4
UPDATE candidatos SET nome = 'Oscar' WHERE id_candidato = '4';

-- vizualize
SELECT * FROM candidatos;

-- agora editaremos em massa, area de atuacao e estado
UPDATE candidatos SET area_atuacao = 'Programador', estado = 'BA' WHERE id_candidato = '4';

-- vizualize
SELECT * FROM candidatos;

-- corrigindo os outros
UPDATE candidatos SET nome = 'Lucas Lincon'WHERE id_candidato = '5';
UPDATE candidatos SET nome = 'Manuela' WHERE id_candidato = '6';

-- vizualize
SELECT * FROM candidatos;

