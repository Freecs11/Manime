package com.manime.repository;

import com.manime.model.Manga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MangaRepository extends JpaRepository<Manga, Long> {

}
