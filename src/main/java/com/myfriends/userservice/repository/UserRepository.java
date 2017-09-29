package com.myfriends.userservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.myfriends.userservice.model.User;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}
