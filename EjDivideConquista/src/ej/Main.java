package ej;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 1
		
		/*
		String cantidadChar = System.console().readLine("Ingrese la cantidad de caracteres");
		int number = Integer.valueOf(cantidadChar);
		char[] array = new char[number];
		

		char c = ' ';
		int count = 0;
		while(c != '0' && count <array.length) {
			c = System.console().readLine("Ingrese un caracter. 0 para finalizar").charAt(0);
			array[count] = c;
			count ++;
					}

		
		boolean verOrden = ordenDivideConquista(array, 0, array.length- 1);
		
		System.out.print(verOrden);
		
		*/
		
		//Primera solución
		/* 
		boolean verOrden = orden(array);
		System.out.println(verOrden);
		*/
		
		//SEGUNDA SOLUCIÓN
		/*
		boolean verOrden = ordenRecursivo(array, 0);
		System.out.println(verOrden);
		*/
		
		
		
		//Ejercicio 2
		
		ej2Potencia potencias = new ej2Potencia();
		
		boolean verificarPotencia = potencias.esPotencia(4);
		
		if(verificarPotencia) {
			int resultado = potencias.calcPotencia(4, 3);
			System.out.println("Resultado: " + resultado);
			
			int resultado2 = potencias.calcPotenciaDyC(4, 3);
			System.out.println("Resultado: " + resultado2);
		}
		
		
	}
	//Primera solución
	/*
	public static boolean orden(char[] array) {
		for(int i = 0; i < array.length -1; i ++) {
				if(array[i] > array[i+1]) {
					return false;
				}
		}
		return true;
	}
	*/
	
	//SEGUNDA SOLUCIÓN
	/*
	public static boolean ordenRecursivo(char[] array, int index) {
		if(index == array.length-1) {
			return true;
		}
		if(array[index] > array[index+1] ) {
			return false;
		}
		
		else {
			return ordenRecursivo(array, index +1);
		}
	}
	*/
	
	//Ejercicio 1
	
	//Para hacerlo recursivo podría dividir el array a la mitad, verificar el lado izquierda, verificar el derecho y verificar el medio?
	/*
	public static boolean ordenDivideConquista(char[] array, int inicio, int fin) {
		if (inicio >= fin) {
			return true;
		}
		
		int mitad = (inicio+fin)/2;
		
		boolean izquierda = ordenDivideConquista(array, inicio, mitad); 
		boolean derecha = ordenDivideConquista(array, mitad+1, fin);
		
		return izquierda && derecha && array[mitad] <= array[mitad + 1];
	}
	*/

	
	
	
}



