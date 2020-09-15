package com.devsuperior.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.devpesquisa.entites.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
