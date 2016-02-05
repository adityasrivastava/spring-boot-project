package com.sample.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.ws.model.Greeting;

@Repository
public interface GreetingRespository extends JpaRepository<Greeting, Long> {

	
	
//	private static BigInteger nextId;
//	private static Map<BigInteger, Greeting> greetingMap;
//	
//	private static Greeting save(Greeting greeting){
//		if(greetingMap == null){
//			greetingMap = new HashMap<BigInteger, Greeting>();
//			nextId = BigInteger.ONE;
//		}
//		
//		// if update
//		if(greeting.getId() != null){
//			Greeting oldGreeting = greetingMap.get(greeting.getId());
//			if(oldGreeting == null){
//				return null;
//			}
//			
//			greetingMap.remove(greeting.getId());
//			greetingMap.put(greeting.getId(), greeting);
//			return greeting;
//		}
//		
//		
//		// If create
//		greeting.setId(nextId);
//		nextId = nextId.add(BigInteger.ONE);
//		greetingMap.put(greeting.getId(), greeting);
//		return greeting;
//	}
//	
//	static{
//		Greeting g1 = new Greeting();
//		g1.setText("Hello!!!");
//		save(g1);
//		
//		Greeting g2 = new Greeting();
//		g1.setText("Hello1!!!");
//		save(g1);
//	}
//	
//	private static boolean remove(Long id){
//		Greeting deleteGreeting = greetingMap.remove(id);
//		if(deleteGreeting == null){
//			return false;
//		}
//		
//		return true;
//	}


	
	
}
