package UD4;

public class JavaInicia2d {

	public static void main(String[] args) {
		/*Defino y creo la matriz*/
		char[][] a = new char[5][8];
		char[][] b = new char[2][2];
		/*Inicializo la matriz*/
		for(int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length; columna ++){
				/*Pongo "#" en cada celda*/
				a[fila][columna] = '#';
			}
		}
		
		for(int fila = 0;fila < b.length;fila++){
			for(int columna = 0; columna < b[fila].length; columna ++){
				/*Pongo "#" en cada celda*/
				b[fila][columna] = '#';
			}
		}
		System.out.println("*****************************************");
		
		/*Muestro el contenido de la matriz*/
		for(int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length; columna ++){
				System.out.print(a[fila][columna]);
			}
			System.out.println();/*Salto a la siguiente linea*/
		}
		
		System.out.println("*****************************************");
		
		for(int fila = 0;fila < b.length;fila++){
			for(int columna = 0; columna < b[fila].length; columna ++){
				System.out.print(b[fila][columna]);
			}
			System.out.println();/*Salto a la siguiente linea*/
		}
	}
}
		