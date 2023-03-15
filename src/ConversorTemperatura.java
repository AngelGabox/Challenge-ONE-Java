import java.util.ArrayList;

import javax.swing.*;

public class ConversorTemperatura extends Conversor{
	public final String F = "Fahrenheit"; 
	public final String C = "Celsius";
	public final String K = "Kelvin";
	Object[] opciones = {
			"De "+F+" a "+C,
			"De "+F+" a "+K,
			"De "+C+" a "+K,
			"De "+C+" a "+F,
			"De "+K+" a "+F,
			"De "+K+" a "+C,
	}; 
	
	public void validarDato(int clave) {
		
		/*Para convertir de ºF a ºC use la fórmula:   ºC = (ºF-32) ÷ 1.8.
		 *Para convertir de K a ºC use la fórmula:   ºC = K – 273.15
		 *Para convertir de ºC a K use la fórmula: K = ºC + 273.15.
		 *Para convertir de ºF a K use la fórmula: K = 5/9 (ºF – 32) + 273.15.
		 *Para convertir de K a ºF use la fórmula:   ºF = 1.8(K – 273.15) + 32.
		 *Para convertir de C a F = (°C × 1.8) + 32 
		 */
	};
	
	public String menuDeOpciones() {
		String result = (String) JOptionPane.showInputDialog(
				null, 
				"Escoge la temperatura que deseas convertir", 
				"Temperatura",
	            -1, 
	            null, 
	            opciones, 
	            opciones[0]
				);
		return result;
	}
	public ArrayList<Object> operacion(String conversion, double monto){
		double resultado = 0;
		ArrayList<Object> array = new ArrayList<>(2);
		String grado = null;
		switch(conversion){
			case"De "+F+" a "+C: {
				resultado = (monto - 32) / 1.8;
				grado = C;
				break;
			}
			case"De "+F+" a "+K: {
				resultado = (monto - 32) * 5/9 + 273.15;
				grado = K;
				break;
			}
			case"De "+C+" a "+K: {
				resultado = monto + 273.15;
				grado = K;
				break;
			}
			case"De "+C+" a "+F: {
				resultado = (monto * 1.8) + 32;
				grado = F;
				break;
			}
			case"De "+K+" a "+F: {
				resultado = (1.8 *(monto - 273.15)) + 32.;
				grado = F;
				break;
			}
			case"De "+K+" a "+C: {
				resultado = monto - 273.15 ;
				grado = C;
				break;
			}
			default: {
				System.out.println(conversion);
			}
		}
		array.add(resultado);
		array.add(grado);
		return array;
	}
}
