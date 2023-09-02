package Convertidores;

public class ConvertidorDistanciasES {
	
	//ES=Sistema inglés
	
	private double valorConvertido;
	
	//De menor a mayor
		//Pulgadas:
		public double PulgadaParaPies(double valor) {
			valorConvertido = valor / 12;
			return valorConvertido;
		}
		public double PulgadaParaYarda(double valor) {
			valorConvertido = valor / 36;
			return valorConvertido;
		}
		public double PulgadaParaMilla(double valor) {
			valorConvertido = valor / 63360;
			return valorConvertido;
		}
		
		//Pies:
		public double PiesParaYarda(double valor) {
			valorConvertido = valor / 3;
			return valorConvertido;
		}
		public double PiesParaMilla(double valor) {
			valorConvertido = valor / 5280;
			return valorConvertido;
		}
		
		//Yarda:
		public double YardaParaMilla(double valor) {
			valorConvertido = valor / 1760;
			return valorConvertido;
		}
		
		
	//De mayor a menor
		//Milla:
		public double MillaParaYarda(double valor) {
			valorConvertido = valor * 1760;
			return valorConvertido;
		}
		public double MillaParaPies(double valor) {
			valorConvertido = valor * 5280;
			return valorConvertido;
		}
		public double MillaParaPulgada(double valor) {
			valorConvertido = valor * 63360;
			return valorConvertido;
		}
		
		//Yarda:
		public double YardaParaPies(double valor) {
			valorConvertido = valor * 3;
			return valorConvertido;
		}
		public double YardaParaPulgada(double valor) {
			valorConvertido = valor * 36;
			return valorConvertido;
		}
		
		//Pies:
		public double PiesParaPulgada(double valor) {
			valorConvertido = valor * 12;
			return valorConvertido;
		}
}
