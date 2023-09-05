package Convertidores;

import java.math.BigDecimal;

import Enums.Moneda;

public class ConvertidorDeMonedaYenJapones extends ConvertidorDeMonedas{

	 @Override
	 public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnMxn) {
		 moneda = Moneda.YEN_JAPONES;
		 return super.convertirParaMoneda(moneda, valorEnMxn);
	 }

	 @Override
	 public BigDecimal convertirParaMxn(Moneda moneda, BigDecimal valorEnMoneda) {
		 moneda = Moneda.YEN_JAPONES;
		 return super.convertirParaMxn(moneda, valorEnMoneda);
	 }
}
