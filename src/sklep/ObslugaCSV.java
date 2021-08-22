package sklep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
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
	
	public static void zapisz(List<Produkt> lista, String sciezka) {
		try(PrintWriter out = new PrintWriter(sciezka)) {
			for (Produkt p : lista) {
				out.print(p.getId());
				out.print(";");
				out.print(p.getNazwa());
				out.print(";");
				out.print(p.getCena());
				out.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
