
public class Ejercicios {
	
	//Devuelve el valor almacenado en el indice posicion
	static int obtenerValor(int arreglo[], int posicion)
	{
		return arreglo[posicion];
	}
	
	//Devuelve el valor almacenado en el indice posicion
	static String obtenerValor(String arreglo[], int posicion)
	{
		return arreglo[posicion];
	}// devuelve la posicion a la que le hemos asignado al arreglo
	
	//Devuelve la suma de todos los elementos del arreglo
	static int obtenerSuma(int arreglo[])
	{
int suma = 0;
		
		for(int a = 0; a < arreglo.length; a++) // utilizamos el ciclo For
		{
			suma = suma + arreglo[a];
		}
		
		return suma;
	}
	
	//Devuelve el promedio de todos los elementos del arreglo
	static int obtenerPromedio(int arreglo[])
	{
		int suma = 0;
		int cantidadNumero = arreglo.length;
		
		for(int a = 0; a < arreglo.length; a++)
		{
			suma = suma + arreglo[a];
		}
		
		return suma;
	}
	
	//Devuelve true si valor esta 
	static boolean existe(char arreglo[], char valor)
	{

		for(int a = 0; a < arreglo.length; a++)
		{
			if(arreglo[a] == valor)
			{
				return true;
			}
		}
		
		return false;
	}
		
	//Devuelve true si valor esta 
	static boolean existe(String arreglo[], String valor)
	{
		for(int a = 0; a < arreglo.length; a++)
		{
			if(arreglo[a].equals(valor))
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
