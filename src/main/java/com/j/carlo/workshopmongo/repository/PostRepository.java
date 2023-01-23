package com.j.carlo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j.carlo.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
