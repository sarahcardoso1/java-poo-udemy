import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Jo";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Bom dia!");
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.printf("Products:%n" + "%s, which price is %.2f%n" + "%s, which price is %.2f%n", product1, price1, product2, price2);
		System.out.printf("Record: " + "%d years old, code %d and gender: %c%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n" + "Rounded: %.3f%n", measure, measure);
		

	}

}
