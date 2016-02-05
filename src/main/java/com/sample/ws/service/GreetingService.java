package com.sample.ws.service;

import java.math.BigInteger;
import java.util.Collection;

import com.sample.ws.model.Greeting;

public interface GreetingService {
	
	Collection<Greeting> findAll();
	
	Greeting findOne(Long id);
	
	Greeting create(Greeting greeting);
	
	Greeting update(Greeting greeting);
	
	void delete(Long id);
}
