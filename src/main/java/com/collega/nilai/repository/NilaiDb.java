package com.collega.nilai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collega.nilai.model.NilaiModel;

@Repository
public interface NilaiDb extends JpaRepository<NilaiModel, Long>{
    
}
