package application;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome  = sc.nextLine();
		int    idade = sc.nextInt();
		System.out.println("Nome: " + nome + "\nIdade :" + idade);
		
		sc.close();
	}

}
