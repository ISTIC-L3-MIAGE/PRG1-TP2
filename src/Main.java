
public class Main {

	public static void testDichoSearch() {
		DichoSearch.tab = DichoSearch.lireTabEntiers(5);
		DichoSearch.ecrireTabEntiers();
		DichoSearch.triTab();
		DichoSearch.ecrireTabEntiers();

		int[] searched = { 0, 99, 5, 6, 4 };
		System.out.println("\nRecherche dichotomique");
		for (int i = 0; i < DichoSearch.tab.length; i++) { // Fix it
			System.out.println(searched[i] + " exists ? -> " + DichoSearch.dichoSearch(searched[i]));
		}
	}

	public static void testMysteriousNumber() {
		int[] numbers = { 76, 61, 66, 24, 69 };
		System.out.println("\nVérification des nombres mystérieux");
		// for (int i = 0; i < numbers.length; i++) {
		for (int i = 32; i < 100; i++) {
			System.out.println(i + " est mystérieux ? -> " + MysteriousNumber.isMysterious(i));
		}
	}

	public static void main(String[] args) {
		// testDichoSearch();
		testMysteriousNumber();
	}

}
