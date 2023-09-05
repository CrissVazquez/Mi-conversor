package Convertidores;

import java.math.BigDecimal;
import java.math.RoundingMode;

import Enums.Moneda;
import Interfaces.MonedaConvertible;
	
public class ConvertidorDeMonedas implements MonedaConvertible{

	@Override
	public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnMxn) {
		return valorEnMxn.divide(moneda.getFACTOR_CONVERSION(), 2, RoundingMode.HALF_UP);
	}

	@Override
	public BigDecimal convertirParaMxn(Moneda moneda, BigDecimal valorEnMoneda) {
		return valorEnMoneda.multiply(moneda.getFACTOR_CONVERSION());
	}
	
}
