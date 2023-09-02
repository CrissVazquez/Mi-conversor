package Interfaces;

import java.math.BigDecimal;

import Enums.Moneda1;

public interface MonedaConvertible2 {

	BigDecimal convertirParaMoneda (Moneda1 moneda, BigDecimal valorEnMxn);
    BigDecimal convertirParaMxn (Moneda1 moneda, BigDecimal valorEnMoneda);

}
