package Iniciadores;

import Convertidores.ConvertidorDistanciasISParaES;

public class IniciadorDeConversionDistanciaISParaES {
	
	// ES = Sistema Ingles
	//IS = Sistema Internacional
	
	ConvertidorDistanciasISParaES convertidorDistanciasISParaES = new ConvertidorDistanciasISParaES();
	
	//Milimetros:
	private static final String MILIMETROS_PARA_PULGADA = "Milimetros a Pulgada";
	private static final String MILIMETROS_PARA_PIES = "Milimetros a Pies";
	private static final String MILIMETROS_PARA_YARDA = "Milimetros a Yardas";
	private static final String MILIMETROS_PARA_MILLA = "Milimetros a Milla";
	
	//Centimetros:
	private static final String CENTIMETROS_PARA_PULGADA = "Centimetros a Pulgada";
	private static final String CENTIMETROS_PARA_PIES = "Centimetros a Pies";
	private static final String CENTIMETROS_PARA_YARDA = "Centimetros a Yarda";
	private static final String CENTIMETROS_PARA_MILLA = "Centimetros a Milla";
	
	//Metros:
	private static final String METROS_PARA_PULGADA = "Metros a Pulgada";
	private static final String METROS_PARA_PIES = "Metros a Pies";
	private static final String METROS_PARA_YARDA = "Metros a Yarda";
	private static final String METROS_PARA_MILLA = "Metros a Milla";
	
	//Kilometros:
	private static final String KILOMETROS_PARA_PULGADA = "Kilometros a Pulgada";
	private static final String KILOMETROS_PARA_PIES = "Kilometros a Pies";
	private static final String KILOMETROS_PARA_YARDA = "Kilometros a Yarda";
	private static final String KILOMETROS_PARA_MILLA = "Kilometros a Milla";
	
	public double operarConversionISParaES(String operacionDeDistancia, double valorInicial) throws Exception {
		switch (operacionDeDistancia) {
		//Milimetros:
		case MILIMETROS_PARA_PULGADA : {
			return convertidorDistanciasISParaES.MilimetrosParaPulgada(valorInicial);
		}
		case MILIMETROS_PARA_PIES : {
			return convertidorDistanciasISParaES.MilimetrosParaPies(valorInicial);
		}
		case MILIMETROS_PARA_YARDA : {
			return convertidorDistanciasISParaES.MilimetrosParaYarda(valorInicial);
		}
		case MILIMETROS_PARA_MILLA : {
			return convertidorDistanciasISParaES.MilimetrosParaMilla(valorInicial);
		}
		
		//Milimetros:
		case CENTIMETROS_PARA_PULGADA : {
			return convertidorDistanciasISParaES.CentimetrosParaPulgada(valorInicial);
		}
		case CENTIMETROS_PARA_PIES : {
			return convertidorDistanciasISParaES.CentimetrosParaPies(valorInicial);
		}
		case CENTIMETROS_PARA_YARDA : {
			return convertidorDistanciasISParaES.CentimetrosParaYarda(valorInicial);
		}
		case CENTIMETROS_PARA_MILLA : {
			return convertidorDistanciasISParaES.CentimetrosParaMilla(valorInicial);
		}
		
		//Metros:
		case METROS_PARA_PULGADA : {
			return convertidorDistanciasISParaES.MetrosParaPulgada(valorInicial);
		}
		case METROS_PARA_PIES : {
			return convertidorDistanciasISParaES.MetrosParaPies(valorInicial);
		}
		case METROS_PARA_YARDA : {
			return convertidorDistanciasISParaES.MetrosParaYarda(valorInicial);
		}
		case METROS_PARA_MILLA : {
			return convertidorDistanciasISParaES.MetrosParaMilla(valorInicial);
		}
		
		//Kilometros:
		case KILOMETROS_PARA_PULGADA : {
			return convertidorDistanciasISParaES.KilometrosParaPulgada(valorInicial);
		}
		case KILOMETROS_PARA_PIES : {
			return convertidorDistanciasISParaES.KilometrosParaPies(valorInicial);
		}
		case KILOMETROS_PARA_YARDA : {
			return convertidorDistanciasISParaES.KilometrosParaYarda(valorInicial);
		}
		case KILOMETROS_PARA_MILLA : {
			return convertidorDistanciasISParaES.KilometrosParaMilla(valorInicial);
		}
		default : throw new Exception("Elección Inválida");
		}
	}
	

}
