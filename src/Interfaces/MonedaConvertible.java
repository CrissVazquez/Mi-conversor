package Interfaces;

import java.math.BigDecimal;

import Enums.Moneda;

public interface MonedaConvertible {

	BigDecimal convertirParaMoneda (Moneda moneda, BigDecimal valorEnMxn);
    BigDecimal convertirParaMxn (Moneda moneda, BigDecimal valorEnMoneda);

}
