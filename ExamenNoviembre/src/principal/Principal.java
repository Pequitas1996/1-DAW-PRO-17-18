package principal;

import java.time.LocalDate;
import accesodatos.Operaciones;
import modelo.Vivienda;

public class Principal {

	public static void main(String[] args) {
		Vivienda [] viviendasListado = new Vivienda[8];
			
			Vivienda viv1 = new Vivienda(5481, "Montaña Alta", 'C', LocalDate.of(1900, 5, 15), true);
			Vivienda viv2 = new Vivienda(5485, "Calle Palomares", 'F', LocalDate.of(1900, 5, 15), false);
			Vivienda viv3 = new Vivienda(8751, "Calle Ventura", 'D', LocalDate.of(1900, 5, 15), true);
			viviendasListado[1]=viv1;
			viviendasListado[6]=viv3;
			viviendasListado[4]=viv2;
	 Operaciones op1= new Operaciones();
	 
	 	for(int i = 0; i <op1.compactarArray(viviendasListado).length; i++){
	 		System.out.println(op1.compactarArray(viviendasListado)[i].toString());
	 	}
	 
	System.out.println("Fin");
	}
}
