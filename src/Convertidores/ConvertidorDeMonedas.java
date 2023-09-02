package Convertidores;

import java.math.BigDecimal;
import java.math.RoundingMode;

import Enums.Moneda1;
import Interfaces.MonedaConvertible2;
	
public class ConvertidorDeMonedas implements MonedaConvertible2{

	@Override
	public BigDecimal convertirParaMoneda(Moneda1 moneda, BigDecimal valorEnMxn) {
		return valorEnMxn.divide(moneda.getFACTOR_CONVERSION(), 2, RoundingMode.HALF_UP);
	}

	@Override
	public BigDecimal convertirParaMxn(Moneda1 moneda, BigDecimal valorEnMoneda) {
		return valorEnMoneda.multiply(moneda.getFACTOR_CONVERSION());
	}
	
}
