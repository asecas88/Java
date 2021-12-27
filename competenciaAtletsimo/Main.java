package ejercicio2;

/* Construir un programa para una competencia de atletismo, 
 *   el programa debe gestionar una serie de atletas caracterizados por su número de atleta, nombre y tiempo de carrera.
 *   al final el programa debe mostrar los datos del atleta ganador de la carrera.      */

import javax.swing.JOptionPane;
import java.util.Scanner;
 
public class Main {
	
	// obteniendo indice de objeto con menor tiempo
	
	public static int obtenerIndice(Competencia array[]) {
		
		float tiempo;
		int indice = 0;
		
		tiempo = array[0].getTiempo();
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i].getTiempo() < tiempo) {
				
				tiempo = array[i].getTiempo();
				indice = i;
			}			
		}
		
		return indice;				
	}
	
	public static void main(String[] args) {                                        // MAIN
		
		Scanner dataentry = new Scanner(System.in);
		
		int nAtletas, numero;
		String nombre;
		float tiempo;
		
		// creando array objetos
		
		nAtletas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de atletas que compiten"));
		
		Competencia atleta[] = new Competencia[nAtletas];
		
		// inicializando array
		
		for(int i = 0; i < nAtletas; i++) {
						
			System.out.println("Atleta " + (i+1));
			System.out.print("\nNumero: ");
			numero = dataentry.nextInt();
			dataentry.nextLine();          //liberar buffer
			System.out.print("Nombre: ");
			nombre = dataentry.nextLine();
			System.out.print("Tiempo de vuelta(seg): ");
			tiempo = dataentry.nextFloat();
			
			atleta[i] = new Competencia(numero, nombre, tiempo);			
			System.out.println();
		}
		
		// obteniendo resultado
		
		int indiceMenor = Main.obtenerIndice(atleta);
		
		// mostrando resultado
		
		System.out.println(atleta[indiceMenor].mostrarResultado());
				
	}
}
