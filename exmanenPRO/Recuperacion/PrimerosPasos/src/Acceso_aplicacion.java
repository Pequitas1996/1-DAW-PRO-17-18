import javax.swing.*;
/*En esta actividad lo que hizimos fue utilizar la consola junto con el metodo
 * imputDialog que sirve para mostrarnos otra ventana emergente para colocar
 * nuevos datos que en este caso nos pide que introduzcamos correctamente la 
 * contraseņa, y si no la introduces en la consola saldra un mensaje de error 
 * y si es la contraseņa te dara la bienvenida*/
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Pequitas";
		
		String pass="";
		
		while (clave.equals(pass) ==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa, por favor");
			
			if (clave.equals(pass) ==false) {
				
				System.out.println("Contraseņa incorrecta");			
			}
		}
		
	System.out.println("Contraseņa correcta, Acceso permitido");

	}

}
