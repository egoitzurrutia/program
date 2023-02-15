package UD4;

import java.util.Scanner;

public class A14 {



	public static void main(String[] args) {
		// creo la variable
		String i; 
		int posicion;
		String [] array;
		array = new String [10];
		int elementos;
		boolean encontrado, lleno;
		
		// creo el objeto de tipo Scanner para leer desde el teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.println("Sartu hitza: ");
		i= teclado.next();
		
		elementos = 0;
		
		lleno = false;
		while (!i.isEmpty()&&!lleno){
			// busco la posicion que le corresponde
			posicion = 0;
			encontrado = false;
			while (posicion<elementos && !encontrado) {

				if (i.compareTo(array[posicion]) < 0){
					// cuando encuentra la posicion
					encontrado = true;
				}
				else {
					posicion++;
				}
				
			}
			// mover todos los valores desde esa posici�n hasta el final una posici�n a la derecha empezando por el �ltimo
			for(int posicionmover=elementos;posicionmover > posicion;posicionmover--){
				array[posicionmover] = array[posicionmover-1];
			}
			
			
			// guardar el nuevo elemento en la posici�n
			array[posicion]= i;	
			elementos++;
			if (elementos >= 10){
				// salgo del bucle
				lleno = true;
			}
			else {
				// leo n
				System.out.println("Sartu hitza: ");
				i= teclado.next();
			}
		}
		
		// cierro el objeto de tipo Scanner
		teclado.close();
		
		// saca por pantalla el array
		for (posicion=0;posicion< elementos;posicion=posicion+1){
			// la saco por pantalla
			System.out.println(array[posicion]);
		}
		
	}
}
