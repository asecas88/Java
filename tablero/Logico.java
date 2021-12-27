package ejercicio2;

import javax.swing.JOptionPane;

public class Logico {
	
	// mostrando tablero actualizado
		
	private String tablero[][] = new String[3][3];	
    private int    pos[]       = {1,1};
    
    public void mostrarTablero() {
    	
    	for(int x = 0; x < 3; x++) {
    		
    		for(int i = 0; i < 3; i++) {
    			
    			if(x == pos[0] && i == pos[1]) {
    				
    				tablero[x][i] = "[x]";
    				
    			}else {
    				
    				tablero[x][i] = "[ ]";  				    				
    			}
    			
    			System.out.print(tablero[x][i]);     			   			
    		}
    		
    		System.out.println();
    	}
    	
    	System.out.println("\nPosición actual: fila = " + pos[0] + " col = " + pos[1]);
    	System.out.println("----------------------------");
    }
    
    // pidiendo nuevo movimiento
    
    private int mov;
    public boolean dentroTablero = true;
    
	public void pedirMovimiento() {
		
		mov = Integer.parseInt(JOptionPane.showInputDialog(
				               "1. Arriba\n2. Abajo\n3. Derecha\n4. Izquierda\n\nIngrese nueva posicion"));
		
		switch(mov) {
		
		    case 1: 
		    	
		    	pos[0]--;
			
		    	if(pos[0] < 0) {
		
		    		JOptionPane.showMessageDialog(null, "Fuera del tablero");
		    		dentroTablero = false;
				
		    	}else {
				
		    		System.out.println("\nArriba\n");
		    	}		    	
		    break;
		    			    	
		    case 2:
		    	
		    	pos[0]++;
				
				if(pos[0] > 2) {
					
					JOptionPane.showMessageDialog(null, "Fuera del tablero");
					dentroTablero = false;
					
				}else {
					
					System.out.println("\nAbajo\n");
				}			
			break;	
				
		    case 3:
		    	
		    	pos[1]++;
				
				if(pos[1] > 2) {
					
					JOptionPane.showMessageDialog(null, "Fuera del tablero");
					dentroTablero = false;
					
				}else {
					
					System.out.println("\nDerecha\n");
				}			
			break;	
				
		    case 4:
		    	
		    	pos[1]--;
				
				if(pos[1] < 0) {
					
					JOptionPane.showMessageDialog(null, "Fuera del tablero");
					dentroTablero = false;
					
			    }else {
					
					System.out.println("\nIzquierda\n");
				}		
			break;
			
			default:
				
				System.out.println("\nMovimiento no existente\n");
				
			break;									
		}						
	}    
       
}
