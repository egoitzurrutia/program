package UD4;

import java.util.Scanner;

public class umeentzako_programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String izena,pasahitza;
		int adina, aukera;
		String irten;
		
		System.out.println("Sartu izena: ");
		izena =sc.next();
		System.out.println("Sartu pasahitza: ");
		pasahitza =sc.next();
		while (!pasahitza.equals("program")) {
			System.out.println("ERROR, sartu berriro");
			System.out.println("Sartu izena: ");
			izena =sc.next();
			System.out.println("Sartu pasahitza: ");
			pasahitza =sc.next();
			}
		System.out.println("Sartu adina: ");
		adina =sc.nextInt();
		if (adina<18) {
			System.out.println("Ezin zara sisteman sartu");
		}else {
			do {
				System.out.println("Ongi etorri "+izena+" programara.");
				System.out.println("1- Zenbakiak gehitu ");
				System.out.println("2- A letra dagoen konprobatu ");
				System.out.println("3- Irten ");
				System.out.println("Zer egin nahi duzu?");
				aukera=sc.nextInt();
				switch (aukera) {
				case 1: 
					
						System.out.println("**Zenbakiak gehitu**");
						int zenb1, zenb2,guztira=0;
						do {
						System.out.println("Sartu lehenengo zenbakia: ");
						zenb1=sc.nextInt();
						System.out.println("Sartu bigarren zenbakia: ");
						zenb2=sc.nextInt();
						guztira=zenb1+zenb2;
						System.out.println ("Guztira: "+guztira);}
					while (guztira<0);
				break;
				case 2: 
					String hitza;
					System.out.println("**A letra dagoen konprobatu**");
					System.out.println("Sartu hitz bat:");
					hitza=sc.next();
					
					if (hitza.toUpperCase().indexOf("A")!=-1) 
					{
						System.out.println("A letra dauka");
						for (int i=0;i<5;i++) {
							System.out.print(hitza +" /");
						}
					}else {
					
						System.out.println("A letra ez dauka");
					}
				break;
				case 3:
					System.out.println("**Irten**");
					System.out.println("Gero arte "+ izena);
					System.exit(0);
					break;
				}
				System.out.println("Programatik irten nahi duzu? Bai/Ez");
				irten=sc.next();
				irten=irten.toLowerCase();
			}while(irten.equals("ez"));
			System.out.println("Gero arte "+ izena);
		}
		
	}

}