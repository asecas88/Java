package ejercicio1;

public class Vehiculo {

	private String marca, modelo;
	private int    precio;
	
	public Vehiculo(String marca, String modelo, int precio) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;		
	}
	
	public int getPrecio() {
		
		return precio; 
	}
	
	public String mostrarDatos() {
		
		return "\nEl auto mas barato es: \nMarca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio;
	}
	
	
	
}
