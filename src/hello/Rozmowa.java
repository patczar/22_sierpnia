package hello;

import javax.swing.JOptionPane;

public class Rozmowa {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imię?");
		JOptionPane.showMessageDialog(null, "Witaj " + imie);
	}

}
