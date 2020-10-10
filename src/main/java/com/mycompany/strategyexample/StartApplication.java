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
public class StartApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Icms icms = new Icms();
        Iss iss = new Iss();
        
        Orcamento orcamento = new Orcamento(100);
        
        CalculadoraImposto calculadora = new CalculadoraImposto();
        
        calculadora.realizarCalculo(orcamento, iss);
        calculadora.realizarCalculo(orcamento, icms);
        
    }
    
}
