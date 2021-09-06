package no.hvl.data100;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {

	public static void main(String[] args) {

		final int ANTALL = 10;
		for (int i = 0; i < ANTALL; i++) {

			String poengStreng = showInputDialog("Poengsum som skal omgjøres til bokstavkarakter");
			/*
			 * Sjekker om brukeren har skrvet inn en poengsum eller om brukeren har trykket
			 * seg ut av vinduet
			 */
			if (poengStreng != null) {

				int poeng = Integer.parseInt(poengStreng);
				if (poeng > 100) {
					i--;
					showMessageDialog(null, "Du har oppgitt en ugyldig verdi. Skriv inn karakteren på nytt!");
				} else if (poeng <= 100 && poeng >= 90) {
					showMessageDialog(null, "Karakteren er: A");
				} else if (poeng >= 80) {
					showMessageDialog(null, "Karakteren er: B");
				} else if (poeng >= 60) {
					showMessageDialog(null, "Karakteren er: C");
				} else if (poeng >= 50) {
					showMessageDialog(null, "Karakteren er: D");
				} else if (poeng >= 40) {
					showMessageDialog(null, "Karakteren er: E");
				} else if (poeng >= 0) {
					showMessageDialog(null, "Karakteren er: F");
				} else {
					i--;
					showMessageDialog(null, "Du har oppgitt en ugyldig verdi. Skriv inn karakteren på nytt!");
				}

			} else {

				System.out.println("Brukeren har avsluttet vinduet");
				return;
			}

		}

	}

}
