package _05_vault;

import java.util.Random;

public class Vault {


		public boolean tryCode(int code) {
			
			if(code==realcode) {
				return true;
			}
			else
			{
				return false;
			}
		}
		
		Random rand= new Random(100);
		
		private int realcode = new Random().nextInt(100);

	}


