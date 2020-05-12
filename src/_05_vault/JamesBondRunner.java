package _05_vault;

import javax.swing.JOptionPane;

public class JamesBondRunner {

	public static void main(String[] args) {
		JamesBond JamesBondObject = new JamesBond();
		
		String secretCode = JOptionPane.showInputDialog("Set the code for the Vault");
		
		int code = Integer.parseInt(secretCode);
		
		Vault VaultObject = new Vault(code);

		JamesBondObject.findCode(VaultObject);


	}

}
