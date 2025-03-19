package ej;

public class ej2Potencia {
	//Diseñar un algoritmo que calcule a^n cuando n es una potencia de 2.
	
	//Podría primero verificar que n sea potencia de 2
	//Luego si lo es, calcular a a la n.
	
	//Debería pasar el n a un algoritmo, que recursivamente lo divida por dos, 
	
	public static boolean esPotencia(int potencia) {
		if(potencia <= 0) {
			return false;
		}
		if(potencia == 1) {
			return true;
		}
		if(potencia %2 != 0) {
			return false;
		}
		else {
			return esPotencia(potencia/2);
		}	
	}
	
	//Complejidad lineal
	public static int calcPotencia(int a, int potencia) {
			if(potencia == 1) {
				return a;
			}
			return a * calcPotencia(a, potencia-1);
	}
	
	
	//Divide y venceras
	public static int calcPotenciaDyV(int a, int potencia) {
	    if (potencia == 0) {
	    	return 1; 
	    }

	    int mitad = calcPotenciaDyV(a, potencia / 2); 
	    if(potencia %2 == 0) {
		    return mitad * mitad;
	    }
	    else {
	    	return mitad * mitad * a;
	    }

	}
}
