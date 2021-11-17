package com.neosoft.poctask.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="bike")
public class Bikes {
	
	@Id
	private int bid;
	
	private String bname;
	
	private float price;
	
	private int id;

}
