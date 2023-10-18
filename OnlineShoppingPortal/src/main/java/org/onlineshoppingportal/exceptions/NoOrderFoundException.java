package org.onlineshoppingportal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason=" User already logged in",code=HttpStatus.NOT_FOUND)
public class NoOrderFoundException extends RuntimeException{

	public NoOrderFoundException(){
		super("No Order Found");
	}
}
