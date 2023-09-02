package Iniciadores;

import Convertidores.ConvertidorDistanciasIS;

public class IniciadorDeConversionDistanciaIS {
	
	//IS = Sistema Internacional
	
	ConvertidorDistanciasIS convertidorDistanciasIS = new ConvertidorDistanciasIS();
	//De menor a mayor
	private static final String MILIMETROS_PARA_CENTIMETROS = "Milimetros a Centimetros";
	private static final String MILIMETROS_PARA_METROS = "Milimetros a Metros";
	private static final String MILIMETROS_PARA_KILOMETROS = "Milimetros a Kilometros";
	private static final String CENTIMETROS_PARA_METROS = "Centimetros a Metros";
	private static final String CENTIMETROS_PARA_KILOMETROS = "Centimetros a Kilometros";
	private static final String METROS_PARA_KILOMETROS = "Metros a Kilometros";
	
	//De mayor a menor
	private static final String KILOMETROS_PARA_METROS = "Kilometros a Metros";
	private static final String KILOMETROS_PARA_CENTIMETROS = "Kilometros a Centimetros";
	private static final String KILOMETROS_PARA_MILIMETROS = "Kilometros a Milimetros";
	private static final String METROS_PARA_CENTIMETROS = "Metros a Centimetros";
	private static final String METROS_PARA_MILIMETROS = "Metros a Milemetros";
	private static final String CENTIMETROS_PARA_MILIMETROS = "Centrimetros a Milimetros";
	
	public double operarConversionIS(String operacionDeDistancia, double valorInicial) throws Exception {
		switch (operacionDeDistancia) {
		
		//De menor a mayor
		case MILIMETROS_PARA_CENTIMETROS : {
			return convertidorDistanciasIS.MilimetrosParaCentimetros(valorInicial);
		}
		case MILIMETROS_PARA_METROS : {
			return convertidorDistanciasIS.MilimetrosParaMetros(valorInicial);
		}
		case MILIMETROS_PARA_KILOMETROS : {
			return convertidorDistanciasIS.MilimetrosParaKilometros(valorInicial);
		}
		case CENTIMETROS_PARA_METROS : {
			return convertidorDistanciasIS.CentimetrosParaMetros(valorInicial);
		}
		case CENTIMETROS_PARA_KILOMETROS : {
			return convertidorDistanciasIS.CentimetrosParaKilometros(valorInicial);
		}
		case METROS_PARA_KILOMETROS : {
			return convertidorDistanciasIS.MetrosParaKilometros(valorInicial);
		}
		
		//De mayor a menor
		case KILOMETROS_PARA_METROS : {
			return convertidorDistanciasIS.KilometrosParaMetros(valorInicial);
		}
		case KILOMETROS_PARA_CENTIMETROS : {
			return convertidorDistanciasIS.KilometrosParaCentimetros(valorInicial);
		}
		case KILOMETROS_PARA_MILIMETROS : {
			return convertidorDistanciasIS.KilometrosParaMilimetros(valorInicial);
		}
		case METROS_PARA_CENTIMETROS : {
			return convertidorDistanciasIS.MetrosParaCentimetros(valorInicial);
		}
		case METROS_PARA_MILIMETROS : {
			return convertidorDistanciasIS.MetrosParaMilimetros(valorInicial);
		}
		case CENTIMETROS_PARA_MILIMETROS : {
			return convertidorDistanciasIS.CentimetrosParaMilimetros(valorInicial);
		}
		
		default : throw new Exception("Elección Inválida");
		}
	}
}