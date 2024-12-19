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
    private String autor_manga;
    private String nome_alternativo;
    private String tipo_manga;
    private String estudio;

    public ProdutoManga(Integer id, String nome, String descricao, String imagem_capa, Integer capitulos, String autor_manga, String nome_alternativo, String tipo_manga, String estudio) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem_capa = imagem_capa;
        this.capitulos = capitulos;
        this.autor_manga = autor_manga;
        this.nome_alternativo = nome_alternativo;
        this.tipo_manga = tipo_manga;
        this.estudio = estudio;
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

    public String getAutor_manga() {
        return autor_manga;
    }

    public void setAutor_manga(String autor_manga) {
        this.autor_manga = autor_manga;
    }

    public String getNome_alternativo() {
        return nome_alternativo;
    }

    public void setNome_alternativo(String nome_alternativo) {
        this.nome_alternativo = nome_alternativo;
    }

    public String getTipo_manga() {
        return tipo_manga;
    }

    public void setTipo_manga(String tipo_manga) {
        this.tipo_manga = tipo_manga;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }


    public ProdutoManga(){

    }


}
