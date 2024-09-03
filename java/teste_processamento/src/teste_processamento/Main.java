package teste_processamento;

import java.util.Scanner; 
import java.util.Locale;


public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
		int x;
		double y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	
	}

}

