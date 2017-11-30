package accesodatos;

import modelo.Vivienda;


public class Operaciones {
	private Vivienda [] viviendas;
	public void cargarViviendas() {
		//
	}
	
	public Vivienda[] compactarArray (Vivienda[] viviendasTodas) {
		int contador=0;
		
		for (int i = 0; i < viviendasTodas.length; i++) {
			if(viviendasTodas[i]!=null) {
				contador++;
				
			}
		}
		viviendas= new Vivienda[contador];
		contador=0;
		
		for (int i = 0; i < viviendasTodas.length; i++) {
			if(viviendasTodas[i]!=null) {
				viviendas[contador++]=viviendasTodas[i];
				
			}
		}
		
		return viviendas;
	}

}
