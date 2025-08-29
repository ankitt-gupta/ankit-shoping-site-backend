package com.ankit.resources.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

//	@ExceptionHandler(MyCustomException.class)
//    public ResponseEntity<String> handleMyCustomException(MyCustomException ex) {
//        return new ResponseEntity<>("Custom error message: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
//    }

	// Catch all other unhandled exceptions
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGenericException(Exception ex) {
		// Log the exception details for debugging
		System.err.println("An unhandled error occurred: " + ex.getMessage());
		return new ResponseEntity<>("An internal server error occurred.", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
