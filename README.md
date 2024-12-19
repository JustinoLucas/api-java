# Lista de Manga - Aplicação Backend

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

Essa aplicação foi feita usando **Java, Springboot e PostgreSQL.**

Essa API foi desenvolvida para meu portfolio, para demonstrar conhecimento em Backend com Java, Springboot, PostgreSQL.

## Funcionalidades

- `Listar` GET para listar conteudo da tabela do banco de dados.
- `Adicionar` POST para adicionar um produto da tabela do banco de dados.
- `Remover` DELETE para remover um produto da tabela do banco de dados.
- `Atualizar` POST para atualizar um produto da tabela do banco de dadosa.

## Dependencias
- Java JDK 23

## Instalação

1. Clone o repositorio:

```bash
git clone https://github.com/JustinoLucas/api-java.git
cd api-java
```

## Criação Banco de dados

- Banco de dados com nome "listaMangaDB"


- SQL abaixo para PostgreSQL
```bash
CREATE TABLE listamanga (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    imagem_capa VARCHAR(255),
    capitulos INTEGER
    autor_manga VARCHAR(255),
    nome_alternativo VARCHAR(255),
    tipo_manga VARCHAR(255),
    estudio VARCHAR(255);
);
```


## Integração com Frontend

Para realizar a integração com o Frontend, você pode clonar o projeto e rodar localmente, ou desenvolver você mesmo.

[Link do repositório Frontend](https://github.com/JustinoLucas/listaManga.git)


