/* Convertendo um número para binário */

package pilha;

import java.util.Scanner;

public class TestePilha {
	
	public static void main(String [] args) {
		Pilha p1 = new Pilha();
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		
		while(num != 0) {
			p1.push(num % 2);
			num = num / 2;
		}
		
		while(!p1.isEmpty()) {
			System.out.print(p1.pop());
		}
	}

}
