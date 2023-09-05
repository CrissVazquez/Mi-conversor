package Iniciadores;

import java.math.BigDecimal;

import Convertidores.ConvertidorDeMonedaDolar;
import Convertidores.ConvertidorDeMonedaEuro;
import Convertidores.ConvertidorDeMonedaFrancoSuizo;
import Convertidores.ConvertidorDeMonedaLibraEsterlina;
import Convertidores.ConvertidorDeMonedaPesoArgentino;
import Convertidores.ConvertidorDeMonedaPesoChileno;
import Convertidores.ConvertidorDeMonedaYenJapones;
import Convertidores.ConvertidorDeMonedaYuanChino;
import Convertidores.ConvertidorDeMonedas;
import Enums.Moneda;

public class IniciadorDeConversionMonedasMXNParaDiv {
	
	//De pesos mexicanos a divisa extranjera
	private static final String MXN_PARA_DOLAR = "De pesos MXN a Dólar";
    private static final String MXN_PARA_EURO = "De pesos MXN a Euro";
    private static final String MXN_PARA_LIBRA_ESTERLINA = "De pesos MXN a Libra Esterlina";
    private static final String MXN_PARA_PESO_ARGENTINO = "De pesos MXN a Peso Argentino";
    private static final String MXN_PARA_PESO_CHILENO = "De pesos MXN a Peso Chileno";
    private static final String MXN_PARA_FRANCO_SUIZO = "De pesos MXN a Franco Suizo";
    private static final String MXN_PARA_YEN_JAPONES = "De pesos MXN a Yen Japones";
    private static final String MXN_PARA_YUAN_CHINO = "De pesos MXN a Yuan Chino";
    
    private ConvertidorDeMonedas convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
    private ConvertidorDeMonedas convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
    private ConvertidorDeMonedas convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
    private ConvertidorDeMonedas convertidorDeMonedaPesoArgentino = new ConvertidorDeMonedaPesoArgentino();
    private ConvertidorDeMonedas convertidorDeMonedaPesoChileno = new ConvertidorDeMonedaPesoChileno();
    private ConvertidorDeMonedas convertidorDeMonedaFrancoSuizo = new ConvertidorDeMonedaFrancoSuizo();
    private ConvertidorDeMonedas convertidorDeMonedaYenJapones = new ConvertidorDeMonedaYenJapones();
    private ConvertidorDeMonedas convertidorDeMonedaYuanChino = new ConvertidorDeMonedaYuanChino();
    
    private Moneda moneda;

    public BigDecimal operarConversion(String operacionDeMonedas, double valorInicial) throws Exception {

        switch (operacionDeMonedas) {
        
        	//De pesos mexicanos a divisa extranjera
            case MXN_PARA_DOLAR :  {
                return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_PARA_EURO : {
                return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_PARA_LIBRA_ESTERLINA : {
                return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_PARA_PESO_ARGENTINO : {
                return convertidorDeMonedaPesoArgentino.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_PARA_PESO_CHILENO : {
                return convertidorDeMonedaPesoChileno.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_PARA_FRANCO_SUIZO : {
                return convertidorDeMonedaFrancoSuizo.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_PARA_YEN_JAPONES : {
                return convertidorDeMonedaYenJapones.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_PARA_YUAN_CHINO : {
                return convertidorDeMonedaYuanChino.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            default : throw new Exception("ELECCIÓN INVÁLIDA");
        }
    }
}
