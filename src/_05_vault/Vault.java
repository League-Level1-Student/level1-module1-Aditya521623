package _05_vault;


public class Vault {
	
	private int realcode;	
	
	
	public Vault(int code) {
		realcode = code;
		
	}
	
	public boolean tryCode(int code) {

		System.out.println(code);
		if (code == realcode) {
			return true;
		} else {
			return false;

		}
	}
	
}
