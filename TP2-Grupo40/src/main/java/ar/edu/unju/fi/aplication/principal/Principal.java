package ar.edu.unju.fi.aplication.principal;
import java.util.Scanner;
public class Principal {
 //Declaracion de variables
@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero del 0 al 10: ");
		int n=sc.nextInt();
		int prod=1;
		if(n>=0 && n<=10) {
			for(int i = 1; i <=n; i++) {
				prod=prod*i;
			}
			System.out.println("El factorial es: "+prod);
		}
		else {
			System.out.println("El numero ingresado no es valido");			
		}
	}
}
