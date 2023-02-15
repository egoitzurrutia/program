package UD4;
import java.util.Scanner;
public class ArrayAriketak1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		int posicion;
		int[] array;
		int aukera;
		double total=0;
		array= new int[10];
		for(posicion=0; posicion<array.length;posicion++) {
			array[posicion]=(int)Math.floor(Math.random()*100);
		}do {
		System.out.println("1- Irten");
		System.out.println("2- Batura idatzi ");
		System.out.println("3- Maximoa idatzi ");
		System.out.println("4-Minimoa idatzi");
		System.out.println("5-Media idatzi");
		System.out.println("6-Berriro zenbakiz bete(formateatu)");
		System.out.println("7-Erakutsi");
		aukera=sc.nextInt();
		switch(aukera) {
		case 1:
			System.out.print("Irten zara");
			System.exit(0);
		break;
		case 2:
			int emaitza=0;
			for(int i=0;i < array.length;i++){
				emaitza=emaitza+array[i];
			}
			System.out.println("Suma:" + emaitza);
		break;
		case 3:
			int mayor =array[0];
			for(posicion=0;posicion<array.length;posicion++) {
				if(array[posicion]>mayor) {
					mayor = array[posicion];
				}
			}System.out.println("Mayor:" + mayor);
		break;
		case 4:
			int menor =array[0];
			for(posicion=1;posicion<array.length;posicion++) {
				if(array[posicion]<menor) {
					menor = array[posicion];
				}
			}System.out.println("Menor:" + menor);
		break;
		case 5:
			for(int i=0;i < array.length;i++){
				total=total+array[i];;
			}System.out.println("Media " +(total/array.length));
		break;
		case 6:
			for(posicion=0; posicion<array.length;posicion++) {
				array[posicion]=(int)Math.floor(Math.random()*100);}
		break;
		case 7:
			for(int i=0;i < array.length;i++){
				System.out.println(array[i]);
			}
		break;
		}
		}while(aukera!=1);
		}
	}
		
	

