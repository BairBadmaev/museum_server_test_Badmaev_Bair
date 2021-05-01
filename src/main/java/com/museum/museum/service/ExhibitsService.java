package com.museum.museum.service;

import com.museum.museum.entity.ExhibitsEntity;
import com.museum.museum.repository.ExhibitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExhibitsService {

    @Autowired
    ExhibitsRepository exhibitsRepo;

    public ExhibitsService(ExhibitsRepository exhibitsRepo) {
        this.exhibitsRepo = exhibitsRepo;
    }

    public ExhibitsEntity create(ExhibitsEntity newExhibits) {
        exhibitsRepo.save(newExhibits);
        return newExhibits;
    }


    public List<ExhibitsEntity> readAll() {
        return new ArrayList<>(exhibitsRepo.findAll());
    }


    public ExhibitsEntity read(int id) {
        return exhibitsRepo.findById(id);
    }


    public boolean update(ExhibitsEntity newExhibits, int id) {
        ExhibitsEntity buff = exhibitsRepo.findById(id);
        if (buff == null){
            return false;
        }
        newExhibits.setExhibit_id(id);
        exhibitsRepo.save(newExhibits);
        return true;
    }

    public boolean delete(int id) {
        ExhibitsEntity buff = exhibitsRepo.findById(id);
        if (buff != null) {
            exhibitsRepo.delete(buff);
            return true;
        }
        return false;
    }


}
