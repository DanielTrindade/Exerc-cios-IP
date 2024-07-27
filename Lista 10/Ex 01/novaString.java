import java.util.Scanner;

public class novaString {
	private String palavra;
	public void setPalavra(String novaPalavra) {
		this.palavra = novaPalavra;
	}
	public String getPalavra() {
		return this.palavra;
	}
	
	public String stringRecursiva(String palavraTeste) {
		int tam = palavraTeste.length();
		String resultado;
		if(tam == 1) {
			resultado = palavraTeste;
		}
		else if((palavraTeste.charAt(0) == palavraTeste.charAt(1))) {
			resultado = palavraTeste.charAt(0) + "#"  + stringRecursiva(palavraTeste.substring(1));
		}
		else {
			resultado = palavraTeste.charAt(0) + stringRecursiva(palavraTeste.substring(1));
		}
		return resultado;
	}
	public void imprimirStringRecursiva(String palavraTeste) {
		String palavraRecursiva = this.stringRecursiva(palavraTeste);
		this.setPalavra(palavraRecursiva);
		System.out.println(this.getPalavra());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String novaPalavra = scanner.nextLine();
		novaString palavraRecursiva = new novaString();
		palavraRecursiva.imprimirStringRecursiva(novaPalavra);
		scanner.close();
	}
}