package Convertidores;

public class ConvertidorDistanciasIS {
	
	//IS= sistema internacional
	
	private double valorConvertido;
	
    //De menor a mayor
		//Milimetros:
		public double MilimetrosParaCentimetros(double valor) {
			valorConvertido = valor / 10;
			return valorConvertido;
		}
		public double MilimetrosParaMetros(double valor) {
			valorConvertido = valor / 1000;
			return valorConvertido;
		}
		public double MilimetrosParaKilometros(double valor) {
			valorConvertido = valor / 1000000;
			return valorConvertido;
		}
	
		//Centimetros:
		public double CentimetrosParaMetros(double valor) {
			valorConvertido = valor / 100;
			return valorConvertido;
		}
		public double CentimetrosParaKilometros(double valor) {
			valorConvertido = valor / 100000;
			return valorConvertido;
		}
	
		//Metros;
		public double MetrosParaKilometros(double valor) {
			valorConvertido = valor / 1000;
			return valorConvertido;
		}
	
	//De mayor a menor
		//Kilometros:
		public double KilometrosParaMetros(double valor) {
			valorConvertido = valor * 1000;
			return valorConvertido;
		}
		public double KilometrosParaCentimetros(double valor) {
			valorConvertido = valor * 100000;
			return valorConvertido;
		}
		public double KilometrosParaMilimetros(double valor) {
			valorConvertido = valor * 1000000;
			return valorConvertido;
		}
	
		//Metros:
		public double MetrosParaCentimetros(double valor) {
			valorConvertido = valor * 100;
			return valorConvertido;
		}
		public double MetrosParaMilimetros(double valor) {
			valorConvertido = valor * 1000;
			return valorConvertido;
		}
	
		//Centimetros:
		public double CentimetrosParaMilimetros(double valor) {
			valorConvertido = valor * 10;
			return valorConvertido;
		}

}
