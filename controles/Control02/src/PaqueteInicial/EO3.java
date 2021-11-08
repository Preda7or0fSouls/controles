package PaqueteInicial;
import java.util.Scanner;
public class EO3 {
/*Escriba un programa que calcule el promedio de 4 notas ingresadas por el usuario:*/
	public static void main(String[] args) {
		int promedio;
		
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Ingrese la primera nota: ");
		  int nota1 = entrada.nextInt();
		  
		  System.out.println("Ingrese la segunda nota: ");
		  int nota2 = entrada.nextInt();
		  
		  System.out.println("Ingrese la tercera nota: ");
		  int nota3 = entrada.nextInt();
		  
		  System.out.println("Ingrese la cuarta nota: ");
		  int nota4 = entrada.nextInt();
		  
		  promedio = (nota1 + nota2 + nota3 + nota4 )/4;
		  
		  System.out.println("Primera nota: " + nota1);
		  System.out.println("Segunda nota: " + nota2);
		  System.out.println("Tercera nota: " + nota3);
		  System.out.println("Cuarta nota: " + nota4);
		  System.out.println("El promedio es: " + promedio);
		  
		  entrada.close();
	}

}
