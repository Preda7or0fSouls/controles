package PaqueteInicial;
import java.util.Scanner;
public class E06 {
/*scriba un programa que reciba como entrada las longitudes de los dos catetos a y b de un triángulo rectángulo,
 *  y que entregue como salida el largo de la hipotenusa c del triangulo,
 *   dado por el teorema de Pitágoras: c2=a2+b2.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	
		
		
		System.out.println("Ingrese cateto a: ");

		double x = entrada.nextDouble();
		
		System.out.println("Ingrese cateto b : ");

		double y = entrada.nextDouble();
		
		double hypo = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("La hipotenusa es " + hypo);
		
		entrada.close();

	}

}
