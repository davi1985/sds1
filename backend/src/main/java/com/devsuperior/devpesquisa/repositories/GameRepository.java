package com.devsuperior.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devpesquisa.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
