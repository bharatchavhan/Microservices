package com.neosoft.poctask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.neosoft.poctask.model.Bikes;
import com.neosoft.poctask.service.BikeServiceImp;


@SpringBootTest(classes=BikeServiceApplication.class)
@Import(BikeServiceImp.class)
@RunWith(SpringRunner.class)
public class BikeServiceApplicationTest {

	
	@Autowired
	BikeServiceImp service;
	@Test
	public void saveBikeTest() {
		Bikes bike= new Bikes();
		//List<Bikes> blist= new ArrayList<>();
		bike.setBid(5);
		bike.setBname("yamaha");
		bike.setId(12);
		bike.setPrice(12345);
		service.saveBike(bike);
		//user.setBlist(blist);
		
		assertEquals(service.getBikeById(5), bike);
		
	}
	
	@Test
	public void getbikewithIdTest() {
		List<Bikes> bike =service.getAllBikes(12);
		assertEquals(bike.size(), service.getAllBikes(12).size());
	}
	
	
	@Test
	public void deleteTest() {
		service.delteBike(5);
		assertNull(service.getBikeById(5));
	}
}
