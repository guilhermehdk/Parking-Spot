package com.api.parkingcontrol.infra.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    //JSON com campos nulos ou inválidos
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> methodArgumentNotValidException(MethodArgumentNotValidException ex) {
        var errors = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(errors.stream().map(ErrorValidationResponse::new).toList());
    }

    //Requisição com JSON com formatação incorreta
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Object> httpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    //Requisição com JSON com formatação incorreta
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<Object> methodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    //JSON com dados duplicados no banco de dados
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<Object> sqlIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    //Registro não encotrado no banco de dados
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> noSuchElementException(NoSuchElementException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking spot not found");
    }

    @AllArgsConstructor
    @Getter
    private static class ErrorValidationResponse {
        private String field;
        private String message;

        public ErrorValidationResponse(FieldError error) {
            this(error.getField(), error.getDefaultMessage());
        }
    }

//    private record ErrorValidationResponse (String field, String message){
//        public ErrorValidationResponse (FieldError fieldError){
//            this(fieldError.getField(), fieldError.getDefaultMessage());
//        }
//    }
}

