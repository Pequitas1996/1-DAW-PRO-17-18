package paresimpares;

import java.util.Scanner;


public class ParesImpares {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		a=5;
		a=a+10;
		
	      
	     sc = new Scanner(System.in);
		 System.out.println("introduzca un numero");
		 int cp=0;
		 int ci=0;
		 int entero = sc.nextInt();
		 while(entero!=0)
		 {
			 if(entero%2==0)
				 cp++;
			 else
				 ci++;
			  entero = sc.nextInt();
		 }
			
		 System.out.println("Ha introducido "+ cp + " números Pares");
		 System.out.println("Ha introducido "+ ci + " números Impares");
		
	}
}
