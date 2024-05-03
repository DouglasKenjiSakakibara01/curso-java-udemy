package com.projeto2.workshopmongodb.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projeto2.workshopmongodb.entidades.*;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}