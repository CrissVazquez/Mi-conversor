package Convertidores;

import java.math.BigDecimal;

import Enums.Moneda;

public class ConvertidorDeMonedaPesoChileno extends ConvertidorDeMonedas {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnMxn) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaMoneda(moneda, valorEnMxn);
    }

    @Override
    public BigDecimal convertirParaMxn(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaMxn(moneda, valorEnMoneda);
    }
}
