package ejercicio1;

/*  Construir un programa que calcule el área y el perímtero de un cuadrilatero dada la longitud de sus dos lados.
    Los valores de la longitud deberan introducirse por linea de ordenes.
    Si es un cuadrado solo se proporcionará la longitud de uno de los lados al constructor.                       */ 

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		float lado1, lado2;	
		
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado 1:"));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado 2:"));
		
		Cuadrilatero objeto;		
		
		if(lado1 == lado2) {
			
			objeto = new Cuadrilatero(lado1);
		}
		else {
			
			objeto = new Cuadrilatero(lado1, lado2);
		}
		
		System.out.println("El perimetro es: " + objeto.Perimetro());
		System.out.println("El area es: " + objeto.Area());		
	}

}
