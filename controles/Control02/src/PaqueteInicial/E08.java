package PaqueteInicial;
import java.util.Scanner;
public class E08 {

	public static void main(String[] args) {
		
		
		    Scanner entrada = new Scanner(System.in);
		    double real, decimal;
		    int realEnt;
		   
		    System.out.print("Ingresa  numero: ");
		    real = entrada.nextDouble();
		    realEnt = (int)real;
		    decimal = real - realEnt;
		   
		    System.out.printf("La parte decimal es: %f\n", decimal);
		   
		
	}

}
