import java.util.Scanner;

public class DichoSearch {
	public static int[] tab;

	public static int[] lireTabEntiers(int n) {
		Scanner scan = new Scanner(System.in);
		int[] entiers = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Tapez l'eniter n" + (i + 1) + ": ");
			entiers[i] = scan.nextInt();
		}
		scan.close();
		return entiers;
	}

	public static void ecrireTabEntiers() {
		System.out.println("\nTableau d'entiers:");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println("");
	}

	public static void triTab() {
		// Algo du tri naîf
		for (int i = 0; i <= tab.length - 2; i++) {
			int rangmin = i;
			for (int j = i + 1; j <= tab.length - 1; j++) {
				if (tab[j] < tab[rangmin]) {
					rangmin = j;
				}
				int aux = tab[i];
				tab[i] = tab[rangmin];
				tab[rangmin] = aux;
			}
		}
	}

	public static boolean dichoSearch(int a) {
		int deb = 0, fin = tab.length - 1, milieu = (deb + fin) / 2;
		while (deb <= fin && a != tab[milieu]) {
			if (a < tab[milieu]) {
				fin = milieu - 1;
			} else {
				deb = milieu + 1;
			}
			milieu = (deb + fin) / 2;
		}
		return deb <= fin;
	}
}