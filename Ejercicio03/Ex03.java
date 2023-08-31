package Ejercicio03;

import java.util.Random;

//Definición de la excepción
class NumeroImparException extends Exception {
 public NumeroImparException(String message) {
     super(message);
 }
}


class NumeroAleatorioParImpar {
 public void generarYVerificar() throws NumeroImparException {
     Random random = new Random();
     int numeroAleatorio = random.nextInt(1000);

class NumeroAleatorioParImpar {
 public void generarYVerificar() throws NumeroImparException {
     Random random = new Random();
     int numeroAleatorio = random.nextInt(1000); 
     
     System.out.println("Generando número aleatorio...");
     System.out.println("El número aleatorio generado es: " + numeroAleatorio);
     
     if (numeroAleatorio % 2 == 0) {
         throw new NumeroImparException("Es par");
     } else {
         throw new NumeroImparException("Es impar");
     }
 }
}

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
