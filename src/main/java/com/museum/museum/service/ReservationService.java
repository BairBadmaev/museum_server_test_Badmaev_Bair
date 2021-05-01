package com.museum.museum.service;

import com.museum.museum.entity.ExhibitsEntity;
import com.museum.museum.entity.ReservationEntity;
import com.museum.museum.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {
    public ReservationService(ReservationRepository reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    @Autowired
    ReservationRepository reservationRepo;

    public ReservationEntity create(ReservationEntity newReserv) {
        reservationRepo.save(newReserv);
        return newReserv;
    }


    public List<ReservationEntity> readAll() {
        return new ArrayList<>(reservationRepo.findAll());
    }


    public ReservationEntity read(int id) {
        return reservationRepo.findById(id);
    }


    public boolean update(ReservationEntity newReserv, int id) {
        ReservationEntity buff = reservationRepo.findById(id);
        if (buff == null){
            return false;
        }
        newReserv.setReserv_id(id);
        reservationRepo.save(newReserv);
        return true;
    }

    public boolean delete(int id) {
        ReservationEntity buff = reservationRepo.findById(id);
        if (buff != null) {
            reservationRepo.delete(buff);
            return true;
        }
        return false;
    }



}
