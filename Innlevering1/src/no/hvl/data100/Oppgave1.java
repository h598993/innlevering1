package no.hvl.data100;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {

	public static void main(String[] args) {

		int bruttoInntekt = Integer.parseInt(showInputDialog("Skriv inn bruttoinntekt"));

		if (bruttoInntekt <= 184800 && bruttoInntekt >= 0) {
			System.out.println("Trinnskatten tilsvarer 0%. Inntekt etter trinnskatt er: " + bruttoInntekt + "kr");

		} else if (bruttoInntekt <= 260100) {
			int inntekt = (int) (bruttoInntekt * 0.983);
			System.out.println("Trinnskatten tilsvarer 1,7%. Inntekt etter trinnskatt er: " + inntekt + "kr");

		} else if (bruttoInntekt <= 651250) {
			int inntekt = (int) (bruttoInntekt * 0.96);
			System.out.println("Trinnskatten tilsvarer 4%. Inntekt etter trinnskatt er: " + inntekt + "kr");

		} else if (bruttoInntekt <= 1021550) {
			int inntekt = (int) (bruttoInntekt * 0.868);
			System.out.println("Trinnskatten tilsvarer 13,2%. Inntekt etter trinnskatt er: " + inntekt + "kr");

		} else if (bruttoInntekt > 1021550) {
			int inntekt = (int) (bruttoInntekt * 0.838);
			System.out.println("Trinnskatten tilsvarer 16,2%. Inntekt etter trinnskatt er: " + inntekt + "kr");

		} else {
			System.out.println("Du har tastet et ulovelig beløp. Prøv igjen.");

		}
	}
}
