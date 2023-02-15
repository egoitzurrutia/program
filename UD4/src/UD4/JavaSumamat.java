package UD4;
import java.util.Scanner;
public class JavaSumamat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a;
		int[][] b;
		int[][] emaitza;
		int numfila;
		int numcolumna;
		int resultado;
		System.out.print("Zenbat fila ditu?");
		numfila=sc.nextInt();
		System.out.print("Zenbat zutabe ditu?");
		numcolumna=sc.nextInt();
		a = new int[numfila][numcolumna];
		b = new int[numfila][numcolumna];
		emaitza = new int[numfila][numcolumna];
		for(int fila=0; fila< a.length;fila++) {
			for(int columna = 0; columna< a[fila].length;columna++) {
				System.out.print("Matriz["+fila+"]["+columna+"]");
				a[fila][columna] = sc.nextInt();
				a = new int[numfila][numcolumna];
			}
		}
		for(int fila=0; fila< emaitza.length;fila++) {
			for(int columna = 0; columna< emaitza[fila].length;columna++) {
				emaitza[fila][columna]=a
				System.out.print(b[fila][columna]);
			}
				System.out.println();
		}
		
		}
	}