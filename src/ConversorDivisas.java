import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class ConversorDivisas extends Conversor {
	public static final String PESOS_COL = "Pesos Colombianos";
	public static final String DOLAR = "Dólares"; 
	public static final String EURO = "Euros";
	public static final String LIBRAS = "Libras Esterlinas";
	public static final String YEN = "Yen Japones";
	public static final String WON_SUR_COREANO = "Won Sur Coreano";
	static Object[] opciones = {
			"De "+PESOS_COL+" a "+DOLAR, 
			"De "+PESOS_COL+" a "+EURO,
			"De "+PESOS_COL+" a "+LIBRAS,
			"De "+PESOS_COL+" a "+YEN,
			"De "+PESOS_COL+" a "+WON_SUR_COREANO,
			"De "+DOLAR+" a "+PESOS_COL,
			"De "+EURO+" a "+PESOS_COL,
			"De "+LIBRAS+" a "+PESOS_COL,
			"De "+YEN+" a "+PESOS_COL,
			"De "+WON_SUR_COREANO+" a "+PESOS_COL
	};         
	
	public String menuDeOpciones() {
		String result = (String) JOptionPane.showInputDialog(
				null, 
				"Escoge la moneda a la que deseas convertir tu dinero", 
				"Monedas",
	            -1, 
	            null, 
	            opciones, 
	            opciones[0]
				);
		return result;
	}
	
	public ArrayList<Object> operacion(String conversion, double monto) {
		double resultado = 0;
//		Cada valor equivale a 1 USD en el dia 6/03/2023
		double cop = 4766.07;
		double euro = 0.94;
		double libras = 0.83;
		double yen = 135.80;
		double won = 1297.75;
		ArrayList<Object> array = new ArrayList<>(2);
		String divisa= ""; 
		switch(conversion){
			case "De "+PESOS_COL+" a "+DOLAR:{
				resultado = monto / cop; 
				divisa = DOLAR;
				break;
			}
			case "De "+PESOS_COL+" a "+EURO:{
				resultado = (monto * euro)/ cop;
				divisa = EURO;
				break;
			}
			case "De "+PESOS_COL+" a "+LIBRAS:{
				resultado = (monto * libras)/ cop;
				divisa = LIBRAS;
				break;
			}
			case "De "+PESOS_COL+" a "+YEN:{
				resultado = (monto * yen)/ cop;
				divisa = "Yenes Japoneses";
				break;
			}
			case "De "+PESOS_COL+" a "+WON_SUR_COREANO:{
				resultado = (monto * won)/ cop;
				divisa = "Wones Sur Coreanos";
				break;
			}
			case "De "+DOLAR+" a "+PESOS_COL:{
				resultado = monto *  cop;
				divisa = PESOS_COL;
				break;
			}
			case "De "+EURO+" a "+PESOS_COL:{
				resultado = (monto *  cop)/euro;
				divisa = PESOS_COL;
				break;
			}
			case "De "+LIBRAS+" a "+PESOS_COL:{
				resultado = (monto *  cop)/libras;
				divisa = PESOS_COL;
				break;
			}
			case "De "+YEN+" a "+PESOS_COL:{
				resultado = (monto *  cop)/yen;
				divisa = PESOS_COL;
				break;
			}
			case "De "+WON_SUR_COREANO+" a "+PESOS_COL:{
				resultado = (monto *  cop)/won;
				divisa = PESOS_COL;
				break;
			}
			default: {
				System.out.println(conversion);
			}
		}
//		System.out.println(resultado);
		array.add(resultado);
		array.add(divisa);
		return array;
	}
}
