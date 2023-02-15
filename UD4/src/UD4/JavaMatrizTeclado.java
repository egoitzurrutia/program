package UD4;
import java.util.Scanner;
public class JavaMatrizTeclado {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[][] matriz;
	int numfila;
	int numcolumna;
	System.out.print("Zenbat fila ditu?");
	numfila=sc.nextInt();
	System.out.print("Zenbat zutabe ditu?");
	numcolumna=sc.nextInt();
	matriz = new int[numfila][numcolumna];
	for(int fila=0; fila< matriz.length;fila++) {
		for(int columna = 0; columna< matriz[fila].length;columna++) {
			System.out.print("Celda["+fila+"]["+columna+"]");
			matriz[fila][columna] = sc.nextInt();
		}
	}
	for(int fila=0; fila< matriz.length;fila++) {
		for(int columna = 0; columna< matriz[fila].length;columna++) {
			System.out.print(matriz[fila][columna]);
		}
			System.out.println();
	}
	}
	}

