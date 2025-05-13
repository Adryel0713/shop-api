package com.nullpointerx.shop.exceptions;

import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RecursoNaoEncontradoException.class)
    public ResponseEntity<Object> handleRecursoNaoEncontradoException(RecursoNaoEncontradoException ex){
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("timestamp", LocalDateTime.now());
        map.put("status",HttpStatus.NOT_FOUND.value());
        map.put("error", "Recurso não encontrado");
        map.put("message", ex.getMessage());
        return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGenericsException(Exception ex){
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("timestamp", LocalDateTime.now());
        map.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        map.put("error", "Erro interno no servidor");
        map.put("message", ex.getMessage());
        return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
