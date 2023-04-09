package org.example.juros;

import org.example.CalculaJuros;

public class JurosNubank implements CalculaJuros {
    @Override
    public double calculoDeJuros(double valor) {
        double juros = 1.02;
        return  valor * juros;
    }
}
