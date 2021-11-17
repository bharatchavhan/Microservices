package com.neosoft.poctask.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.neosoft.poctask.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
	
	
	@Query("{id :?0}")                                                  
    public User getUserById(Integer id);
	
	@Query( value = "{id : ?0}", delete = true)
	public void deleteUserById(Integer id);

}
