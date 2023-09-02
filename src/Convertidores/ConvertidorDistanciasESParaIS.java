package Convertidores;

public class ConvertidorDistanciasESParaIS {
	
	//ES = Sistema Ingles
	//IS = Sistema Internacional
	
	private double valorConvertido;
	
	//Falta cambiar el valor de la operacion
	//Pulgadas:
	public double PulgadaParaMilimetros(double valor) {
		valorConvertido = valor * 25.4;
		return valorConvertido;
	}
	public double PulgadaParaCentimetros(double valor) {
		valorConvertido = valor * 304.8 ;
		return valorConvertido;
	}
	public double PulgadaParaMetros(double valor) {
		valorConvertido = valor * 914.4;
		return valorConvertido;
	}
	public double PulgadaParaKilometros(double valor) {
		valorConvertido = valor * 1609344;
		return valorConvertido;
	}
	
	//Pies:
	public double PiesParaMilimetros(double valor) {
		valorConvertido = valor * 2.54;
		return valorConvertido;
	}
	public double PiesParaCentimetros(double valor) {
		valorConvertido = valor * 30.48;
		return valorConvertido;
	}
	public double PiesParaMetros(double valor) {
		valorConvertido = valor * 91.44;
		return valorConvertido;
	}
	public double PiesParaKilometros(double valor) {
		valorConvertido = valor * 160934.4;
		return valorConvertido;
	}
	
	//Yardas:
	public double YardasParaMilimetros(double valor) {
		valorConvertido = valor * 0.0254;
		return valorConvertido;
	}
	public double YardasParaCentimetro(double valor) {
		valorConvertido = valor * 0.3048;
		return valorConvertido;
	}
	public double YardasParaMetros(double valor) {
		valorConvertido = valor * .9144;
		return valorConvertido;
	}
	public double YardasParaKilometros(double valor) {
		valorConvertido = valor *1609.34;
		return valorConvertido;
	}
	
	
	//Millas:
	public double MillasParaMilimetros(double valor) {
		valorConvertido = valor / 39370.078;
		return valorConvertido;
	}
	public double MillasParaCentimetros(double valor) {
		valorConvertido = valor * 0.00030;
		return valorConvertido;
	}
	public double MillasParaMetros(double valor) {
		valorConvertido = valor * 0.00091;
		return valorConvertido;
	}
	public double MillasParaKilometros(double valor) {
		valorConvertido = valor * 1.609;
		return valorConvertido;
	}
	

}
