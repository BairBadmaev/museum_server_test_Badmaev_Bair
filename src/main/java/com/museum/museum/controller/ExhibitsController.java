package com.museum.museum.controller;

import com.museum.museum.entity.ExhibitsEntity;
import com.museum.museum.service.ExhibitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExhibitsController {

    private final ExhibitsService exhibitsService;

    @Autowired
    public ExhibitsController(ExhibitsService exhibitsService){
        this.exhibitsService = exhibitsService;
    }

    @PostMapping(value = "/exhibits")
    public ResponseEntity<?> create(@RequestBody ExhibitsEntity newExhibits){
        exhibitsService.create(newExhibits);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/exhibits")
    public ResponseEntity<List<ExhibitsEntity>> read(){
        final List<ExhibitsEntity> exhibits = exhibitsService.readAll();
        return exhibits != null && !exhibits.isEmpty() ? new ResponseEntity<>(exhibits, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @GetMapping(value = "/exhibits/{id}")
    public  ResponseEntity<ExhibitsEntity> read(@PathVariable(name="id") int id){
        final ExhibitsEntity newExhibits = exhibitsService.read(id);
        return  newExhibits != null ? new ResponseEntity<>(newExhibits, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/exhibits/{id}")
    public ResponseEntity<ExhibitsEntity> put(@PathVariable(name="id") int id, @RequestBody ExhibitsEntity newExhibits){

        if (exhibitsService.update(newExhibits, id)){
            ExhibitsEntity newExhibitsWithId = exhibitsService.read(id);
            return  new ResponseEntity<>(newExhibitsWithId, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/exhibits/{id}")
    public ResponseEntity<?> delete(@PathVariable(name="id") int id){
        final ExhibitsEntity newUser = exhibitsService.read(id);
        if (newUser != null) {
            exhibitsService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}







