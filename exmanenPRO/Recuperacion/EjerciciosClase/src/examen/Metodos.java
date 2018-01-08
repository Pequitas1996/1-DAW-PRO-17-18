package examen;

import java.util.Random;
import modelo.Vehiculo;


public class Metodos {

	// ejercicio 1



	public boolean metodo1(String nifs) {
		char[] letrasValidas = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };

		if (nifs.length() != 9)
			return false;
		String numeros = nifs.substring(0, 8);
		// System.out.println(numeros);
		int numerosTrue;
		try {
			numerosTrue = Integer.parseInt(numeros);
		} catch (NumberFormatException e) {
			return false;
		}
		int resto = numerosTrue % 23;
		if (letrasValidas[resto] != nifs.charAt(8))
			return false;
		return true;
	
	
}

	// ejercicio 2

	public Vehiculo[] metodo(String[] vehiculo) {
		Vehiculo[]resultado = new Vehiculo[vehiculo.length];
		for (int i = 0; i < resultado.length; i++) {
			
			try {
				String[]vehiculoLista = vehiculo[i].split("@");
				Vehiculo vehi= new Vehiculo();
				vehi.setId(Integer.parseInt(vehiculoLista[0]));
				vehi.setMarca(vehiculoLista[1]);
				vehi.setModelo(vehiculoLista[2]);
				vehi.setPrecio(Float.parseFloat(vehiculoLista[3]));
				resultado[i]=vehi;
			}catch(NumberFormatException e) {
				
			}
			
		}
		return resultado;
		
	}
	// ejercicio 3
	
	public int[][] metodo3(int partidas, int participantes){
		
		int[][] resultado = new int [participantes][partidas];
	
		Random partido = new Random();
		
		for (int j = 0; j < participantes; j++) {
			for (int i = 0; i < resultado.length; i++) {
				resultado[i][j] = 1 + partido.nextInt(6);	
			}
		}
		
		return resultado;
		
	}

}	
		

	

