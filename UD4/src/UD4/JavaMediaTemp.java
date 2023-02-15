package UD4;
import java.util.Scanner;
public class JavaMediaTemp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int a=0, emaitza = 0, posici = 0, lehen = 0, bi = 0, hiru = 0;
			int d[] = new int[10];
			double media;
			
			
			while (posici != d.length && a != -999) {
				System.out.println("Sartu urte honetako temperaturak");
				a = sc.nextInt();
				if (a!=-999) {
					d[posici] = a;
					emaitza = emaitza + d[posici];
					posici++;
				}
			}
			if (posici>0) {
				media=emaitza / posici;
				System.out.println("batazbestekoa " + media + " da.");
	
				for (int i = 0; i < posici; i++) {
					System.out.println(d[i]);
					if (d[i] > media) {
						bi++;
					} else if (d[i] < media) {
						lehen++;
					} else if (d[i] == media) {
						hiru++;
					}
				}
				System.out.println("Hay " + bi + " temperaturas mayores q la media");
				System.out.println("Hay " + hiru + " temperaturas iguales q la media");
				System.out.println("Hay " + lehen + " temperaturas menores q la media");
			}else {
				System.out.println("ERROR");
			}
			sc.close();
		}

	}
