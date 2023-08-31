package Ejercicio05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica la cantidad de contraseñas a generar.");
		int cantidadPasswords = sc.nextInt();
		
		Password passwords[] = new Password[cantidadPasswords];
		
		System.out.println("Indica la longitud de las contraseñas a generar.");
		int longitudPasswords = sc.nextInt();
		
		for (int i = 0; i < passwords.length; i++) {
			passwords[i]= new Password(longitudPasswords);
		}
		
		// Array para guardar si son passwords fuertes o no
		boolean sonPasswordsFuertes[] = new boolean[cantidadPasswords];
		for (int i = 0; i < passwords.length; i++) {
			sonPasswordsFuertes[i] = passwords[i].esFuerte();
		}
		
		// Mostramos las contraseñas y si son fuertes o no.
		for (int i = 0; i < passwords.length; i++) {
			System.out.println(passwords[i].getPassword() + " - " + sonPasswordsFuertes[i]);
		}
	}
}