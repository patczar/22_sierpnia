package sklep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ObslugaCSV {
	
	private static final String SEP = ";";

	public static List<Produkt> odczytaj(String sciezka) {
		return odczytaj(new File(sciezka));
	}

	public static List<Produkt> odczytaj(File plik) {
		List<Produkt> lista = new ArrayList<>();
		try(BufferedReader in = new BufferedReader(new FileReader(plik))) {
			String linia;
			while((linia = in.readLine()) != null) {
				String[] t = linia.split(SEP);
				Produkt p = new Produkt(Integer.parseInt(t[0]), t[1], new BigDecimal(t[2]));
				lista.add(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public static void zapisz(List<Produkt> lista, String sciezka) {
		zapisz(lista, new File(sciezka));
	}
	
	public static void zapisz(List<Produkt> lista, File plik) {
		try(PrintWriter out = new PrintWriter(plik)) {
			for (Produkt p : lista) {
				out.print(p.getId());
				out.print(SEP);
				out.print(p.getNazwa());
				out.print(SEP);
				out.print(p.getCena());
				out.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
