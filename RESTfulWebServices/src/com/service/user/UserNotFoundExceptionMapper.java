package com.service.user;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UserNotFoundExceptionMapper implements ExceptionMapper<UserNotFoundException> {

	@Override
	public Response toResponse(UserNotFoundException exception) {

		//return Response.status(exception.getErrorCode()).entity(exception.getErrorMsg()).build();
		return Response.status(exception.getErrorCode()).build();

	}

}
