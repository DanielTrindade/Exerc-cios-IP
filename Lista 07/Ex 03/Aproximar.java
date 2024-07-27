import java.util.Scanner;
public class Aproximar {
	private int arredondamento;
	private float valorE;
	Aproximar(int novoArredondamento) {
		this.setArredondamento(novoArredondamento);
	}
	public void setArredondamento(int novoArredondamento) {
		this.arredondamento = novoArredondamento;
	}
	public int getArredondamento() {
		return this.arredondamento;
	}
	public void setValorE(float novoValorE) {
		this.valorE = novoValorE;
	}
	public float getValorE() {
		return this.valorE;
	}
	public void calcularValorE() {
		int limite = this.getArredondamento();
		float valorE = 1.0f;
		float fatorialN = 1;
		for(int i = 1; i <= limite ; i++) {
			fatorialN *= i;
			valorE += (1.0f / fatorialN);
		}
		this.setValorE(valorE);
	}
	public void exibirValorE() {
		float valor = this.getValorE();
		System.out.printf("Valor de E: %.8f\n", valor);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int aproximacao;
		aproximacao = scanner.nextInt();
		Aproximar numeroE = new Aproximar(aproximacao);
		numeroE.calcularValorE();
		numeroE.exibirValorE();
		scanner.close();
	}
}