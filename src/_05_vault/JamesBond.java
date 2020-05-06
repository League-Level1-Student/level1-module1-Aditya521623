package _05_vault;

public class JamesBond {

	public int findCode(Vault VaultObject) {
		for (int i = 0; i < 100; i++) {
			if (VaultObject.tryCode(i)) {

				return i;
			}
		}

		return 0;
	}

}
