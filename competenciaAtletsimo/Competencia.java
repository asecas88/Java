package ejercicio2;

public class Competencia {
	
	private int numero;
	private String nombre;
	private float tiempo;
	
	public Competencia(int numero, String nombre, float tiempo) {
		
		this.numero = numero;
		this.nombre = nombre;
		this.tiempo = tiempo;		
	}

	public float getTiempo() {
		
		return tiempo;
	}
	
	public String mostrarResultado() {
		
		return "El ganador es el atleta número " + numero + " (" + nombre + ") con un tiempo de " + tiempo + " segundos";   		
	}

}
