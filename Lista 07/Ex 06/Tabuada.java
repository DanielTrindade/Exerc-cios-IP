import java.util.Scanner;
public class Tabuada {
	private int numero;
	Tabuada(int novoNumero) {
		this.setNumero(novoNumero);
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	public void imprimirTabuada() {
		int inicio = 0;
		int fim = this.getNumero();
		int multiplicacao;
		for(int i = inicio; i <= fim; i++) {
			multiplicacao = fim * i;
			System.out.printf("%d x %d = %d\n", fim, i, multiplicacao);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		valor = scanner.nextInt();
		Tabuada numero = new Tabuada(valor);
		numero.imprimirTabuada();
		scanner.close();
	}
}