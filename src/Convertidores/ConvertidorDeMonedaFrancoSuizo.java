package Convertidores;

import java.math.BigDecimal;

import Enums.Moneda;

public class ConvertidorDeMonedaFrancoSuizo extends ConvertidorDeMonedas {
	
	 @Override
	    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnMxn) {
	        moneda = Moneda.FRANCO_SUIZO;
	        return super.convertirParaMoneda(moneda, valorEnMxn);
	    }

	    @Override
	    public BigDecimal convertirParaMxn(Moneda moneda, BigDecimal valorEnMoneda) {
	        moneda = Moneda.FRANCO_SUIZO;
	        return super.convertirParaMxn(moneda, valorEnMoneda);
	    }

}
