package Ejercicio02;

import Ejercicio02.Exception.exception;

public class Ex02 {
    public static void main(String[] args) {
        try {
            System.out.println("Mensaje mostrado por pantalla");
            // Lanzando excepción
            throw new exception("esto es un objeto Exception");
        } catch (exception e) {
            System.out.println("Excepción capturada con el mensaje: " + e.getMessage());
        }
        System.out.println("Programa terminado");
    }
}