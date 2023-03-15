import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.IllegalFormatConversionException;
import java.util.List;

import javax.swing.JOptionPane;

public class MainMenu extends Conversor {
	public static void main(String[] args) {
 
		
		/*showInputDialog(
				Component, 
				Object, 
				String, 
				int, 
				Icon, 
				Object[], 
				Object
			)
        */
		
		Object[] options = {"Conversor de moneda", "Conversor de temperatura"};
		String conversorEscogido = (String) JOptionPane.showInputDialog(
				null, 
				"Escoge el tipo de convertor", 	
				"Menu",
	            -1, 
	            null, 
	            options, 
	            options[0]
				);
		try {
			ArrayList<?> resultado = new ArrayList<Object>(2);
			if(conversorEscogido == "Conversor de moneda") {
				ConversorDivisas conversorDivisas = new ConversorDivisas();
				String divisasAConvertir = conversorDivisas.menuDeOpciones();
				double montoAConvertir = conversorDivisas.montoAConvertir("Ingresa la cantidad que deseas convertir tu dinero: ");
				resultado = conversorDivisas.operacion(divisasAConvertir, montoAConvertir) ; 
				conversorDivisas.resultadoConversion((double)resultado.get(0), (String)resultado.get(1));
				deseaContinuar();				
			}else if(conversorEscogido == "Conversor de temperatura") {
				ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
//				conversorTemperatura.opciones;
				String temperaturaAConvertir = conversorTemperatura.menuDeOpciones();
				double montoAConvertir = conversorTemperatura.montoAConvertir("Ingresa los grados que deseas convertir : ");
				resultado = conversorTemperatura.operacion(temperaturaAConvertir, montoAConvertir);
				conversorTemperatura.resultadoConversion((double)resultado.get(0), (String)resultado.get(1));
				deseaContinuar();
			}else {
				System.out.println(conversorEscogido);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	public static void deseaContinuar() {
		int resultado = JOptionPane.showConfirmDialog(null, "Desea continuar?");
		if(resultado == 0) {
			main(null);
		}else if(resultado == 1){
			JOptionPane.showMessageDialog(null, "Programa Terminado!", null, JOptionPane.INFORMATION_MESSAGE, null);
		}	
	}
}
