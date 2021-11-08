package PaqueteInicial;

import java.util.Scanner;

public class E05 {
	/*
	 * Escriba un programa que pida al usuario un entero de tres dígitos, y entregue
	 * el número con los dígitos en orden inverso:
	 */

	public static void main(String[] args) {
		int num, x = 0, resto;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce número: ");

		num = entrada.nextInt();

		while (num > 0) {
			resto = num % 10;
			x = x * 10 + resto;
			num /= 10;
		}

		System.out.println(x);
		entrada.close();
	}

}
