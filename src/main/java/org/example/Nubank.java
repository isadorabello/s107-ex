package org.example;

import org.example.juros.JurosNubank;

public class Nubank extends CalculadoraDeJuros{
    public Nubank() {
        calculaJuros = new JurosNubank();
    }
}
