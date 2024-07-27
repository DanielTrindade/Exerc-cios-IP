import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String palavra;
		boolean ehPalindromo = true;
		int tamanho;
		palavra = scanner.nextLine();
		tamanho = palavra.length() - 1;
		for(int i = 0;(i < (tamanho + 1) / 2) && ehPalindromo; i++) {
			if(palavra.charAt(i) != palavra.charAt(tamanho - i)){
				ehPalindromo = false;
			}
		}
		System.out.println(ehPalindromo);
		scanner.close();
	}
}