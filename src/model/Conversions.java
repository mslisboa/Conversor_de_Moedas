package model;

public class Conversions {
    private double realDolar;
    private double realEuro;
    private double realLibra;
    private double realPesoArgentino;
    private double realPesoChileno;
    private double dolarReal;
    private double euroReal;
    private double libraReal;
    private double pesoArgentinoReal;
    private double pesoChilenoReal;

    public Conversions() {
        // Cotação em 01/08/2022
        this.realDolar = 0.2094153;
        this.realEuro = 0.1908798;
        this.realLibra = 0.1642603;
        this.realPesoArgentino = 57.8368999;
        this.realPesoChileno = 176.584849;
        this.dolarReal = 4.7752003;
        this.euroReal = 5.238899;
        this.libraReal = 6.0878983;
        this.pesoArgentinoReal = 0.01729;
        this.pesoChilenoReal = 0.005663;
    }
    
    // Realiza a conversão de Real para Dólar
    public double convertRealDolar(double value) {
        return value * realDolar;
    }

    // Realiza a conversão de Real para Euro
    public double convertRealEuro(double value) {
        return value * realEuro;
    }

    // Realiza a conversão de Real para Libra Esterlina
    public double convertRealLibra(double value) {
        return value * realLibra;
    }

    // Realiza a conversão de Real para Peso Argentino
    public double convertRealPesoArgentino(double value) {
        return value * realPesoArgentino;
    }

    // Realiza a conversão de Real para Peso Chileno
    public double convertRealPesoChileno(double value) {
        return value * realPesoChileno;
    }

    // Realiza a conversão de Dólar para Real
    public double convertDolarReal(double value) {
        return value * dolarReal;
    }

    // Realiza a conversão de Euro para Real
    public double convertEuroReal(double value) {
        return value * euroReal;
    }

    // Realiza a conversão de Libra Esterlina para Real
    public double convertLibraReal(double value) {
        return value * libraReal;
    }

    // Realiza a conversão de Peso Argentino para Real
    public double convertPesoArgentinoReal(double value) {
        return value * pesoArgentinoReal;
    }

    // Realiza a conversão de Peso Chileno para Real
    public double convertPesoChilenoReal(double value) {
        return value * pesoChilenoReal;
    }
}