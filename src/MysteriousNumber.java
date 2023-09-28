
public class MysteriousNumber {
	static boolean[] tab;

	public static boolean isMysterious(int n) {
		tab = new boolean[10];
		int[] n23 = { n * n, // n2
				n * n * n // n3
		};

		// 1ère vérif: On regarde si n2 et n3 contiennet les chiffres de 0 à 9 une et
		// une seule fois
		for (int i = 0; i < n23.length; i++) {
			while (n23[i] > 0) {
				int mod = n23[i] % 10;
				if (!tab[mod]) {
					tab[mod] = true;
				} else {
					return false;
				}
				n23[i] /= 10;
			}
		}

		// 2ème vérif: Est ce que tous les chiffres sont utilisés
		for (int i = 0; i < tab.length; i++) {
			if (!tab[i]) {
				return false;
			}
		}

		return true;
	}

}
