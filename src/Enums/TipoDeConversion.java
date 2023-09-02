package Enums;

public enum TipoDeConversion {
	
     //Divisas	
	 MXN_PARA_DOLAR("De pesos MXN a Dólar"),
	 MXN_PARA_EURO("De pesos MXN a Euro"),
	 MXN_PARA_LIBRA_ESTERLINA("De pesos MXN a Libra Esterlina"),
	 MXN_PARA_PESO_ARGENTINO ("De pesos MXN a Peso Argentino"),
	 MXN_PARA_PESO_CHILENO("De pesos MXN a Peso Chileno"),
	 DOLAR_PARA_MXN("De Dólar a pesos MXN"),
	 EURO_PARA_MXN("De Euro a pesos MXN"),
	 LIBRA_ESTERLINA_PARA_MXN("De Libra Esterlina pesos MXN"),
	 PESO_ARGENTINO_PARA_MXN("De Peso Argentino a pesos MXN"),
	 PESO_CHILENO_PARA_MXN("De Peso Chileno a pesos MXN"),

	 //Temperatura
	 CELSIUS_PARA_FAHRENHEIT("Celsius a Fahrenheit"),
	 CELSIUS_PARA_KELVIN("Celsius a Kelvin"),
	 KELVIN_PARA_FAHRENHEIT("Kelvin a Fahrenheit"),
	 KELVIN_PARA_CELSIUS ("Kelvin a Celsius"),
	 FAHRENHEIT_PARA_CELSIUS ("Fahrenheit a Celsius"),
	 FAHRENHEIT_PARA_KELVIN("Fahrenheit a Kelvin"),
	
	 //Sistema internacional
	 //De menor a mayor
	 MILIMETROS_PARA_CENTIMETROS("Milemetros a centimetros"),
	 MILIMETROS_PARA_METROS("Milimeetros a Metros"),
	 MILIMETROS_PARA_KILOMETROS("Milimeetros a Kilometros"),
	 CENTIMETROS_PARA_METROS("Centimetros a Metros"),
	 CENTIMETROS_PARA_KILOMETROS("Centimetros a Metros"),
	 METROS_PARA_KILOMETROS("Metros a Kilometros"),
	 
	 //De mayor a menor
	 KILOMETROS_PARA_METROS("Kilometros a Metros"),
	 KILOMETROS_PARA_CENTIMETROS("Kilometros a Centimetros"),
	 KILOMETROS_PARA_MILIMETROS("Kilometros a Milimetros"),
	 METROS_PARA_CENTIMETROS("Metros a Centimetros"),
	 METROS_PARA_MILIMETROS("Metros a Milemetros"),
	 CENTIMETROS_PARA_MILIMETROS("Centrimetros a Milimetros"),
	
	//Sistema ingles
	//De menor a mayor
	PULGADA_PARA_PIES("Pulgadas a Pies"),
	PULGADA_PARA_YARDA("Pulgadas a Yarda"),
	PULGADA_PARA_MILLA("Pulgadas a Milla"),
	PIES_PARA_YARDA("Pies a Yarda"),
	PIES_PARA_MILLA("Pies a Milla"),
	YARDA_PARA_MILLA("Yarda a Milla"),
	
	//De mayor a menor
	MILLA_PARA_YARDA("Milla a Yarda"),
	MILLA_PARA_PIES("Milla a Pies"),
	MILLA_PARA_PULGADA("Milla a Pulgada"),
	YARDA_PARA_PIES("Yarda a Pies"),
	YARDA_PARA_PULGADA("Yarda a Pulgada"),
	PIES_PARA_PULGADA("Pies a pulgada"),
	
	//De sistema internacional a Sistema ingles
	MILIMETROS_PARA_PULGADA("Milimetros a Pulgada"),
	MILIMETROS_PARA_PIES("Milimetros a Pies"),
	MILIMETROS_PARA_YARDA("Milimetros a Yardas"),
	MILIMETROS_PARA_MILLA("Milimetros a Milla"),
	CENTIMETROS_PARA_PULGADA("Centimetros a Pulgada"),
	CENTIMETROS_PARA_PIES("Centimetros a Pies"),
	CENTIMETROS_PARA_YARDA("Centimetros a Yarda"),
	CENTIMETROS_PARA_MILLA("Centimetros a Milla"),
	METROS_PARA_PULGADA("Metros a Pulgada"),
	METROS_PARA_PIES("Metros a Pies"),
	METROS_PARA_YARDA("Metros a Yarda"),
	METROS_PARA_MILLA("Metros a Milla"),
	KILOMETROS_PARA_PULGADA("Kilometros a Pulgada"),
	KILOMETROS_PARA_PIES("Kilometros a Pies"),
	KILOMETROS_PARA_YARDA("Kilometros a Yarda"),
	KILOMETROS_PARA_MILLA("Kilometros a Milla"),
	
	//De sistema ingles a sistema internacional
	PULGADA_PARA_MILIMETROS("Pulgada a Milimetros"),
	PULGADA_PARA_CENTIMETROS("Pulgada a Centimetros"),
	PULGADA_PARA_METROS("Pulgada a Metros"),
	PULGADA_PARA_KILOMETROS("Pulgada a Kilometros"),
	PIES_PARA_MILIMETROS("Pies a Milimetros"),
	PIES_PARA_CENTIMETROS("Pies a Centimetros"),
	PIES_PARA_METROS("Pies a Metros"),
	PIES_PARA_KILOMETROS("Pies a Kilometros"),
	YARDA_PARA_MILIMETROS("Yarda a Milimetros"),
	YARDA_PARA_CENTIMETROS("Yarda a Centimetros"),
	YARDA_PARA_METROS("Yarda a Metros"),
	YARDA_PARA_KILOMETROS("Yarda a Kilometros"),
	MILLA_PARA_MILIMETROS("Milla a Milimetros"),
	MILLA_PARA_CENTIMETROS("Milla a Centimetros"),
	MILLA_PARA_METROS("Milla a Metros"),
	MILLA_PARA_KILOMETROS("Milla a Kilometros");
	
	
	private String descripcion;

	TipoDeConversion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	 public String getDescripcion() {
	        return descripcion;
	    }

}
