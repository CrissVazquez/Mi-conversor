package Enums;

import java.math.BigDecimal;

public enum Moneda1 {
	
	//Cotizacion hecha el 24/08/23
    DOLAR(BigDecimal.valueOf(16.83)),
    EURO(BigDecimal.valueOf(18.15)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(21.15)),
    PESO_ARGENTINO(BigDecimal.valueOf(0.048)),
    PESO_CHILENO(BigDecimal.valueOf(0.0020));

    private BigDecimal FACTOR_CONVERSION;

    Moneda1(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }

}
