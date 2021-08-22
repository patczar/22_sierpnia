package sklep;

import java.util.Objects;

public class Produkt {
	private int id;
	private String nazwa;
	private float cena;
	
	public Produkt(int id, String nazwa, float cena) {
		this.id = id;
		this.nazwa = nazwa;
		this.cena = cena;
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

	public float getCena() {
		return cena;
	}

	public void setCena(float cena) {
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
		return Float.floatToIntBits(cena) == Float.floatToIntBits(other.cena) && id == other.id
				&& Objects.equals(nazwa, other.nazwa);
	}
	
}
