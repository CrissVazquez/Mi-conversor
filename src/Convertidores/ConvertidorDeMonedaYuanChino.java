package Convertidores;

import java.math.BigDecimal;

import Enums.Moneda;

public class ConvertidorDeMonedaYuanChino extends ConvertidorDeMonedas {
	
	  @Override
	  public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnMxn) {
	      moneda = Moneda.YUAN_CHINO;
	      return super.convertirParaMoneda(moneda, valorEnMxn);
	  }

	  @Override
	  public BigDecimal convertirParaMxn(Moneda moneda, BigDecimal valorEnMoneda) {
		  moneda = Moneda.YUAN_CHINO;
	      return super.convertirParaMxn(moneda, valorEnMoneda);
	  }
	

}
