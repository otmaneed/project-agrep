package com.Youcode.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Youcode.Exeptions.ErrorExeptions;
import com.Youcode.Exeptions.General_Exeptions;

@ControllerAdvice
public class ExeptionController {
	@ExceptionHandler
	public ResponseEntity<General_Exeptions>HandleAccesDeniedExeptions(ErrorExeptions E){
		General_Exeptions GE = new General_Exeptions(HttpStatus.NOT_FOUND, E.getMessage());
		return new ResponseEntity<General_Exeptions>(GE,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<General_Exeptions>HandleAccesDeniedExeptionsBad(Exception E){
		General_Exeptions GE = new General_Exeptions(HttpStatus.BAD_REQUEST,"jjfjfj");
		return new ResponseEntity<General_Exeptions>(GE,HttpStatus.BAD_REQUEST);
	}

}
