package UD4;
import java.util.Scanner;
public class ArrayAriketak3 {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int opcion;
	int posicion;
	int[] a;
	a= new int[5];
	a[0]=123;
	a[1]=333;
	a[2]=180;
	a[3]=211;
	a[4]=90;
	
	int aukera;
	double total=0;
	String[] array1;
	array1= new String[5];
	array1[0]="Enero";
	array1[1]="Febrero";
	array1[2]="Marzo";
	array1[3]="Abril";
	array1[4]="Mayo";
	System.out.println("Mes y precipitacion");
	System.out.println("mes " + array1[0] + " precipitacion " + a[0]);
	System.out.println("mes " + array1[1] + " precipitacion " + a[1]);
	System.out.println("mes " + array1[2] + " precipitacion " + a[2]);
	System.out.println("mes " + array1[3] + " precipitacion " + a[3]);
	System.out.println("mes " + array1[4] + " precipitacion " + a[4]);
	System.out.println("/////////////////////////////");
	System.out.println("Mes mas lluvioso");
	System.out.println("mes " + array1[1] + " precipitacion " + a[1]);
}
}
