package ar.edu.unju.fi.aplicacion.calculo.tiempo;

import java.util.Scanner;

public class P12Calculo_tiempo {
     
	public static double t;
	public static double h;
	public static double g=9.81;
	public static double resultado;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Ingrese Altura:");
       h= sc.nextDouble();
       
       resultado= (2*h)/g;
       
       t= Math.sqrt(resultado);
       
       System.out.println("El tiempo es:"+ t + " segundos");
	}

}
