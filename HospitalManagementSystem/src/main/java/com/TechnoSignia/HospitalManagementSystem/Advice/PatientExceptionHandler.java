package com.TechnoSignia.HospitalManagementSystem.Advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PatientExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handlerException(MethodArgumentNotValidException ex){
		Map<String, String> errormap=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errormap.put(error.getField(), error.getDefaultMessage());
		});
		return errormap;
	}

}
