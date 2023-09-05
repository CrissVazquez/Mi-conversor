package Convertidores;

import java.math.BigDecimal;

import Enums.Moneda;

public class ConvertidorDeMonedaLibraEsterlina extends ConvertidorDeMonedas {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnMxn) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaMoneda(moneda, valorEnMxn);
    }

    @Override
    public BigDecimal convertirParaMxn(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaMxn(moneda, valorEnMoneda);
    }
}
