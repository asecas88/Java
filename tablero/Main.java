package ejercicio2;

/*  Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualize su posicion dentro del mismo.
    Los movimientos posibles son ARRIBA ABAJO IZQUIERDA DERECHA
    Tras cada movimiento el programa mostrara la nueva dirección elegida y las coordenadas de situacion del objeto dentro del tablero */

public class Main {
				
	public static void main(String args[]) {
		
		Logico tablero = new Logico();
		
		do{			
			tablero.mostrarTablero();
			tablero.pedirMovimiento();
			
		}while(tablero.dentroTablero == true); 
		
		System.out.println("\nFIN");
		
	}	
}
