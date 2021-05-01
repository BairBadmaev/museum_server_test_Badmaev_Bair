package com.museum.museum.controller;

import com.museum.museum.entity.UserEntity;
import com.museum.museum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping(value = "/users")
    public ResponseEntity<?> create(@RequestBody UserEntity newUser){
        userService.create(newUser);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<UserEntity>> read(){
        final List<UserEntity> users = userService.readAll();
        return users != null && !users.isEmpty() ? new ResponseEntity<>(users, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @GetMapping(value = "/users/{id}")
    public  ResponseEntity<UserEntity> read(@PathVariable(name="id") int id){
        final UserEntity newUser = userService.read(id);
        return  newUser != null ? new ResponseEntity<>(newUser, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/users/{id}")
    public ResponseEntity<UserEntity> put(@PathVariable(name="id") int id, @RequestBody UserEntity newUser){

        if (userService.update(newUser, id)){
            UserEntity newUserWithId = userService.read(id);
            return  new ResponseEntity<>(newUserWithId, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<?> delete(@PathVariable(name="id") int id){
        final UserEntity newUser = userService.read(id);
        if (newUser != null) {
            userService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}



