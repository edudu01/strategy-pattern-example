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
public class Iss implements Imposto{

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
    
}
