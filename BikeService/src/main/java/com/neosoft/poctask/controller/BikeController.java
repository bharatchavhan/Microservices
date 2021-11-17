package com.neosoft.poctask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poctask.model.Bikes;
import com.neosoft.poctask.service.BikeService;



@RestController
@RequestMapping("/bike")
public class BikeController {
	
	
	
	@Autowired 
	BikeService bikeservice;
	
	@PostMapping("/saveBike")
	public String saveBooks(@RequestBody Bikes bike)
	{
		
		bikeservice.saveBike(bike);
		return "bike saved";
	}
	
	@GetMapping("/getAllBike/{id}")
	public List<Bikes> getAllBike(@PathVariable("id") int id)
	{
		return bikeservice.getAllBikes(id);
		
	}
	
	@GetMapping("/getBike/{id}")
	public Bikes getBike(@PathVariable("id") int id)
	{
		return bikeservice.getBikeById(id);
		
	}
	
	@DeleteMapping("/deleteBike/{bid}")
	public String deleteBike(@PathVariable("bid") int bid)
	{
		bikeservice.delteBike(bid);
		return "bike deleted";
	}

}
