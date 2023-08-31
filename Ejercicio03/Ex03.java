package Ejercicio03;

import java.util.Random;

<<<<<<< HEAD
//Definición de la excepción
=======
//Definición de la excepción personalizada
>>>>>>> a71aec1003addbe29850adfe028f0ac9e33e3627
class NumeroImparException extends Exception {
 public NumeroImparException(String message) {
     super(message);
 }
}

<<<<<<< HEAD
class NumeroAleatorioParImpar {
 public void generarYVerificar() throws NumeroImparException {
     Random random = new Random();
     int numeroAleatorio = random.nextInt(1000);
=======
//Clase que genera un número aleatorio y verifica si es par o impar
class NumeroAleatorioParImpar {
 public void generarYVerificar() throws NumeroImparException {
     Random random = new Random();
     int numeroAleatorio = random.nextInt(1000); // Genera un número aleatorio entre 0 y 999
>>>>>>> a71aec1003addbe29850adfe028f0ac9e33e3627
     
     System.out.println("Generando número aleatorio...");
     System.out.println("El número aleatorio generado es: " + numeroAleatorio);
     
     if (numeroAleatorio % 2 == 0) {
         throw new NumeroImparException("Es par");
     } else {
         throw new NumeroImparException("Es impar");
     }
 }
}

<<<<<<< HEAD
=======
//Clase principal que ejecuta el programa
>>>>>>> a71aec1003addbe29850adfe028f0ac9e33e3627
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
