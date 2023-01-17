package com.manime.service;
import java.util.List;
import com.manime.model.Manga;
import com.manime.repository.MangaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MangaService {

    private final MangaRepository mangaRepository;

    public MangaService(MangaRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }


    public List<Manga> findAll() {
        return mangaRepository.findAll();
    }

    public Manga findById(Long id) {
        return mangaRepository.findById(id).orElse(null);
    }

    public Manga save(Manga manga) {
        return mangaRepository.save(manga);
    }

    public void deleteById(Long id) {
        mangaRepository.deleteById(id);
    }
}
