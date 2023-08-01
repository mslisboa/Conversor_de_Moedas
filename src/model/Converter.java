package model;

public class Converter extends Conversions {
    public Converter() {
        super();
    }
    
    // Verifica o tipo de coversão a ser realizada
    public double conversion(String optionConversion, double value) {
        switch (optionConversion) {
            case "De Real a Dólar":
                return convertRealDolar(value);

            case "De Real a Euro":
                return convertRealEuro(value);

            case "De Real a Libra Esterlina":
                return convertRealLibra(value);

            case "De Real a Peso Argentino":
                return convertRealPesoArgentino(value);

            case "De Real a Peso Chileno":
                return convertPesoChilenoReal(value);

            case "De Dólar a Real":
                return convertDolarReal(value);

            case "De Euro a Real":
                return convertEuroReal(value);

            case "De Libra Esterlina a Real":
                return convertLibraReal(value);

            case "De Peso Argentino a Real":
                return convertPesoArgentinoReal(value);

            case "De Peso Chileno a Real":
                return convertPesoChilenoReal(value);
        
            default:
                return value;
        }
    }
}