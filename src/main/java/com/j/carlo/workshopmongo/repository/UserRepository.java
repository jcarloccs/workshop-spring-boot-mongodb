package com.j.carlo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j.carlo.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
