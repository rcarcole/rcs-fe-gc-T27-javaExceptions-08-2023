package Ejercicio01;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

class Adivinanza {
    private int numeroSecreto;
    private int intentos;

    public Adivinanza() {
        Random rand = new Random();
        this.numeroSecreto = 1 + rand.nextInt(500);
        this.intentos = 0;
    }

    public void jugar() {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        System.out.println("Adivina el número entre 1 y 500.");

        while(entrada != numeroSecreto) {
            System.out.print("Introduce un número: ");
            try {
                entrada = sc.nextInt();
                this.intentos++;

                if(entrada < numeroSecreto) {
                    System.out.println("El número es mayor.");
                } else if(entrada > numeroSecreto) {
                    System.out.println("El número es menor.");
                } else {
                    System.out.println("¡Lo adivinaste! Intentos: " + this.intentos);
                }
            } catch (InputMismatchException e) {
                System.out.println("¡¡¡¡¡¡¡¡ Introduce un número !!!!!!!");
                sc.next();
                this.intentos++;
            }
        }
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Adivinanza juego = new Adivinanza();
        juego.jugar();
    }
}
