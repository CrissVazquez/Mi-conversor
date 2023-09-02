import java.math.BigDecimal;

import javax.swing.JOptionPane;

import Enums.TipoDeConversion;
import Iniciadores.IniciadorDeConversionDistanciaES;
import Iniciadores.IniciadorDeConversionDistanciaESParaIS;
import Iniciadores.IniciadorDeConversionDistanciaIS;
import Iniciadores.IniciadorDeConversionDistanciaISParaES;
import Iniciadores.IniciadorDeConversionMonedas;
import Iniciadores.IniciadorDeConversionTemperatura;
import Modelo.Repetidor1;
import Modelo.Validador1;

public class Pincipal1 {
	
	public static void main(String[] args) throws Exception {
		
		String conversionDeMoneda = "Convertir moneda";
        String conversionDeTemperatura = "Convertir temperatura";
        String conversionDeDistancias = "Convertir distancia";  
        String conversion1 = "De Sistema Internacional a Internacional";
        String conversion2 = "De Sistema Ingles a Ingles";
        String conversion3 = "De Sistema Internacional a Ingles";
        String conversion4 = "De Sistema Ingles a Internacional";
        
        boolean ejecuta = true;
        
        Repetidor1 repetidor = new Repetidor1();
        
        while(ejecuta){
            String operacion = JOptionPane.showInputDialog(null, "Elige la operación",
                    "Conversiones", JOptionPane.QUESTION_MESSAGE, null, new String[]
                            {conversionDeMoneda, conversionDeTemperatura, conversionDeDistancias}, "Elección").toString();
            
       //Aqui empieza el apartado de divisas 
			if (operacion.equals(conversionDeMoneda)) {
                IniciadorDeConversionMonedas iniciadorDeConversionMonedas = new IniciadorDeConversionMonedas();
                String operacionDeMonedas = JOptionPane.showInputDialog(null, "Elige una moneda",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoDeConversion.MXN_PARA_DOLAR.getDescripcion(),
                                TipoDeConversion.MXN_PARA_EURO.getDescripcion(),
                                TipoDeConversion.MXN_PARA_LIBRA_ESTERLINA.getDescripcion(),
                                TipoDeConversion.MXN_PARA_PESO_ARGENTINO.getDescripcion(),
                                TipoDeConversion.MXN_PARA_PESO_CHILENO.getDescripcion(),
                                TipoDeConversion.DOLAR_PARA_MXN.getDescripcion(),
                                TipoDeConversion.EURO_PARA_MXN.getDescripcion(),
                                TipoDeConversion.LIBRA_ESTERLINA_PARA_MXN.getDescripcion(),
                                TipoDeConversion.PESO_ARGENTINO_PARA_MXN.getDescripcion(),
                                TipoDeConversion.PESO_CHILENO_PARA_MXN.getDescripcion()},
                        "Escoja").toString();
                
                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador1 validador = new Validador1();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    BigDecimal valorConvertido = iniciadorDeConversionMonedas.operarConversion(operacionDeMonedas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
                
      //Aqui empieza el apartado de temperatura
            } else if(operacion.equals(conversionDeTemperatura)){
                IniciadorDeConversionTemperatura iniciadorDeConversionTemperatura = new IniciadorDeConversionTemperatura();
                String operacionDeTemperaturas = JOptionPane.showInputDialog(null, "Elige la escala de temperatura",
                        "Temperatura", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoDeConversion.CELSIUS_PARA_FAHRENHEIT.getDescripcion(),
                                TipoDeConversion.CELSIUS_PARA_KELVIN.getDescripcion(),
                                TipoDeConversion.FAHRENHEIT_PARA_CELSIUS.getDescripcion(),
                                TipoDeConversion.FAHRENHEIT_PARA_KELVIN.getDescripcion(),
                                TipoDeConversion.KELVIN_PARA_CELSIUS.getDescripcion(),
                                TipoDeConversion.KELVIN_PARA_FAHRENHEIT.getDescripcion(),},
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador1 validador = new Validador1();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorDeConversionTemperatura.operarConversion(operacionDeTemperaturas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
                
      //Aqui empieza el apartado de Distancias
            } else if(operacion.equals(conversionDeDistancias)) {
            	            	 
            	 String elijeElSistema = JOptionPane.showInputDialog(null, "Elige el sistema que deseas utilizar",
            			 "Distancias", JOptionPane.QUESTION_MESSAGE,null, new String[] 
            					 {conversion1, conversion2, conversion3, conversion4}, "Eleccion").toString();
            	 
            	 if(elijeElSistema.equals(conversion1)) {
            		 IniciadorDeConversionDistanciaIS iniciadorDeConversionDistanciaIS = new IniciadorDeConversionDistanciaIS();
            		 String operacionDeDistancias = JOptionPane.showInputDialog(null, "Elige la escala de Distancia", 
                			 "De Sistema Internacional a Internacional", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                					//De menor a mayor
                					 TipoDeConversion.MILIMETROS_PARA_CENTIMETROS.getDescripcion(),
                					 TipoDeConversion.MILIMETROS_PARA_METROS.getDescripcion(),
                					 TipoDeConversion.MILIMETROS_PARA_KILOMETROS.getDescripcion(),
                					 TipoDeConversion.CENTIMETROS_PARA_METROS.getDescripcion(),
                					 TipoDeConversion.CENTIMETROS_PARA_KILOMETROS.getDescripcion(),
                					 TipoDeConversion.METROS_PARA_KILOMETROS.getDescripcion(),
                					//De mayor a menor
                					 TipoDeConversion.KILOMETROS_PARA_MILIMETROS.getDescripcion(),
                					 TipoDeConversion.KILOMETROS_PARA_CENTIMETROS.getDescripcion(),
                					 TipoDeConversion.KILOMETROS_PARA_METROS.getDescripcion(),
                					 TipoDeConversion.METROS_PARA_CENTIMETROS.getDescripcion(),
                					 TipoDeConversion.METROS_PARA_MILIMETROS.getDescripcion(),
                					 TipoDeConversion.CENTIMETROS_PARA_MILIMETROS.getDescripcion(),},
                			 "Eleccion").toString();
                	 
                	 String valorString = JOptionPane.showInputDialog("Introduce un valor");
                     Validador1 validador = new Validador1();
                     if(!validador.verificar(valorString)){
                         JOptionPane.showMessageDialog(null, "Valor Inválido");
                     } else {
                    	 double valorInicial = validador.transformarEnDouble(valorString);
                    	 double valorConvertido = iniciadorDeConversionDistanciaIS.operarConversionIS(operacionDeDistancias, valorInicial);
                    	 JOptionPane.showMessageDialog(null, valorConvertido);
                     }	
                     
            	 } else if (elijeElSistema.equals(conversion2)) {
            		 IniciadorDeConversionDistanciaES iniciadorDeConversionDistanciaES = new IniciadorDeConversionDistanciaES();
            		 String operacionDeDistancias = JOptionPane.showInputDialog(null, "Elige la escala de Distancia", 
                			 "De Sistema Ingles a Ingles", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                					 //De menor a mayor
                					 TipoDeConversion.PULGADA_PARA_PIES.getDescripcion(),
                					 TipoDeConversion.PULGADA_PARA_YARDA.getDescripcion(),
                					 TipoDeConversion.PULGADA_PARA_MILLA.getDescripcion(),
                					 TipoDeConversion.PIES_PARA_YARDA.getDescripcion(),
                					 TipoDeConversion.PIES_PARA_MILLA.getDescripcion(),
                					 TipoDeConversion.YARDA_PARA_MILLA.getDescripcion(),
                					 //De mayor a menor
                					 TipoDeConversion.MILLA_PARA_YARDA.getDescripcion(),
                					 TipoDeConversion.MILLA_PARA_PIES.getDescripcion(),
                					 TipoDeConversion.MILLA_PARA_PULGADA.getDescripcion(),
                					 TipoDeConversion.YARDA_PARA_PIES.getDescripcion(),
                					 TipoDeConversion.YARDA_PARA_PULGADA.getDescripcion(),
                					 TipoDeConversion.PIES_PARA_PULGADA.getDescripcion(),}, 
                			 "Eleccion").toString();
                	 
                	 String valorString = JOptionPane.showInputDialog("Introduce un valor");
                     Validador1 validador = new Validador1();
                     if(!validador.verificar(valorString)){
                         JOptionPane.showMessageDialog(null, "Valor Inválido");
                     } else {
                    	 double valorInicial = validador.transformarEnDouble(valorString);
                    	 double valorConvertido = iniciadorDeConversionDistanciaES.operarConversionES(operacionDeDistancias, valorInicial);
                    	 JOptionPane.showMessageDialog(null, valorConvertido);
                     }	 
                     
            	 } else if (elijeElSistema.equals(conversion3)) {
            		 IniciadorDeConversionDistanciaISParaES iniciadorDeConversionDistanciaISParaES = new IniciadorDeConversionDistanciaISParaES();
            		 String operacionDeDistancias = JOptionPane.showInputDialog(null, "Elige la escala de Distancia", 
                			 "De Sistema Internacional a Ingles", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                					 //Milimetros:
                					 TipoDeConversion.MILIMETROS_PARA_PULGADA.getDescripcion(),
                					 TipoDeConversion.MILIMETROS_PARA_PIES.getDescripcion(),
                					 TipoDeConversion.MILIMETROS_PARA_YARDA.getDescripcion(),
                					 TipoDeConversion.MILIMETROS_PARA_MILLA.getDescripcion(),
                					 
                					//Centimetros:
                					 TipoDeConversion.CENTIMETROS_PARA_PULGADA.getDescripcion(),
                					 TipoDeConversion.CENTIMETROS_PARA_PIES.getDescripcion(),
                					 TipoDeConversion.CENTIMETROS_PARA_YARDA.getDescripcion(),
                					 TipoDeConversion.CENTIMETROS_PARA_MILLA.getDescripcion(),
                					 
                					//Metros:
                					 TipoDeConversion.METROS_PARA_PULGADA.getDescripcion(),
                					 TipoDeConversion.METROS_PARA_PIES.getDescripcion(),
                					 TipoDeConversion.METROS_PARA_YARDA.getDescripcion(),
                					 TipoDeConversion.METROS_PARA_MILLA.getDescripcion(),
                					 
                					//Kilometros:
                					 TipoDeConversion.KILOMETROS_PARA_PULGADA.getDescripcion(),
                					 TipoDeConversion.KILOMETROS_PARA_PIES.getDescripcion(),
                					 TipoDeConversion.KILOMETROS_PARA_YARDA.getDescripcion(),
                					 TipoDeConversion.KILOMETROS_PARA_MILLA.getDescripcion(),
                			 },
                			 "Eleccion").toString();
            		 
            		 String valorString = JOptionPane.showInputDialog("Introduce un valor");
                     Validador1 validador = new Validador1();
                     if(!validador.verificar(valorString)){
                         JOptionPane.showMessageDialog(null, "Valor Inválido");
                     } else {
                    	 double valorInicial = validador.transformarEnDouble(valorString);
                    	 double valorConvertido = iniciadorDeConversionDistanciaISParaES.operarConversionISParaES(operacionDeDistancias, valorInicial);
                    	 JOptionPane.showMessageDialog(null, valorConvertido);
                     }	
                     
            	 }else if (elijeElSistema.equals(conversion4)) {
            		 IniciadorDeConversionDistanciaESParaIS iniciadorDeConversionDistanciaESParaIS = new IniciadorDeConversionDistanciaESParaIS();
            		 String operacionDeDistancias = JOptionPane.showInputDialog(null, "Elige la escala de Distancia", 
                			 "De Sistema Ingles a Internacional", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                					 //Pulgadas:
                					 TipoDeConversion.PULGADA_PARA_MILIMETROS.getDescripcion(),
                					 TipoDeConversion.PULGADA_PARA_CENTIMETROS.getDescripcion(),
                					 TipoDeConversion.PULGADA_PARA_METROS.getDescripcion(),
                					 TipoDeConversion.PULGADA_PARA_KILOMETROS.getDescripcion(),
                					 
                					//Pies:
                					 TipoDeConversion.PIES_PARA_MILIMETROS.getDescripcion(),
                					 TipoDeConversion.PIES_PARA_CENTIMETROS.getDescripcion(),
                					 TipoDeConversion.PIES_PARA_METROS.getDescripcion(),
                					 TipoDeConversion.PIES_PARA_KILOMETROS.getDescripcion(),
                					 
                					//Yardas:
                					 TipoDeConversion.YARDA_PARA_MILIMETROS.getDescripcion(),
                					 TipoDeConversion.YARDA_PARA_CENTIMETROS.getDescripcion(),
                					 TipoDeConversion.YARDA_PARA_METROS.getDescripcion(),
                					 TipoDeConversion.YARDA_PARA_KILOMETROS.getDescripcion(),
                					 
                					//Millas:
                					 TipoDeConversion.MILLA_PARA_MILIMETROS.getDescripcion(),
                					 TipoDeConversion.MILLA_PARA_CENTIMETROS.getDescripcion(),
                					 TipoDeConversion.MILLA_PARA_METROS.getDescripcion(),
                					 TipoDeConversion.MILLA_PARA_KILOMETROS.getDescripcion(),
                			 },
                			 "Eleccion").toString();
            		 
            		 String valorString = JOptionPane.showInputDialog("Introduce un valor");
                     Validador1 validador = new Validador1();
                     if(!validador.verificar(valorString)){
                         JOptionPane.showMessageDialog(null, "Valor Inválido");
                     } else {
                    	 double valorInicial = validador.transformarEnDouble(valorString);
                    	 double valorConvertido = iniciadorDeConversionDistanciaESParaIS.operarConversionESParaIS(operacionDeDistancias, valorInicial);
                    	 JOptionPane.showMessageDialog(null, valorConvertido);
                     }	
            	 }          	 		 
            }          	
            ejecuta = repetidor.intentaRepetir();
        }
	}
}
