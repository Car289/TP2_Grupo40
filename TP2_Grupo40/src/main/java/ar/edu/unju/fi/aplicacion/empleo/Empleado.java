package ar.edu.unju.fi.aplicacion.empleo;

import java.util.Scanner;

public class Empleado {
          
	     public static String nombre;
		 public static int Legajo;
		 public static String Email;
		 public static double Sueldo;
		 public static int horas_trabajadas;
		 public static int prod;
		 public static String fecha_ingreso;
			
	/*	public Empleado(String nombre, String fecha_ingreso,String Email, double Sueldo, int horas_trabajadas){
			
			this.nombre=nombre;
			this.fecha_ingreso=fecha_ingreso;
			this.Email=Email;
			this.Sueldo=Sueldo;
			this.horas_trabajadas=horas_trabajadas;	
			
		}
		public Empleado(){
			
			
		}
		
		//Metodo_de_Acceso_a_los_datos
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getFecha_ingreso() {
			return fecha_ingreso;
		}
		public void setFecha_ingreso(String fecha_ingreso) {
			this.fecha_ingreso = fecha_ingreso;
		}
		public int getLegajo() {
			return Legajo;
		}
		public void setLegajo(int legajo) {
			Legajo = legajo;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public double getSueldo() {
			return Sueldo;
		}
		public void setSueldo(double sueldo) {
			Sueldo = sueldo;
		}
		public int getHoras_trabajadas() {
			return horas_trabajadas;
		}
		public void setHoras_trabajadas(int horas_trabajadas) {
			this.horas_trabajadas = horas_trabajadas;
		}
		public static int getProd() {
			return prod;
		}
		public static void setProd(int prod) {
			Empleado.prod = prod;
		}
		*/
		
		//Clase_"main"
		@SuppressWarnings({ "resource", "unused" })
		public static void main(String[] args) {
			
	   Scanner entrada = new Scanner(System.in);
	   Empleado objEmpleado = new Empleado();
	   
	   
	   
	   System.out.println("Ingrese nombre:");
	   
	   nombre=entrada.nextLine();
	   
       System.out.println("Ingrese Legajo:");
	   
	   Legajo=entrada.nextInt();
	   
       System.out.println("Ingrese Email:");
	   
	   Email=entrada.nextLine();
	   
       System.out.println("Ingrese Horas Trabajadas:");
	   
	   horas_trabajadas=entrada.nextInt();
			
		
	   if (horas_trabajadas==160){
			
			prod= 160*600;
			
			System.out.println("Sueldo del empleado:"+ prod);
		
		}
		else {
			
	     if (horas_trabajadas>161) {
	    	 
	    	 prod=horas_trabajadas*650;
	    	 
	     System.out.println("Sueldo del empleado:"+ prod);
	    	 
	     }
		 
		}
			
	}		
	}

