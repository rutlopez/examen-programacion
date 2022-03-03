package examenProgramacion;

public class Ejercicio2 
/**
 * Pre: ---
 * Post: pone en pantalla las fechas de la tabla t 
 */

{
		private static void comprobarFechas(String[] t)
		{
			for (int i = 0; i<t.length;i++) 
			{
			System.out.println(t[i] + "-->"  );
			
			}
			esValido(0, 0, 0);
		}
		/**
		 * Pre: ---
		 * Post: comprobar si las fechas son validas
		 */
		private static boolean esValido(int dia, int mes, int ano) 
		{
			
			return true;
		}
		/**
		 * Pre: ---
		 * Post: devuelve [true] sí y solo sí el [ano] pasado como
		 * 		parámetro es bisiesto. En caso contrario, devuelve [false].
		 */
		private static boolean esBisiesto(int ano) {
			if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
				return true;
			else
				return false;
		}
		
		public static void main(String[] args) 
		{
			String[] t = {"28/02/1995", "28/03/2010", 
					"32/12/1995", "02/01/2019", "29/02/2024"};
			comprobarFechas(t);
		}
	


		
	}





