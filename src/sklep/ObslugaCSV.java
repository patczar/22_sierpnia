package sklep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObslugaCSV {
	
	public static List<Produkt> odczytaj(String sciezka) {
		List<Produkt> lista = new ArrayList<>();
		try(BufferedReader in = new BufferedReader(new FileReader(new File(sciezka)))) {
			String linia;
			while((linia = in.readLine()) != null) {
				String[] t = linia.split(";");
				Produkt p = new Produkt(Integer.parseInt(t[0]), t[1], Float.parseFloat(t[2]));
				lista.add(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
}
