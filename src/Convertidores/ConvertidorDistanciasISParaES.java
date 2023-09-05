package Convertidores;

public class ConvertidorDistanciasISParaES {
	
	// ES = Sistema Ingles
	//IS = Sistema Internacional
	
	private double valorConvertido;
	
	//Milimetros:
	public double MilimetrosParaPulgada(double valor) {
		valorConvertido = valor / 25.4;
		return valorConvertido;
	}
	public double MilimetrosParaPies(double valor) {
		valorConvertido = valor / 304.8;
		return valorConvertido;
	}
	public double MilimetrosParaYarda(double valor) {
		valorConvertido = valor / 914.4;
		return valorConvertido;
	}
	public double MilimetrosParaMilla(double valor) {
		valorConvertido = valor / 1609344;
		return valorConvertido;
	}
	
	//Centimetros:
	public double CentimetrosParaPulgada(double valor) {
		valorConvertido = valor / 2.54;
		return valorConvertido;
	}
	public double CentimetrosParaPies(double valor) {
		valorConvertido = valor / 30.48;
		return valorConvertido;
	}
	public double CentimetrosParaYarda(double valor) {
		valorConvertido = valor / 91.44;
		return valorConvertido;
	}
	public double CentimetrosParaMilla(double valor) {
		valorConvertido = valor / 160934.4;
		return valorConvertido;
	}
	
	//Metros:
	public double MetrosParaPulgada(double valor) {
		valorConvertido = valor / 0.0254;
		return valorConvertido;
	}
	public double MetrosParaPies(double valor) {
		valorConvertido = valor / 0.3048;
		return valorConvertido;
	}
	public double MetrosParaYarda(double valor) {
		valorConvertido = valor / 0.9144;
		return valorConvertido;
	}
	public double MetrosParaMilla(double valor) {
		valorConvertido = valor / 1609.344;
		return valorConvertido;
	}
	
	//Kilometros:
	public double KilometrosParaPulgada(double valor) {
		valorConvertido = valor * 39370.078;		
		return valorConvertido;
	}
	public double KilometrosParaPies(double valor) {
		valorConvertido = valor / 0.0003048;
		return valorConvertido;
	}
	public double KilometrosParaYarda(double valor) {
		valorConvertido = valor / 0.000914;
		return valorConvertido;
	}
	public double KilometrosParaMilla(double valor) {
		valorConvertido = valor / 1.609;
		return valorConvertido;
	}
	

}
