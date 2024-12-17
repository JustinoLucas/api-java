package com.example.listaManga.model;

import jakarta.persistence.*;

@Entity(name = "listamanga") // Usando uma Anotação, para especifcar atributos e etc... para mostrar para a IDE que essa classe é uma Entidade
@Table(name = "listamanga") // Tabela no banco de dados
public class ProdutoManga {

    @Id  // Que a id abaixo se trata de uma id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Ele tera a etrategia de valor dele IDENTIDADE
    private Integer id;
    private String nome;
    private String descricao;
    private String imagem_capa;
    private Integer capitulos;

    public ProdutoManga(Integer id, String nome, String descricao, String imagem_capa, Integer capitulos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem_capa = imagem_capa;
        this.capitulos = capitulos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem_capa() {
        return imagem_capa;
    }

    public void setImagem_capa(String imagem_capa) {
        this.imagem_capa = imagem_capa;
    }

    public Integer getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Integer capitulos) {
        this.capitulos = capitulos;
    }




    public ProdutoManga(){

    }


}
