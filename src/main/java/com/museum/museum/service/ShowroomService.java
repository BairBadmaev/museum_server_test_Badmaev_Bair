package com.museum.museum.service;

import com.museum.museum.entity.ShowroomEntity;
import com.museum.museum.entity.ShowroomEntity;
import com.museum.museum.repository.ShowroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ShowroomService {
    @Autowired
    ShowroomRepository showroomRepo;

    public ShowroomService(ShowroomRepository showroomRepo) {
        this.showroomRepo = showroomRepo;
    }

    public ShowroomEntity create(ShowroomEntity newReserv) {
        showroomRepo.save(newReserv);
        return newReserv;
    }


    public List<ShowroomEntity> readAll() {
        return new ArrayList<>(showroomRepo.findAll());
    }


    public ShowroomEntity read(int id) {
        return showroomRepo.findById(id);
    }


    public boolean update(ShowroomEntity newShowroom, int id) {
        ShowroomEntity buff = showroomRepo.findById(id);
        if (buff == null){
            return false;
        }
        newShowroom.setShowroom_id(id);
        showroomRepo.save(newShowroom);
        return true;
    }

    public boolean delete(int id) {
        ShowroomEntity buff = showroomRepo.findById(id);
        if (buff != null) {
            showroomRepo.delete(buff);
            return true;
        }
        return false;
    }




}
