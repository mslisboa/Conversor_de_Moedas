package model;

public class Converter {
    // Realiza a conversão de Real para Dólar
    public double convertRealDolar(double value) {
        return value * 0.2116268;
    }

    // Realiza a conversão de Real para Euro
    public double convertRealEuro(double value) {
        return value * 0.1917068;
    }

    // Realiza a conversão de Real para Libra Esterlina
    public double convertRealLibra(double value) {
        return value * 0.1644466;
    }

    // Realiza a conversão de Real para Peso Argentino
    public double convertRealPesoArgentino(double value) {
        return value * 57.9038796;
    }

    // Realiza a conversão de Real para Peso Chileno
    public double convertRealPesoChileno(double value) {
        return value * 175.2848379;
    }

    // Realiza a conversão de Dólar para Real
    public double convertDolarReal(double value) {
        return value * 4.7252994;
    }

    // Realiza a conversão de Euro para Real
    public double convertEuroReal(double value) {
        return value * 5.2162991;
    }

    // Realiza a conversão de Libra Esterlina para Real
    public double convertLibraReal(double value) {
        return value * 6.0810014;
    }

    // Realiza a conversão de Peso Argentino para Real
    public double convertPesoArgentinoReal(double value) {
        return value * 0.01727;
    }

    // Realiza a conversão de Peso Chileno para Real
    public double convertPesoChilenoReal(double value) {
        return value * 0.005705;
    }

    // Verifica o tipo de coversão a ser realizada
    public double conversion(String optionConversion, double value) {
        double convertedValue = 0.0;
        
        if (optionConversion == "De Real a Dólar") {
            convertedValue = convertRealDolar(value);
        } else if (optionConversion == "De Real a Euro") {
            convertedValue = convertRealEuro(value);
        } else if (optionConversion == "De Real a Libra Esterlina") {
            convertedValue = convertRealLibra(value);
        } else if (optionConversion == "De Real a Peso Argentino") {
            convertedValue = convertRealPesoArgentino(value);
        } else if (optionConversion == "De Real a Peso Chileno")  {
            convertedValue = convertRealPesoChileno(value);
        } else if (optionConversion == "De Dólar a Real") {
            convertedValue = convertDolarReal(value);
        } else if (optionConversion == "De Euro a Real") {
            convertedValue = convertEuroReal(value);
        } else if (optionConversion == "De Libra Esterlina a Real") {
            convertedValue = convertLibraReal(value);
        } else if (optionConversion == "De Peso Argentino a Real") {
            convertedValue = convertPesoArgentinoReal(value);
        } else if (optionConversion == "De Peso Chileno a Real")  {
            convertedValue = convertPesoChilenoReal(value);
        }

        return convertedValue;
    }
}