package com.br.ola.mundo;
import java.util.Scanner;
import java.util.scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner entrada  = new Scanner (System.in);
		
		int max = entrada.nextInt ();
		int min = 50;
		
		int media = (max + min) / entrada.nextInt();
		
				System.out.println(media);
	}
     

}
