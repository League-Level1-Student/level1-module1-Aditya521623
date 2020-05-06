package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	
	
	public boolean tryCode(int code) {

		System.out.println(realcode);
		if (code == realcode) {
			return true;
		} else {
			return false;

		}
	}

	
	private int realcode;	


}
