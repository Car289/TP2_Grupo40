package ar.edu.unju.fi.aplicacion.num_par;

import java.util.Scanner;

public class P3Num_Par {


	
		public static int num;
		public static int aux=1;

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			while (aux<=5) {
			
			System.out.println("Ingrese valor:");
			
			num = sc.nextInt();
			
		if (num %2==0){
				
				System.out.println( "Es par");	
			}
			
		else {
			
			   System.out.println("Es impar");
			}
			aux++;
			
	}
	}
	}	
	
