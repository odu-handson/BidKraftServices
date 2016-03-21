package com.bidkraft.controller;

import java.io.IOException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bidkraft.model.KraftRequest;
import com.bidkraft.model.KraftResponse;

@Path("/rest")
public class GenericServiceController {

	@POST
	@Path("/login")
	public Response getMsg(String request) {
		return Response.status(200).entity(executeServices(request)).build();

	}

	@POST
	@Path("/secure/mybids")
	public Response getMyBids(String request) {
		return Response.status(200).entity("").build();
	}
	
	
	private String executeServices(String request)
	{
		ObjectMapper mapper = new ObjectMapper();
		String output = "";

		try {

			KraftRequest kraftRequest = mapper.readValue(request,
					KraftRequest.class);

			KraftResponse kraftResponse = new KraftResponse("success");
			
			//call the master service
			if(kraftRequest.getMasterKey().equals("LOGIN"))
			{
				LoginService loginService=new LoginService();
				Object response=loginService.service(kraftRequest);
				
				kraftResponse.getKeys().add(kraftRequest.getMasterKey());
				kraftResponse.getEntities().put(kraftRequest.getMasterKey(),response);
			}
			
			output = mapper.writeValueAsString(kraftResponse);

		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}
	
}