package no.hvl.data100;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {

		// Tar inn brukerinput

		int brukerInput = Integer.parseInt(showInputDialog("Skriv inn et tall"));

		while (brukerInput <= 0) {
			brukerInput = Integer
					.parseInt(showInputDialog("Ugyldig tall. Tallet må være større enn null. Prøv Igjen!"));
		}

		// Regner n-fakultetet og viser svaret i et dialogvindu

		long total = 1;

		for (int i = 1; i <= brukerInput; i++) {
			total *= i;
		}

		showMessageDialog(null, "n! til " + brukerInput + " er " + sum);

	}

}
