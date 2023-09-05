package Convertidores;

import java.math.BigDecimal;

import Enums.Moneda;

public class ConvertidorDeMonedaPesoArgentino extends ConvertidorDeMonedas {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnMxn) {
        moneda = Moneda.PESO_ARGENTINO;
        return super.convertirParaMoneda(moneda, valorEnMxn);
    }

    @Override
    public BigDecimal convertirParaMxn(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.PESO_ARGENTINO;
        return super.convertirParaMxn(moneda, valorEnMoneda);
    }
}
