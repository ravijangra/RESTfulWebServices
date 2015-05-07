package com.service.user;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.TEXT_PLAIN)
public class MyMessageBodyWriter implements MessageBodyWriter<User> {

	@Override
	public long getSize(User user, Class<?> arg1, Type type, Annotation[] annotations,
			MediaType mediaTypes) {
		// TODO Auto-generated method stub
		return convertUserToString(user).length();
	}

	@Override
	public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2,
			MediaType arg3) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void writeTo(User user, Class<?> arg1, Type arg2, Annotation[] arg3,
			MediaType arg4, MultivaluedMap<String, Object> arg5,
			OutputStream entityStream) throws IOException, WebApplicationException {
		
			String output = convertUserToString(user);
			entityStream.write(output.getBytes());
		
		
	}

	private String convertUserToString(User user) {
		// TODO Auto-generated method stub
		
		return user.getUserid()+"&"+user.getEmail();
		
	}

}
