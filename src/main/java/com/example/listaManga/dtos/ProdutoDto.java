package com.example.listaManga.dtos;

// Um clone da classe ProdutoManga
public record ProdutoDto(String nome, String descricao, String imagem_capa, Integer capitulos, String autor_manga, String nome_alternativo, String tipo_manga, String estudio) {
}
