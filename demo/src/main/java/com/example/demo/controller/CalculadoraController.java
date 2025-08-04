package com.example.demo.controller;    

import com.example.demo.service.CalculadoraService;

public class CalculadoraController {
    private CalculadoraService service = new CalculadoraService();

    public int somarDoisNumeros(int a, int b){
        return service.somar(a,b);
    }
}