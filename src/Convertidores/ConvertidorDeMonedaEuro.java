package Convertidores;

import java.math.BigDecimal;

import Enums.Moneda;

public class ConvertidorDeMonedaEuro extends ConvertidorDeMonedas {
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnMxn) {
        moneda = Moneda.EURO;
        return super.convertirParaMoneda(moneda, valorEnMxn);
    }

    @Override
    public BigDecimal convertirParaMxn(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.EURO;
        return super.convertirParaMxn(moneda, valorEnMoneda);
    }
}
