import java.util.Scanner;
public class Fatorial {
	private int valor;
	Fatorial(int novoValor) {
		this.setValor(novoValor);
	}
	public void setValor(int novoValor) {
		this.valor = novoValor;
	}
	public int getValor() {
		return this.valor;
	}
	
	public int calcularFatorial() {
		int numero = this.getValor();
		int fatorialN = 1;
		for(int i = 1; i <= valor ; i++) {
			fatorialN *= i;
		}
		return fatorialN;
	}
	public void exibirFatorial() {
		int numero = this.getValor();
		int fatorial = this.calcularFatorial();
		System.out.printf("Fatorial de %d: %d\n", numero, fatorial);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		numero = scanner.nextInt();
		Fatorial calcular = new Fatorial(numero);
		calcular.exibirFatorial();
		scanner.close();
	}
}