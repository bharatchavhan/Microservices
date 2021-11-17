package com.neosoft.poctask.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.neosoft.poctask.model.Bikes;

@Repository
public interface BikeRepository extends MongoRepository<Bikes, Integer>  {
	
	
	@Query( value = "{bid : ?0}", delete = true)
	public void deleteBikesByBid(Integer bid);
	
	@Query( value = "{id : ?0}")
	public List<Bikes> findAllById(int id);
	
	@Query( value = "{bid : ?0}")
	public Bikes findAllByBId(int bid);

}
