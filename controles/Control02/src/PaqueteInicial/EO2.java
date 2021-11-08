package PaqueteInicial;
import java.util.Scanner;
public class EO2 {
//Escriba un programa que reciba como entrada el radio de un círculo y entregue como salida su perímetro y su área:
	
	public static void main(String[] args) {
		
	 double area,perimeter;
	 
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Ingrese el radio: ");
	  double radius = entrada.nextDouble();
	  
	  entrada.close();
	  
	  perimeter = 2 * Math.PI * radius;
	  area = Math.pow(radius, 2) *Math.PI;
	  
	  System.out.println("Permimetro: "+ perimeter);
	  System.out.println("Area: "+ area);

	  entrada.close();
	}
	

}
