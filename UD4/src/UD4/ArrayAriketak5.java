package UD4;
import java.util.Scanner;
public class ArrayAriketak5 {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int opcion;
	int posicion;
	int[] a;
	a= new int[7];
	a[0]=23;
	a[1]=32;
	a[2]=12;
	a[3]=34;
	a[4]=26;
	a[5]=13;
	a[6]=14;
	
	int aukera;
	double total=0;
	String[] array1;
	array1= new String[7];
	array1[0]="Astelehena";
	array1[1]="Asteartea";
	array1[2]="Asteazkena";
	array1[3]="Osteguna";
	array1[4]="Ostirala";
	array1[5]="Larunbata";
	array1[6]="Igandea";
	
	for(int i=0;i < a.length;i++){
		total=total+a[i];;
	}System.out.println("Asteko media-----> " +((total/a.length*9 / 5) + 32)+"ºF");
	System.out.println("////////////////////////" );
	int maximoa =a[0];
	for(posicion=0;posicion<a.length;posicion++) {
		if(a[posicion]>maximoa) {
			maximoa = a[posicion];
		}
	}System.out.println("Beroena:" + maximoa+"ºC");
	int minimoa =a[0];
	System.out.println("////////////////////////" );
	for(posicion=1;posicion<a.length;posicion++) {
		if(a[posicion]<minimoa) {
			minimoa = a[posicion];
		}
	}System.out.println("Hotzena:" + minimoa+"ºC");
	System.out.println("////////////////////////" );
	for(posicion=1;posicion<a.length;posicion++) {
		if(a[posicion]<total) {
			System.out.println(false);
		}
	}
}
}
