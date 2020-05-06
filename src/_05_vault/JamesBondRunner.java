package _05_vault;

import javax.swing.JOptionPane;

public class JamesBondRunner {

	public static void main(String[] args) {
		JamesBond JamesBondObject = new JamesBond();

		String answer = JOptionPane.showInputDialog("Plesase enter code. 1-100 it is 1 number.");

		int code = Integer.parseInt(answer);
		
		System.out.println(code);
		
		Vault VaultObject = new Vault();

		JamesBondObject.findCode(VaultObject);

		VaultObject.tryCode(code);
		
		if(VaultObject.tryCode(code)==true) {
			JOptionPane.showMessageDialog(null, "Vault opened");

		}
		else
		{
			JOptionPane.showMessageDialog(null, "Vault not opened, please try again.");
		}

	}

}
