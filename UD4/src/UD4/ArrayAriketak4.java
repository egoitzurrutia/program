package UD4;
import java.util.Scanner;
public class ArrayAriketak4 {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int opcion;
	int posicion;
	int[] a;
	a= new int[6];
	a[0]=18;
	a[1]=20;
	a[2]=26;
	a[3]=21;
	a[4]=17;
	a[5]=24;
	int aukera;
	double total=0;
	String[] array1;
	array1= new String[6];
	array1[0]="Jon";
	array1[1]="Sara";
	array1[2]="Ander";
	array1[3]="Marta";
	array1[4]="Jone";
	array1[5]="Mikel";
	System.out.println("Zaharrenaren izena eta adina");
	int maximoa =a[0];
	for(posicion=0;posicion<a.length;posicion++) {
		if(a[posicion]>maximoa) {
			maximoa = a[posicion];
		}
	}System.out.println(array1[2]+ ":" + maximoa);
	System.out.println("Gazteenaren izena eta adina");
	int minimoa =a[0];
	for(posicion=1;posicion<a.length;posicion++) {
		if(a[posicion]<minimoa) {
			minimoa = a[posicion];
		}
	}System.out.println(array1[4]+ ":" + minimoa);
	System.out.println("/////////////////////////////");
	
	
}
}
