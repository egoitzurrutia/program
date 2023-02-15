package UD4;
import java.util.Scanner;
public class ArrayAriketak2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		int posicion;
		int aukera;
		String nombre;
		boolean encontrado;
		String[]array= new String[5];
		array[0]="jon";
		array[1]="luis";
		array[2]="enrique";
		array[3]="luis";
		array[4]="enrique";
		
		do {
		System.out.println("1- Irten");
		System.out.println("2- Zerrenda idatzi ");
		System.out.println("3- Izen bat eskatu eta agerpenak kontatu ");
		System.out.println("4- Izen bat eskatu eta badagoen esan");
		System.out.println("5- Ezabatu. Izen bar eskatu eta izen hori dagoen lekuan null sartu");
		aukera=sc.nextInt();
		switch(aukera) {
		case 1:
			System.out.print("Irten zara");
			System.exit(0);
		break;
		case 2:
			for(int i=0;i < array.length;i++){
				System.out.println(array[i]);
			}
		break;
		case 3:
			sc.reset();
			sc.nextLine();
			System.out.print("Sartu izen bat:");
			nombre=sc.nextLine().toLowerCase();
			int contador=0;
			for(int i=0;i < array.length;i++){
				if(nombre.equalsIgnoreCase(array[i] )) {
					System.out.print("Baten bakarrik idatzita dago");
				}else
					System.out.print("Baten bakarrik idatzita dago");
			}
		break;
		case 4:
			encontrado=false;
			posicion=0;
			sc=reset();
			sc.nextLine();
			System.out.print("Sartu izen bat:");
			nombre=sc.next();
			while(!encontrado && (posicion<array.length)){
				if(nombre.equals(array[posicion])) {
					encontrado= true;
				}else
					posicion++;
			}if(encontrado) {
				System.out.print("El nombre"+nombre+" existe");
			}else{
				System.out.print("El nombre"+nombre+" no existe");
			}
		break;
		case 5:
			encontrado=false;
			posicion=0;
			sc=reset();
			sc.nextLine();
			System.out.print("Sartu izen bat:");
			nombre=sc.next();
			while(!encontrado && (posicion<array.length)){
				if(nombre.equals(array[posicion])) {
					encontrado= true;
				}else
					posicion++;
			}if(encontrado) {
				System.out.print("El nombre"+nombre+" existe");
			}else{
				System.out.print("El nombre"+nombre+" no existe");
			}
		break;
		}
		
		}while(aukera!=1);
		
		
	}

	private static Scanner reset() {
		// TODO Auto-generated method stub
		return null;
	}
}
	

