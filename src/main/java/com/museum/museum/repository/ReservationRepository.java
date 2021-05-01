package com.museum.museum.repository;

import com.museum.museum.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity,Integer> {
    ReservationEntity findById(int id);


}
