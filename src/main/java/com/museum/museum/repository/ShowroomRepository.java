package com.museum.museum.repository;

import com.museum.museum.entity.ShowroomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowroomRepository extends JpaRepository<ShowroomEntity,Integer> {
    ShowroomEntity findById(int id);
}
