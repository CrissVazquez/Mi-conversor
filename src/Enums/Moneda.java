package Enums;

import java.math.BigDecimal;

public enum Moneda {
	
	//Cotizacion hecha el 05/09/23
    DOLAR(BigDecimal.valueOf(17.26)),
    EURO(BigDecimal.valueOf(18.59)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(21.72)),
    PESO_ARGENTINO(BigDecimal.valueOf(0.049)),
    PESO_CHILENO(BigDecimal.valueOf(0.0020)),
	FRANCO_SUIZO(BigDecimal.valueOf(19.48)),
	YEN_JAPONES(BigDecimal.valueOf(0.12)),
	YUAN_CHINO(BigDecimal.valueOf(2.37));
	
    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }

}
