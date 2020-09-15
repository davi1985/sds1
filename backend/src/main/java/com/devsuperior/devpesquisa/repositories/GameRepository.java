package com.devsuperior.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.devpesquisa.entites.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
