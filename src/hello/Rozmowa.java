package hello;

import javax.swing.JOptionPane;

public class Rozmowa {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imię?");
		JOptionPane.showMessageDialog(null, "Witaj " + imie);
		int wiek = Integer.parseInt(JOptionPane.showInputDialog("Ile masz lat?"));
		if(wiek >= 18) {
			JOptionPane.showMessageDialog(null, "Chodźmy na piwo");
		} else {
			JOptionPane.showMessageDialog(null, "Może lemoniadę?");
		}
	}

}
