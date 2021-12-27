package ejercicio1;

/*  Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio,
 *    imprima las propiedades del vehículo más barato. 
 *    Para ello, se deberán leer por teclado las características de cada vehículo y crear una clase que represente a cada uno de ellos.
 */

import java.util.Scanner;

public class Main {
	
	// obteniendo indice de arreglo de objeto mas barato
	
	public static int obtenerIndice(Vehiculo array[]) {
  //                                {               }        
  //                                        ^                  le paso un array de objetos de clase vehiculo
		int precio, indice = 0;
		
		precio = array[0].getPrecio();
		
		for(int i = 1; i < array.length; i++) {
				
			if(array[i].getPrecio() < precio) {
				
				precio = array[i].getPrecio();
				
				indice = i;
			}	
		}
			
		return indice;
	}
	
	public static void main(String[] args) {

		Scanner dataentry = new Scanner(System.in);
		
		String marca, modelo;
		int precio, nVehiculos;
		
		System.out.print("Ingrese nro de vehiculos: ");
		nVehiculos = dataentry.nextInt();
		
		// creando un array de objetos
		
		Vehiculo auto[] = new Vehiculo[nVehiculos];    
	    /*  ^                                           clase a cual pertence
	               ^                                    nombre del array
	                                        ^           nro de objetos del array     */		
		// inicializando objetos		            
		
		for(int i = 0; i < nVehiculos; i++) {
			
			dataentry.nextLine();                   //  liberar buffer (si se agolpan los dataentry tipo String)
			
			System.out.println("\nAuto " + (i+1));
			System.out.print("Marca: ");
			marca = dataentry.nextLine();
			System.out.print("Modelo: ");
			modelo = dataentry.nextLine();
			System.out.print("Precio: ");
			precio = dataentry.nextInt();
			
			auto[i] = new Vehiculo(marca, modelo, precio);
		}
		
		// obteniendo objeto mas barato
		
		int indiceAutoBarato = obtenerIndice(auto);             
		                    //        ^                   al ser metodo estatico puedo llamarlo directamente sin instanciar                   
		                    //                ^           le paso array de objetos
		            
		// imprimiendo resultado
		
		System.out.println(auto[indiceAutoBarato].mostrarDatos());
		
		
	}
}
