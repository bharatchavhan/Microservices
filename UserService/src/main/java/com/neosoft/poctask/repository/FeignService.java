package com.neosoft.poctask.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.neosoft.poctask.model.Bikes;
//@Repository
//@FeignClient(name= "bikeservice")//,url="http://BIKESERVICE/bike")
public interface FeignService {
	
	@GetMapping("/getAllBike/{id}")
	List<Bikes> getAllBikesByUserId(int id);

}
