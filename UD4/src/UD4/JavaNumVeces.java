package UD4;
import java.util.Scanner;
public class JavaNumVeces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d[]=new int[10];
		int a[]=new int[10];
		int z;
		
		for(int i=0;i<d.length; i++) {
			System.out.println("Sartu zenbaki bat");
			z = sc.nextInt();
			while((z<0)||(z>9)) {
				System.out.println("Error 0-9 artean");
				System.out.println("Sartu zenbaki bat");
				z=sc.nextInt();
			}
			d[i]=z;
			a[z]=a[z]+1;
			
		}
		for(int i=0;i<a.length; i++) {
			System.out.println(i+" zenbakia " + a[i] + " bider sartu da.");
}
}
}