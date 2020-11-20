package br.edu.infnet.moedas;

public class Moeda {

    private double dolar;
    private double euro;
    private double real;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        
        this.dolar = dolar;
        this.real = dolar * 5;
        this.euro = this.real / 6;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        
        this.euro = euro;
        this.real = euro * 6;
        this.dolar = this.real / 5;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        
        this.real = real;
        this.dolar = real / 5;
        this.euro = real / 6;
    }
}
