package com.manime.controller;

import java.util.List;
import com.manime.model.Manga;
import com.manime.service.MangaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mangas")
public class MangaController {

    private final MangaService mangaService;


    public MangaController(MangaService mangaService) {
        this.mangaService = mangaService;
    }

    @GetMapping
    public List<Manga> findAll() {
        return mangaService.findAll();
    }

    @GetMapping("/{id}")
    public Manga findById(@PathVariable Long id) {
        return mangaService.findById(id);
    }

    @PostMapping
    public Manga save(@RequestBody Manga manga) {
        return mangaService.save(manga);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        mangaService.deleteById(id);
    }
}
