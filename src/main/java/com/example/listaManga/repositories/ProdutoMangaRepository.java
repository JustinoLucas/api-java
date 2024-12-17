package com.example.listaManga.repositories;

import com.example.listaManga.model.ProdutoManga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoMangaRepository extends JpaRepository<ProdutoManga,Integer> {
}
