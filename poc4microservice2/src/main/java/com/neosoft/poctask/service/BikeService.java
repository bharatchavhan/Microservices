package com.neosoft.poctask.service;

import java.util.List;

import com.neosoft.poctask.model.Bikes;

public interface BikeService  {
	
	public List<Bikes> getAllBikes(int id);
	
	public Bikes saveBike(Bikes b);
	
	public void delteBike(int bid);
	
	public Bikes getBikeById(int id);

}
