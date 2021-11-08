package PaqueteInicial;
import java.util.Scanner;
public class EO4 {
/*Escriba un programa que convierta de centímetros a pulgadas. 
 * Una pulgada es igual a 2.54 centímetros.*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 double x = 2.54;
		 System.out.println("Ingrese longitud: ");
		  double longitud = entrada.nextDouble();
		  
		  double inch = longitud / x;
		   System.out.println(longitud  + "cm  = " + inch + "in");
		   
			 System.out.println("Ingrese longitud: ");
			  double longitud2 = entrada.nextDouble();
			  
			  double inch2 = longitud2 / x;
			   System.out.println(longitud2  + "cm  = " + inch2 + "in");

			   entrada.close();
		}
	}


