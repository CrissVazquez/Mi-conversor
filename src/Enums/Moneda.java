package Enums;

import java.math.BigDecimal;

public enum Moneda {
	
	//Cotizacion hecha el 24/08/23
    DOLAR(BigDecimal.valueOf(16.83)),
    EURO(BigDecimal.valueOf(18.15)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(21.15)),
    PESO_ARGENTINO(BigDecimal.valueOf(0.048)),
    PESO_CHILENO(BigDecimal.valueOf(0.0020)),
	FRANCO_SUIZO(BigDecimal.valueOf(19.29)),
	YEN_JAPONES(BigDecimal.valueOf(0.12)),
	YUAN_CHINO(BigDecimal.valueOf(2.35));
	
    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }

}
