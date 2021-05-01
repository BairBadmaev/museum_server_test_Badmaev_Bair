package com.museum.museum.service;

import com.museum.museum.entity.Exhibits_in_showroomEntity;
import com.museum.museum.repository.Exhibits_in_showroomRepository;
import com.museum.museum.repository.Exhibits_in_showroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Exhibits_in_showroomService {
    @Autowired
    Exhibits_in_showroomRepository exhibits_in_showroomRepo;

    public Exhibits_in_showroomService(Exhibits_in_showroomRepository exhibits_in_showroomRepo) {
        this.exhibits_in_showroomRepo = exhibits_in_showroomRepo;
    }

    public Exhibits_in_showroomEntity create(Exhibits_in_showroomEntity newExhibits) {
        exhibits_in_showroomRepo.save(newExhibits);
        return newExhibits;
    }


    public List<Exhibits_in_showroomEntity> readAll() {
        return new ArrayList<>(exhibits_in_showroomRepo.findAll());
    }


    public Exhibits_in_showroomEntity read(int id) {
        return exhibits_in_showroomRepo.findById(id);
    }


    public boolean update(Exhibits_in_showroomEntity newExhibits, int id) {
        Exhibits_in_showroomEntity buff = exhibits_in_showroomRepo.findById(id);
        if (buff == null){
            return false;
        }
        newExhibits.setId(id);
        exhibits_in_showroomRepo.save(newExhibits);
        return true;
    }

    public boolean delete(int id) {
        Exhibits_in_showroomEntity buff = exhibits_in_showroomRepo.findById(id);
        if (buff != null) {
            exhibits_in_showroomRepo.delete(buff);
            return true;
        }
        return false;
    }
    public boolean deleteByShowroomId(int id) {
        Exhibits_in_showroomEntity buff = exhibits_in_showroomRepo.findById(id);
        if (buff != null) {
            exhibits_in_showroomRepo.delete(buff);
            return true;
        }
        return false;
    }
    public boolean deleteByUserId(int id) {
        Exhibits_in_showroomEntity buff = exhibits_in_showroomRepo.findById(id);
        if (buff != null) {
            exhibits_in_showroomRepo.delete(buff);
            return true;
        }
        return false;
    }
}
