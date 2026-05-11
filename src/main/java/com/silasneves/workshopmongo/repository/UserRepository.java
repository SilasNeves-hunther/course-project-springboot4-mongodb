package com.silasneves.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.silasneves.workshopmongo.domain.User;


public interface UserRepository extends MongoRepository<User, String> {

}
