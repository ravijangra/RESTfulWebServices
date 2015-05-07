package com.service.user;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

@Provider
@Consumes(MediaType.TEXT_PLAIN)
public class MyMessageBodyReader implements MessageBodyReader<User> {

	@Override
	public boolean isReadable(Class<?> arg0, Type arg1, Annotation[] arg2,
			MediaType arg3) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public User readFrom(Class<User> type, Type genericType, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap<String, String> httpHeaders,
			InputStream entityStream) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		
		byte[] bytes = new byte[1024];
		int bytesRead = entityStream.read(bytes);
		String input = new String(bytes, 0, bytesRead);
		String[] stringArray = input.split("&");
		User user = new User();
		
		user.setUserid(stringArray[0]);
		user.setEmail(stringArray[1]);
				
		return user;
	}

}
