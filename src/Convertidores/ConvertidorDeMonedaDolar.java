package Convertidores;

import java.math.BigDecimal;

import Enums.Moneda;

public class ConvertidorDeMonedaDolar extends ConvertidorDeMonedas {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnMxn) {
        moneda = Moneda.DOLAR;
        return super.convertirParaMoneda(moneda, valorEnMxn);
    }

    @Override
    public BigDecimal convertirParaMxn(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.DOLAR;
        return super.convertirParaMxn(moneda, valorEnMoneda);
    }
}