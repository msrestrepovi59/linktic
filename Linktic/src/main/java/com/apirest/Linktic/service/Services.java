package com.apirest.Linktic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.Linktic.models.*;
import com.apirest.Linktic.repository.AmparoRepository;
import com.apirest.Linktic.repository.AseguradoRepository;
import com.apirest.Linktic.repository.PrimaRepository;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class Services {

    @Autowired
    private AseguradoRepository aseguradoRepository;
    @Autowired
    private AmparoRepository amparoRepository;
    @Autowired
    private PrimaRepository primaRepository;

    public LiquidacionResponse calcularLiquidacion(LiquidacionRequest request) {
    	
    
        if (request.getValorAsegurado() <= 0) {
            throw new RuntimeException("El valor del asegurado debe ser mayor que 0");
        }
        if (request.gettipo_identificacion() <= 0 || request.getnum_identificacion() <= 0) {
            throw new RuntimeException("Todos los datos son obligatorios");
        }
        
        Asegurado asegurado = aseguradoRepository.findById(request.getnum_identificacion())
                .orElseThrow(() -> new RuntimeException("Asegurado no encontrado"));

        int edad = Period.between(asegurado.getFechaNacimiento(), LocalDate.now()).getYears();

        List<Amparo> amparos = amparoRepository.findAll();
        List<Prima> primas = primaRepository.findAll();

        List<LiquidacionItem> items = new ArrayList<>();
        double valorTotal = 0;

        for (Prima prima : primas) {
            if (edad >= prima.getEdadMinima() && edad <= prima.getEdadMaxima()) {
                Amparo amparo = amparoRepository.findById(prima.getCodigo())
                        .orElseThrow(() -> new RuntimeException("Amparo no encontrado"));

                double valorPrima = request.getValorAsegurado() * prima.getPorcentajePrima();
                items.add(new LiquidacionItem(prima.getCodigo(), amparo.getNombre(), valorPrima));
                valorTotal += valorPrima;
            }
        }

        if (items.isEmpty()) {
            return new LiquidacionResponse(request.gettipo_identificacion(), request.getnum_identificacion(), request.getValorAsegurado(), new ArrayList<>(), 0);
        }

        return new LiquidacionResponse(request.gettipo_identificacion(), request.getnum_identificacion(), request.getValorAsegurado(), items, valorTotal);
    }
}

