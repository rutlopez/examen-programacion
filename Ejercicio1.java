package examenProgramacion;

import java.util.Scanner;

public class Ejercicio1 
/**
 * Pre: ---
 * Post: para sacar los numeros ( son los que diga el usuario en M) mas grandes de la tabla.
 */
{
	public static void mejores (int[]tabla, int M) 
	{
		int numMaximoPosicion = 0;
		
		for(int j = 0; j < M; j++) 
		{
			for (int i = 0; i< tabla.length;i++) 
			{
					if (tabla[i]> tabla[numMaximoPosicion])
					{
						numMaximoPosicion = i;
					}
			}
			
			System.out.println("El numero maximo es: " + tabla[numMaximoPosicion]);
			int aux = tabla[numMaximoPosicion];
			tabla[numMaximoPosicion] = tabla[j];
			tabla[j] = aux;
			numMaximoPosicion++;
		}
	}

	public static void main(String[] args) 
	{ 
		Scanner entrada = new Scanner (System.in);
		System.out.print("Introduce la longitud de la tabla: ");
		int numeros = entrada.nextInt();
		int [] tabla= new int [numeros];
		for(int i =0; i<tabla.length;i++) 
		{
			System.out.print("Introduce los datos de la tabla: ");
			tabla[i]=entrada.nextInt();
		}
		System.out.println("Introduce cuantos numeros quieres que salgan por pantalla: ");
		int M = entrada.nextInt();
		
		mejores(tabla, M);
	}
}