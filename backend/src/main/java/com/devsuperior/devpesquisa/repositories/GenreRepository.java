package com.devsuperior.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.devpesquisa.entites.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
