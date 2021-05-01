package com.museum.museum.repository;

import com.museum.museum.entity.Exhibits_in_showroomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Exhibits_in_showroomRepository extends JpaRepository <Exhibits_in_showroomEntity, Integer>{
    Exhibits_in_showroomEntity findById(int id);


}
