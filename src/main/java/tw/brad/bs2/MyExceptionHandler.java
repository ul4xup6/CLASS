package tw.brad.bs2;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handler(RuntimeException exception) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("ERROR 1:" + exception.toString());
	}
	
	
//	@ExceptionHandler(FileNotFoundException.class)
//	public ResponseEntity<String> handler(FileNotFoundException exception) {
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body("ERROR 2:" + exception.toString());
//	}
	
	@ExceptionHandler(IOException.class)
	public ResponseEntity<String> handler(IOException exception) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("ERROR 3:" + exception.toString());
	}
	
}
