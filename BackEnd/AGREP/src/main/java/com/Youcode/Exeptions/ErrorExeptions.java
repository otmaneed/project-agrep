package com.Youcode.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code = HttpStatus.NOT_FOUND, reason="input not found")
public class ErrorExeptions extends RuntimeException{
		public ErrorExeptions(String message) { 
			super(message);
		}

}
