import java.util.Locale;
import java.util.Scanner;

public class VariaveisESintaxe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome, idade, sexo e peso: ");
		
		String nome = sc.next();
		int idade = sc.nextInt();
		char sexo = sc.next().charAt(0);
		double peso = sc.nextDouble();
		
		System.out.println("seu nome �: " + nome + ", voce tem: " + idade + " anos, � do sexo: " + sexo +" e tem " + peso + " quilos");
		
		sc.close();

	}

}
