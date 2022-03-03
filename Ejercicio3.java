package examenProgramacion;

import java.util.Scanner;

public class Ejercicio3 
/**
 * Pre: ---
 * Post:pedidos el numero de fila y nos sale el numero mayor en pantalla
 */
{
	public static void maxFila(int[][] tabla, int fila) 
	{	
		int numMaximo= 0;
		
		 fila--;
		 
			
		 for (int j = 0 ; j<tabla[fila].length;j++) 
		 {
			if (tabla[fila][j]> numMaximo)
			{	
				numMaximo = tabla[fila][j];
			}
		}
		
		System.out.println("El numero maximo es: " + numMaximo);
	}
	/**
	 * Pre: ---
	 * Post: tabla con la que trabajamos
	 */
	public static void main(String[] args) 
	{
		int salarios[][] = { {700, 900, 1300, 800, 790, 850} , 
							 {1000, 950, 1080, 1070, 1200, 1100}, 
							 {1300,930, 1200, 1170, 1000, 1000} , 
							 {1500, 1950, 1880, 1978, 2200, 2100} 
							};
		
		maxFila(salarios, 2);
		
		

	}

}
