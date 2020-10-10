/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategyexample;

/**
 *
 * @author eduardo
 */
public class CalculadoraImposto {
    
    public void realizarCalculo(Orcamento orcamento, Imposto impostoQualquer) {
        double resultado = impostoQualquer.calcular(orcamento);
        System.out.println("Imposto: " + resultado);
    }
    
}
