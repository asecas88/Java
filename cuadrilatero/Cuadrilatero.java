package ejercicio1;    
                                 
public class Cuadrilatero {
	
	private float lado1, lado2;
	
	public Cuadrilatero(float lado1, float lado2) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;	
	}
	
	public Cuadrilatero(float lado) {
		
		lado1 = lado2 =	lado;	
	}
	
	public float Perimetro() {
		
		float perimetro = (lado1 + lado2) * 2;
		return perimetro;
	}
	
	public float Area() {
		
		float area = lado1 * lado2;
		return area;
	}

}
