CREATE TABLE listamanga (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    imagem_capa VARCHAR(255),
    capitulos INTEGER
);