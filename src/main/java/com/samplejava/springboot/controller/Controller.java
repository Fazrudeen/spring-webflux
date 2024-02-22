package com.samplejava.springboot.controller;

import com.samplejava.springboot.model.UserRequest;
import com.samplejava.springboot.model.Users;
import com.samplejava.springboot.service.SaveService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/use_db/v1")
public class Controller {

    private SaveService saveService;

    public Controller(SaveService saveService) {
        this.saveService = saveService;
    }

    @PostMapping(path = "/save_user")
    public Mono<Users> saveDB(@RequestBody UserRequest userRequest) {
        return saveService.saveDB(userRequest);
    }

    @PostMapping(path = "/get_id/{id}")
    public Mono<Users> findById(@PathVariable String id){
        return saveService.findUserByUserId(id);
    }

    @GetMapping(path = "")
    public Flux<Users> findAll() {
        return saveService.findAllUsers();
    }
}


