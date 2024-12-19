package com.example.listaManga.controllers;

import com.example.listaManga.dtos.ProdutoDto;
import com.example.listaManga.model.ProdutoManga;
import com.example.listaManga.repositories.ProdutoMangaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController  // informa a IDE que ao compilar está uma classe de controle
@RequestMapping("/listamanga")
public class ProdutoMangaController {

    @Autowired  // Instanciar injetando todas as dependencias menos burocraticas
    ProdutoMangaRepository repository;

    @CrossOrigin(origins = "http://localhost:5173")  // Permite requisições do seu frontend
    @GetMapping // Do tipo GET
    public ResponseEntity getAll() {
        List<ProdutoManga> listamangas = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listamangas);
    }

    @CrossOrigin(origins = "http://localhost:5173")  // Permite requisições do seu frontend
    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable(value = "id") Integer id){
        Optional<ProdutoManga> produtomanga = repository.findById(id);
        if (produtomanga.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Manga não encontrado");
        } return ResponseEntity.status(HttpStatus.FOUND).body(produtomanga.get());
    }

    @CrossOrigin(origins = "http://localhost:5173")  // Permite requisições do seu frontend
    @PostMapping // Do tipo POST
    public ResponseEntity save(@RequestBody ProdutoDto dto) {
        var produtomanga = new ProdutoManga();
        BeanUtils.copyProperties(dto, produtomanga);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produtomanga));

    }

    @CrossOrigin(origins = "http://localhost:5173")  // Permite requisições do seu frontend
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Integer id){
        Optional<ProdutoManga> produtomanga = repository.findById(id);
        if (produtomanga.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Manga não encontrado");
        }
        repository.delete(produtomanga.get());
        return ResponseEntity.status(HttpStatus.OK).body("Manga Deletado");
    }

    @CrossOrigin(origins = "http://localhost:5173")  // Permite requisições do seu frontend
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable(value = "id") Integer id, @RequestBody ProdutoDto dto){
        Optional<ProdutoManga> produtomanga = repository.findById(id);
        if (produtomanga.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Manga não encontrado");
        }
       var mangaAtualiza = produtomanga.get();
        BeanUtils.copyProperties(dto, mangaAtualiza);
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(mangaAtualiza));
    }

}
