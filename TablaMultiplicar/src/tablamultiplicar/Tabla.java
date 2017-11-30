package tablamultiplicar;

import java.util.Scanner;

public class Tabla {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero del 1 al 10");
		int num=sc.nextInt();
		if(num>=0 && num<=10) 
		{
			while(i<=10)
			{
				System.out.println(num + "*"+ i +"=" + num*i);
				i++;
			}
		}
		else 
			System.out.println("numero no valido: sólo para las tablas de multiplicar del 1 al 10 ");
	}

}
