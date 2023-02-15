package UD4;
import java.util.Scanner;
public class JavaMedianum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d[]=new int[10];
		double total=0;
		
		for(int i=0;i<d.length; i++) {
			System.out.println("Sartu zenbaki bat");
			d[i]=sc.nextInt();	
			total=total+d[i];
		}
		System.out.println("Media " +(total/d.length));
}
}

