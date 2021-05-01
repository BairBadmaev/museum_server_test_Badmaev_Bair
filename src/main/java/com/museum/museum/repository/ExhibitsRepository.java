package com.museum.museum.repository;

import com.museum.museum.entity.ExhibitsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExhibitsRepository extends JpaRepository <ExhibitsEntity,Integer>{
    ExhibitsEntity findById(int id);
}
