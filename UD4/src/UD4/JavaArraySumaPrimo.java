package UD4;

import java.util.Scanner;

public class JavaArraySumaPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0, emaitza = 0, posici = 0, kont=0;
		int d[] = new int[10];
		
		while (posici != d.length && a >=0) {
			System.out.println("Sartu zenbakia: ");
			a = sc.nextInt();
			if (a>=0) {
				d[posici] = a;
				emaitza = emaitza + d[posici];
				posici++;
			}
		}
		if (posici>0) {
		
			for(int i = 1; i <= emaitza; i++)
	        {
	            if((emaitza % i) == 0)
	            {
	                kont++;
	            }
	        }
			if(kont <= 2)
	        {
				System.out.println( emaitza + " Zenbakia lehena da");
	        }else{
	        	System.out.println(emaitza + " Zenbakia ez da lehena");
	        }
		}else {
			System.out.println("ERROR");
		}
		sc.close();
	}

}


		
	
