package PaqueteInicial;
import java.util.Scanner;

public class E01 {
	public static void main(String[] args) {
		
		String nombre;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		
		nombre = entrada.nextLine();
		
        System.out.println("¡Hola " + nombre + "!");
		entrada.close();
    }
}
