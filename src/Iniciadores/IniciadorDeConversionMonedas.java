package Iniciadores;

import java.math.BigDecimal;

import Convertidores.ConvertidorDeMonedaDolar1;
import Convertidores.ConvertidorDeMonedaEuro1;
import Convertidores.ConvertidorDeMonedaLibraEsterlina1;
import Convertidores.ConvertidorDeMonedaPesoArgentino1;
import Convertidores.ConvertidorDeMonedaPesoChileno1;
import Convertidores.ConvertidorDeMonedas;
import Enums.Moneda1;

public class IniciadorDeConversionMonedas {
	
	private static final String MXN_PARA_DOLAR = "De pesos MXN a Dólar";
    private static final String MXN_PARA_EURO = "De pesos MXN a Euro";
    private static final String MXN_PARA_LIBRA_ESTERLINA = "De pesos MXN a Libra Esterlina";
    private static final String MXN_PARA_PESO_ARGENTINO = "De pesos MXN a Peso Argentino";
    private static final String MXN_PARA_PESO_CHILENO = "De pesos MXN a Peso Chileno";
    private static final String DOLAR_PARA_MXN = "De Dólar a pesos MXN";
    private static final String EURO_PARA_MXN = "De Euro a pesos MXN";
    private static final String LIBRA_ESTERLINA_PARA_MXN = "De Libra Esterlina a pesos MXN";
    private static final String PESO_ARGENTINO_PARA_MXN = "De Peso Argentino a pesos MXN";
    private static final String PESO_CHILENO_PARA_MXN = "De Peso Chileno a pesos MXN";
    private ConvertidorDeMonedas convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar1();
    private ConvertidorDeMonedas convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro1();
    private ConvertidorDeMonedas convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina1();
    private ConvertidorDeMonedas convertidorDeMonedaPesoArgentino = new ConvertidorDeMonedaPesoArgentino1();
    private ConvertidorDeMonedas convertidorDeMonedaPesoChileno = new ConvertidorDeMonedaPesoChileno1();

    private Moneda1 moneda;

    public BigDecimal operarConversion(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
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
            case DOLAR_PARA_MXN : {
                return convertidorDeMonedaDolar.convertirParaMxn(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PARA_MXN : {
                return convertidorDeMonedaEuro.convertirParaMxn(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PARA_MXN : {
                return convertidorDeMonedaLibraEsterlina.convertirParaMxn(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PARA_MXN : {
                return  convertidorDeMonedaPesoArgentino.convertirParaMxn(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_CHILENO_PARA_MXN : {
                return convertidorDeMonedaPesoChileno.convertirParaMxn(moneda, BigDecimal.valueOf(valorInicial));
            }
            default : throw new Exception("ELECCIÓN INVÁLIDA");
        }

    }

}
