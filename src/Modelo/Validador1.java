package Modelo;

public class Validador1 {
    public boolean verificar(String operacion){
;
        boolean esNumerico =  operacion.matches("[+-]?\\d*(\\.\\d+)?");

        return esNumerico;
    }

    public double transformarEnDouble(String operacion){
        double valorNumerico = Double.parseDouble(operacion);
        return valorNumerico;
    }
}
