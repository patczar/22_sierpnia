package sklep;

import java.io.File;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Podwyzka {

	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
		int coSieStalo1 = chooser.showOpenDialog(null);
		if(coSieStalo1 == JFileChooser.CANCEL_OPTION) {
			return;
		}
		File wejscie = chooser.getSelectedFile();
		
		List<Produkt> lista = ObslugaCSV.odczytaj(wejscie);
		
		double podwyzka = Double.parseDouble(JOptionPane.showInputDialog("Podaj procent podwyżki"));
		for (Produkt produkt : lista) {
			produkt.podwyzka(podwyzka);
		}
		
		int coSieStalo2 = chooser.showSaveDialog(null);
		if(coSieStalo2 == JFileChooser.CANCEL_OPTION) {
			return;
		}
		File wyjscie = chooser.getSelectedFile();

		ObslugaCSV.zapisz(lista, wyjscie);
	}

}
