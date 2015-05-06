package com.service.user;

import javax.ws.rs.*;

@Path("/user/service")
public class UserServices {
	
	@PUT
	@Path("/create")
	public void addUser(){
		System.out.println("Inside addUser method");
	}
	@GET
	public void getUser(){
		System.out.println("Inside getUser method");
	}
	@POST
	public void updateUser(){
		System.out.println("Inside updateUser method of UserServices class");
	}
	@DELETE
	public void deleteUser(){
		System.out.println("Inside deleteUser method");
	}

}
