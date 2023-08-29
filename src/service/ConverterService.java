package service;

import java.math.BigDecimal;

public class ConverterService {
    private BigDecimal realDolar;
    private BigDecimal realEuro;
    private BigDecimal realLibra;
    private BigDecimal realPesoArgentino;
    private BigDecimal realPesoChileno;
    private BigDecimal dolarReal;
    private BigDecimal euroReal;
    private BigDecimal libraReal;
    private BigDecimal pesoArgentinoReal;
    private BigDecimal pesoChilenoReal;

    public ConverterService() {
        // Cotação em 01/08/2022
        this.realDolar = new BigDecimal("0.2094153");
        this.realEuro = new BigDecimal("0.1908798");
        this.realLibra = new BigDecimal("0.1642603");
        this.realPesoArgentino = new BigDecimal("57.8368999");
        this.realPesoChileno = new BigDecimal("176.584849");
        this.dolarReal = new BigDecimal("4.7752003");
        this.euroReal = new BigDecimal("5.238899");
        this.libraReal = new BigDecimal("6.0878983");
        this.pesoArgentinoReal = new BigDecimal("0.01729");
        this.pesoChilenoReal = new BigDecimal("0.005663");
    }
    
    // Realiza a conversão de Real para Dólar
    public BigDecimal convertRealDolar(String value) {
        // return value * realDolar;
        return new BigDecimal(value).multiply(realDolar);
    }

    // Realiza a conversão de Real para Euro
    public BigDecimal convertRealEuro(String value) {
        return new BigDecimal(value).multiply(realEuro);
    }

    // Realiza a conversão de Real para Libra Esterlina
    public BigDecimal convertRealLibra(String value) {
        return new BigDecimal(value).multiply(realLibra);
    }

    // Realiza a conversão de Real para Peso Argentino
    public BigDecimal convertRealPesoArgentino(String value) {
        return new BigDecimal(value).multiply(realPesoArgentino);
    }

    // Realiza a conversão de Real para Peso Chileno
    public BigDecimal convertRealPesoChileno(String value) {
        return new BigDecimal(value).multiply(realPesoChileno);
    }

    // Realiza a conversão de Dólar para Real
    public BigDecimal convertDolarReal(String value) {
        return new BigDecimal(value).multiply(dolarReal);
    }

    // Realiza a conversão de Euro para Real
    public BigDecimal convertEuroReal(String value) {
        return new BigDecimal(value).multiply(euroReal);
    }

    // Realiza a conversão de Libra Esterlina para Real
    public BigDecimal convertLibraReal(String value) {
        return new BigDecimal(value).multiply(libraReal);
    }

    // Realiza a conversão de Peso Argentino para Real
    public BigDecimal convertPesoArgentinoReal(String value) {
        return new BigDecimal(value).multiply(pesoArgentinoReal);
    }

    // Realiza a conversão de Peso Chileno para Real
    public BigDecimal convertPesoChilenoReal(String value) {
        return new BigDecimal(value).multiply(pesoChilenoReal);
    }
}