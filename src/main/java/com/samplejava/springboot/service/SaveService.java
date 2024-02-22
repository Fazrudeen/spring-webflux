package com.samplejava.springboot.service;

import com.samplejava.springboot.model.UserRequest;
import com.samplejava.springboot.model.Users;
import com.samplejava.springboot.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class SaveService {

    private static final Logger logger = LogManager.getLogger(SaveService.class);

    private final UserRepository userRepository;

    public SaveService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<Users> saveDB(UserRequest userRequest) {
        Users users = new Users();
        users.setUserId(userRequest.getUserId());
        users.setFirstName(userRequest.getUserName());
        users.setLastName("Sheik Alawdeen");
        return userRepository.save(users);
    }

    public Mono<Users> findUserByUserId(String userId) {
        Mono<Users> findResult = userRepository.findByUserId(userId);
        if (findResult == null) {
            System.out.println("Resource not found");
        }
        return findResult;
    }

    public Flux<Users> findAllUsers() {
        Flux<Users> findResult = userRepository.findAll();
        return findResult;
    }

}
