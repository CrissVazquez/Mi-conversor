package Iniciadores;

import Convertidores.ConvertidorDistanciasESParaIS;

public class IniciadorDeConversionDistanciaESParaIS {
	
	// ES = Sistema Ingles
	//IS = Sistema Internacional
	
	ConvertidorDistanciasESParaIS convertidorDistanciaESParaIS = new ConvertidorDistanciasESParaIS();
	
	//Pulgadas:
	private static final String PULGADA_PARA_MILIMETROS = "Pulgada a Milimetros";
	private static final String PULGADA_PARA_CENTIMETROS = "Pulgada a Centimetros";
	private static final String PULGADA_PARA_METROS = "Pulgada a Metros";
	private static final String PULGADA_PARA_KILOMETROS = "Pulgada a Kilometros";
	
	//Pies:
	private static final String PIES_PARA_MILIMETROS = "Pies a Milimetros";
	private static final String PIES_PARA_CENTIMETROS = "Pies a Centimetros";
	private static final String PIES_PARA_METROS = "Pies a Metros";
	private static final String PIES_PARA_KILOMETROS = "Pies a Kilometros";
	
	//Yardas:
	private static final String YARDA_PARA_MILIMETROS = "Yarda a Milimetros";
	private static final String YARDA_PARA_CENTIMETROS = "Yarda a Centimetros";
	private static final String YARDA_PARA_METROS = "Yarda a Metros";
	private static final String YARDA_PARA_KILOMETROS = "Yarda a Kilometros";
	
	//Millas:
	private static final String MILLA_PARA_MILIMETROS = "Milla a Milimetros";
	private static final String MILLA_PARA_CENTIMETROS = "Milla a Centimetros";
	private static final String MILLA_PARA_METROS = "Milla a Metros";
	private static final String MILLA_PARA_KILOMETROS = "Milla a Kilometros";
	
	public double operarConversionESParaIS (String operacionDeDistancia, double valorInicial) throws Exception {
		switch (operacionDeDistancia) {
		//Pulgadas:
		case PULGADA_PARA_MILIMETROS : {
			return convertidorDistanciaESParaIS.PulgadaParaMilimetros(valorInicial);
		}
		case PULGADA_PARA_CENTIMETROS : {
			return convertidorDistanciaESParaIS.PulgadaParaCentimetros(valorInicial);
		}
		case PULGADA_PARA_METROS : {
			return convertidorDistanciaESParaIS.PulgadaParaMetros(valorInicial);
		}
		case PULGADA_PARA_KILOMETROS : {
			return convertidorDistanciaESParaIS.PulgadaParaKilometros(valorInicial);
		}
		
		//Pies:
		case PIES_PARA_MILIMETROS  : {
			return convertidorDistanciaESParaIS.PiesParaMilimetros(valorInicial);
		}
		case PIES_PARA_CENTIMETROS  : {
			return convertidorDistanciaESParaIS.PiesParaCentimetros(valorInicial);
		}
		case PIES_PARA_METROS  : {
			return convertidorDistanciaESParaIS.PiesParaMetros(valorInicial);
		}
		case PIES_PARA_KILOMETROS  : {
			return convertidorDistanciaESParaIS.PiesParaKilometros(valorInicial);
		}
	
		//Yardas:
		case YARDA_PARA_MILIMETROS : {
			return convertidorDistanciaESParaIS.YardasParaMilimetros(valorInicial);
		}
		case YARDA_PARA_CENTIMETROS : {
			return convertidorDistanciaESParaIS.YardasParaCentimetro(valorInicial);
		}
		case YARDA_PARA_METROS : {
			return convertidorDistanciaESParaIS.YardasParaMetros(valorInicial);
		}
		case YARDA_PARA_KILOMETROS : {
			return convertidorDistanciaESParaIS.YardasParaKilometros(valorInicial);
		}
		
		//Millas:
		case MILLA_PARA_MILIMETROS : {
			return convertidorDistanciaESParaIS.MillasParaMilimetros(valorInicial);
		}
		case MILLA_PARA_CENTIMETROS : {
			return convertidorDistanciaESParaIS.MillasParaCentimetros(valorInicial);
		}
		case MILLA_PARA_METROS : {
			return convertidorDistanciaESParaIS.MillasParaMetros(valorInicial);
		}
		case MILLA_PARA_KILOMETROS : {
			return convertidorDistanciaESParaIS.MillasParaKilometros(valorInicial);
		}
		default : throw new Exception("Elección Inválida");
		}
	}
		
}
