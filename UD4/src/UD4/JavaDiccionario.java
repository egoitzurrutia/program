package UD4;
import java.util.Scanner;
public class JavaDiccionario {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String n = null;
	int posicion = 0;
	int [] a;
	int elementos=0;
	a = new int [5];
	boolean encontrado;
	System.out.println("Sartu letra bat");
	n=sc.next();
	
	if(elementos<a.length) {
		posicion = 0;
		encontrado = false;
	} while(posicion<elementos && !n.isEmpty()) {
		System.out.println("Sartu letra bat");
		n=sc.next();
	}
	
	}
}