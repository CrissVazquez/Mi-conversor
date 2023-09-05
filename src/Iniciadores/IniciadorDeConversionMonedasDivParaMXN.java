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

public class IniciadorDeConversionMonedasDivParaMXN {
	
	 //De divisa extranjera para peso mexicano
    private static final String DOLAR_PARA_MXN = "De Dólar a pesos MXN";
    private static final String EURO_PARA_MXN = "De Euro a pesos MXN";
    private static final String LIBRA_ESTERLINA_PARA_MXN = "De Libra Esterlina a pesos MXN";
    private static final String PESO_ARGENTINO_PARA_MXN = "De Peso Argentino a pesos MXN";
    private static final String PESO_CHILENO_PARA_MXN = "De Peso Chileno a pesos MXN";
    private static final String FRANCO_SUIZO_PARA_MXN = "De Franco Suizo a pesos MXN";
    private static final String YEN_JAPONES_PARA_MXN = "De Yen Japones a pesos MXN";
    private static final String YUAN_CHINO_PARA_MXN = "De Yuan Chino a pesos MXN";
    
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
        
        	//De divisa extranjera para peso mexicano
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
        	case FRANCO_SUIZO_PARA_MXN : {
        		return convertidorDeMonedaFrancoSuizo.convertirParaMxn(moneda, BigDecimal.valueOf(valorInicial));
        	}
        	case YEN_JAPONES_PARA_MXN : {
        		return  convertidorDeMonedaYenJapones.convertirParaMxn(moneda, BigDecimal.valueOf(valorInicial));
        	}
        	case YUAN_CHINO_PARA_MXN : {
        		return convertidorDeMonedaYuanChino.convertirParaMxn(moneda, BigDecimal.valueOf(valorInicial));
        	}
        	default : throw new Exception("ELECCIÓN INVÁLIDA");
        	}
        }
}
