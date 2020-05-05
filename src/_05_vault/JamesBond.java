package _05_vault;

public class JamesBond {
	
	public int findCode(Vault VaultObject) {
		for(int i =0; i<100; i++) {
			if(VaultObject.tryCode(i)) {
				System.out.println("the code is "+i);
				return i;
			}
		}
		System.out.println("could not find code");
		return 0;
	}

}
