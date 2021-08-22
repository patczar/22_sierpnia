package hello;

import java.time.LocalDate;
import java.time.LocalTime;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("Teraz jest godzina " + LocalTime.now());
		System.out.println("A tak w ogóle, to dzisiaj jest " + LocalDate.now());
	}

}
