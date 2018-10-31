package aula;

import java.util.Scanner;

public class teste {
	public static void main(String []args) {
	
	
	System.out.println("Digite um valor");
	Scanner input = new Scanner(System.in);
	
	int x = input.nextInt();
	
	System.out.println("Digite o outro valor");
	
	int y = input.nextInt();
	
	System.out.println(x + y);

	}
}