import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamanho;
		String frase = scanner.nextLine();
		tamanho = frase.length();
		for(int i = tamanho - 1;i >= 0;i--) {
			System.out.printf("%c", frase.charAt(i));
		}
		scanner.close();
	}
}