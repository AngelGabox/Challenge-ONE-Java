import javax.swing.JOptionPane;

public class NaNException{

	public NaNException() {
		JOptionPane.showInputDialog("valor , el valor ingresado debe ser un numero");
	}
	
	public NaNException(String msg){
		JOptionPane.showInputDialog(msg);
	}
}
