package model;

public class Converter {
    public double convertRealDolar(double value) {
        return value * 0.2116268;
    }

    public double convertRealEuro(double value) {
        return value * 0.1917068;
    }

    public double convertRealLibra(double value) {
        return value * 0.1644466;
    }

    public double convertRealPesoArgentino(double value) {
        return value * 57.9038796;
    }

    public double convertRealPesoChileno(double value) {
        return value * 175.2848379;
    }

    public double convertDolarReal(double value) {
        return value * 4.7252994;
    }

    public double convertEuroReal(double value) {
        return value * 5.2162991;
    }

    public double convertLibraReal(double value) {
        return value * 6.0810014;
    }

    public double convertPesoArgentinoReal(double value) {
        return value * 0.01727;
    }

    public double convertPesoChilenoReal(double value) {
        return value * 0.005705;
    }

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