package com.neosoft.poctask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.poctask.model.Bikes;
import com.neosoft.poctask.repository.BikeRepository;

@Service
public class BikeServiceImp  implements BikeService{

	@Autowired
	BikeRepository repo;
	
	
	@Override
	public List<Bikes> getAllBikes(int id) {
		
		return repo.findAllById(id);
	}

	@Override
	public Bikes saveBike(Bikes bike) {
		
		return repo.insert(bike);
	}

	@Override
	public void delteBike(int bid) {
	
		repo.deleteBikesByBid(bid);
		
	}

	@Override
	public Bikes getBikeById(int bid) {
		return repo.findAllByBId(bid);
	}
	
	
	

}
