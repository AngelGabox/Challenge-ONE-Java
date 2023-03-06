import javax.swing.JOptionPane;

public abstract class Conversor {
	
	public double montoAConvertir() {
		boolean canContinue = false;
        Double number = 0.0;
        do {
            String userResponse = JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir tu dinero: ", 0);
            try {
                number =  Double.parseDouble(userResponse);
                canContinue = true;
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un dato valido", "Error", JOptionPane.ERROR_MESSAGE);
                canContinue = false;
            }
        } while (!canContinue);
        return number;
}

	public void resultadoConversion(double valor, String unidad) {		
		JOptionPane.showMessageDialog(null, String.format("Tienes: %.2f", valor)+ " " + unidad, "App message", JOptionPane.INFORMATION_MESSAGE);
	}
}
