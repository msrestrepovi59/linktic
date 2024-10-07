package com.apirest.Linktic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.apirest.Linktic.models.LiquidacionRequest;
import com.apirest.Linktic.models.LiquidacionResponse;
import com.apirest.Linktic.service.Services;



@RestController
@RequestMapping("/api/liquidacion")
public class controllers {

    @Autowired
    private Services Service;

    @PostMapping
    public ResponseEntity<?> calcularLiquidacion(@RequestBody LiquidacionRequest request) {
        try {
            LiquidacionResponse response = Service.calcularLiquidacion(request);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }}

