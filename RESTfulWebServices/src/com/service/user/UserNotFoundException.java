package com.service.user;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

public class UserNotFoundException extends Exception {

				
		//return Response.status(Response.Status.NOT_FOUND).entity("User could not be found").build();
		//return Response.status(Response.Status.NOT_FOUND).build();
		
		private StatusType errorCode = Response.Status.NOT_FOUND;
		private String errorMsg = "User could not be located in get URL" ;
		
		public StatusType getErrorCode() {
			return errorCode;
		}
		public void setErrorCode(StatusType errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		

		
	}


