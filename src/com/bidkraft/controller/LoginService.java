package com.bidkraft.controller;

import java.util.Map;

import com.bidkraft.constants.ServiceKeys;
import com.bidkraft.entities.Bid;
import com.bidkraft.model.KraftRequest;
import com.bidkraft.services.KraftService;

public class LoginService implements KraftService<Bid>{

	@Override
	public Bid service(KraftRequest request) {
		
		Bid bid = new Bid();
		
		if(request.getEntities().containsKey(ServiceKeys.LOGIN))
		{
			Map<String,String> usermap=(Map<String,String>)request.getEntities().get(ServiceKeys.LOGIN);
			
			System.out.println("In Login Service:"+request.getEntities().get(ServiceKeys.LOGIN));
		
			
			System.out.println("User info"+usermap.get("userid"));
			
			bid.setName("My Bid");
			bid.setValue(1000);
			
			/*
			 * Session session=HibernateUtil.getSessionFactory().openSession();
			 * session.beginTransaction();
			 * Test test=new Test(1, "Hi");
			 * session.save(test); 
			 * session.getTransaction().commit();
			 */
		}
		
		return bid;

	}

}
