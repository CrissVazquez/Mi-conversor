package Convertidores;

import java.math.BigDecimal;

import Enums.Moneda1;

public class ConvertidorDeMonedaDolar1 extends ConvertidorDeMonedas {

    @Override
    public BigDecimal convertirParaMoneda(Moneda1 moneda, BigDecimal valorEnMxn) {
        moneda = Moneda1.DOLAR;
        return super.convertirParaMoneda(moneda, valorEnMxn);
    }

    @Override
    public BigDecimal convertirParaMxn(Moneda1 moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda1.DOLAR;
        return super.convertirParaMxn(moneda, valorEnMoneda);
    }
}