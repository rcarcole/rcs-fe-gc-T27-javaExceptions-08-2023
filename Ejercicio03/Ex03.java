package Ejercicio03;

import java.util.Random;

//Definición de la excepción personalizada
class NumeroImparException extends Exception {
 public NumeroImparException(String message) {
     super(message);
 }
}

//Clase que genera un número aleatorio y verifica si es par o impar
class NumeroAleatorioParImpar {
 public void generarYVerificar() throws NumeroImparException {
     Random random = new Random();
     int numeroAleatorio = random.nextInt(1000); // Genera un número aleatorio entre 0 y 999
     
     System.out.println("Generando número aleatorio...");
     System.out.println("El número aleatorio generado es: " + numeroAleatorio);
     
     if (numeroAleatorio % 2 == 0) {
         throw new NumeroImparException("Es par");
     } else {
         throw new NumeroImparException("Es impar");
     }
 }
}

//Clase principal que ejecuta el programa
public class Ex03 {
 public static void main(String[] args) {
     NumeroAleatorioParImpar generador = new NumeroAleatorioParImpar();
     
     try {
         generador.generarYVerificar();
     } catch (NumeroImparException e) {
         System.out.println(e.getMessage());
     }
 }
}
