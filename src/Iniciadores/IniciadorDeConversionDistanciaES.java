package Iniciadores;

import Convertidores.ConvertidorDistanciasES;

 	//ES = Sistema Ingles
	

public class IniciadorDeConversionDistanciaES {
	
	ConvertidorDistanciasES convertidorDeDistanciasES = new ConvertidorDistanciasES();
	//De menor a mayor
	private static final String PULGADA_PARA_PIES = "Pulgadas a Pies";
	private static final String PULGADA_PARA_YARDA = "Pulgadas a Yarda";
	private static final String PULGADA_PARA_MILLA = "Pulgadas a Milla";
	private static final String PIES_PARA_YARDA = "Pies a Yarda";
	private static final String PIES_PARA_MILLA = "Pies a Milla";
	private static final String YARDA_PARA_MILLA = "Yarda a Milla";
	
	//De mayor a menor
	private static final String MILLA_PARA_YARDA = "Milla a Yarda";
	private static final String MILLA_PARA_PIES = "Milla a Pies";
	private static final String MILLA_PARA_PULGADA = "Milla a Pulgada";
	private static final String YARDA_PARA_PIES = "Yarda a Pies";
	private static final String YARDA_PARA_PULGADA = "Yarda a Pulgada";
	private static final String PIES_PARA_PULGADA = "Pies a pulgada";
	
	public double operarConversionES(String operacionDeDistancia, double valorInicial) throws Exception {
		switch (operacionDeDistancia) {
		//De menor a mayor
		case PULGADA_PARA_PIES : {
			return convertidorDeDistanciasES.PulgadaParaPies(valorInicial);
		}
		case PULGADA_PARA_YARDA : {
			return convertidorDeDistanciasES.PulgadaParaYarda(valorInicial);
		}
		case PULGADA_PARA_MILLA : {
			return convertidorDeDistanciasES.PulgadaParaMilla(valorInicial);
		}
		case PIES_PARA_YARDA : {
			return convertidorDeDistanciasES.PiesParaYarda(valorInicial);
		}
		case PIES_PARA_MILLA : {
			return convertidorDeDistanciasES.PiesParaMilla(valorInicial);
		}
		case YARDA_PARA_MILLA : {
			return convertidorDeDistanciasES.YardaParaMilla(valorInicial);
		}
		
		//De menor a mayor
		case MILLA_PARA_YARDA : {
			return convertidorDeDistanciasES.MillaParaYarda(valorInicial);
		}
		case MILLA_PARA_PIES : {
			return convertidorDeDistanciasES.MillaParaPies(valorInicial);
		}
		case MILLA_PARA_PULGADA : {
			return convertidorDeDistanciasES.MillaParaPulgada(valorInicial);
		}
		case YARDA_PARA_PIES : {
			return convertidorDeDistanciasES.YardaParaPies(valorInicial);
		}
		case YARDA_PARA_PULGADA : {
			return convertidorDeDistanciasES.YardaParaPulgada(valorInicial);
		}
		case PIES_PARA_PULGADA : {
			return convertidorDeDistanciasES.PiesParaPulgada(valorInicial);
		}
		default : throw new Exception("Elección Inválida");
		}
	}

}
