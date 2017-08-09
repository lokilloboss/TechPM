package com.bizpro.techpm.repository;

import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

@SuppressWarnings("unused")
public class AbstractIntegrationTest {

	static final String COLLECTION = "herramienta";

	@Autowired
	MongoOperations operations;
	
	//herramienta herramienta;
	
	@Before
	public void setUp() {

		operations.dropCollection(COLLECTION);
		
//		add(new herramienta(0, "Axway"));
//		add(new herramienta(0, "Angular"));
//		add(new herramienta(0, "MongoDB"));
	}
}
