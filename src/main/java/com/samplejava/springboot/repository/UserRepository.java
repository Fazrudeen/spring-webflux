package com.samplejava.springboot.repository;

import com.samplejava.springboot.model.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public interface UserRepository extends ReactiveCrudRepository<Users, Long> {

    Mono<Users> findByUserId(String userId);

}