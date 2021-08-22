package sklep;

import java.math.BigDecimal;
import java.util.Objects;

public class Produkt {
	private int id;
	private String nazwa;
	private BigDecimal cena;
	
	public Produkt(int id, String nazwa, BigDecimal cena) {
		this.id = id;
		this.nazwa = nazwa;
		this.cena = cena;
	}

	public Produkt(int id, String nazwa, int cena) {
		this(id, nazwa, BigDecimal.valueOf(cena));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public BigDecimal getCena() {
		return cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Produkt [id=" + id + ", nazwa=" + nazwa + ", cena=" + cena + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cena, id, nazwa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produkt other = (Produkt) obj;
		return Objects.equals(cena, other.cena) && id == other.id && Objects.equals(nazwa, other.nazwa);
	}

	public void podwyzka(double podwyzka) {
		this.cena = this.cena.multiply(BigDecimal.ONE.add(BigDecimal.valueOf(podwyzka / 100.0))).setScale(2);
	}

}
