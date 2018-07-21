package test;

import function.Racourcir;
import function.Racourcir2;

public class TestRacourcir {
	public static void main(String[] args) {
		Racourcir r1 = new Racourcir();
		String liste = r1.shortUrl("http://localhost/phpmyadmin/db_export.php?db=javaee");
		System.out.println(liste);
	}
}
