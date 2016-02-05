package com.sample.ws.service;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.ws.model.Greeting;
import com.sample.ws.repository.GreetingRespository;

@Service
public class GreetingServiceBean implements GreetingService {

	@Autowired
	GreetingRespository greetingRespository;

	@Override
	public Collection<Greeting> findAll() {
		Collection<Greeting> greetings = greetingRespository.findAll();
		return greetings;
	}

	@Override
	public Greeting findOne(Long id) {
		Greeting greeting = greetingRespository.findOne(id);
		return greeting;
	}

	@Override
	public Greeting create(Greeting greeting) {
		
		if(greeting.getId() == null){
			return null;
		}
		
		
		Greeting savedGreeting = greetingRespository.save(greeting);
		return savedGreeting;
	}

	@Override
	public Greeting update(Greeting greeting) {
		
		if(greeting.getId() == null){
			return null;
		}
		
		
		Greeting updateGreeting = greetingRespository.save(greeting);
		return updateGreeting;
	}

	@Override
	public void delete(Long id) {
		greetingRespository.delete(id);
	}


}
