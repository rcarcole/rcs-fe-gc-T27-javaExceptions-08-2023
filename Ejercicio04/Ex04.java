package Ejercicio04;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {

		// Creación
		calculadora Calculadora = new calculadora();

		double num1;
		double num2;

		try {
			String operador = JOptionPane.showInputDialog("Porfavor, introduce un operador.\nSuma +\nResta -\nMultiplicación *\nPotencia ^\nRaíz cuadrada r2\nRaíz cúbica r3\nDivisión /");
			Calculadora.setOperador(operador);

			switch (operador) {
				case "+":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(Calculadora, num1, num2);
					break;
	
				case "-":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(Calculadora, num1, num2);
					break;
	
				case "*":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(Calculadora, num1, num2);
					break;
	
				case "/":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(Calculadora, num1, num2);
					break;
	
				case "^":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(Calculadora, num1, num2);
					break;
	
				case "r2":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
	
					calculoUnDigito(Calculadora, num1);
					break;
	
				case "r3":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
	
					calculoUnDigito(Calculadora, num1);
					break;
					
				default:
					Calculadora.calcular();
					break;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void calculoDosDigitos(calculadora calculadora, double num1, double num2) {
		calculadora.setNum1(num1);
		calculadora.setNum2(num2);

		JOptionPane.showMessageDialog(null, "Resultado: " + calculadora.calcular());
	}

	public static void calculoUnDigito(calculadora calculadora, double num1) {
		calculadora.setNum1(num1);

		JOptionPane.showMessageDialog(null, "Resultado: " + calculadora.calcular());
	}

}