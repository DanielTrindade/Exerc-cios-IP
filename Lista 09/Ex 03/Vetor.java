import java.util.Scanner;
public class Vetor {
	private int[] vet;
	private int tamanho;
	
	Vetor(int novoTamanho) {
		this.setTamanho(novoTamanho);
		this.vet = this.createVetor(this.getTamanho());
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void setTamanho(int novoTamanho) {
		this.tamanho = novoTamanho;
	}
	
	public int getElemento(int index) {
		return this.vet[index];
	}
	
	public void setElemento(int index, int novoValor) {
		this.vet[index] = novoValor;
	}
	
	public int[] createVetor(int tamanho) {
		return new int[tamanho];
	}
	
	public void imprimirVetor() {
		for(int i = 0;i < this.getTamanho(); i++) {
			System.out.printf("%d ", this.getElemento(i));
		}
	}
	
	public void gerarPg(int a0, int q) {
		for(int i = 1;i < this.getTamanho(); i++) {
			this.setElemento(i, this.getElemento(i - 1) * q);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num0;
		int razao;
		int quantidadeTermos;
		num0 = scanner.nextInt();
		razao = scanner.nextInt();
		quantidadeTermos = scanner.nextInt();
		Vetor vetor1 = new Vetor(quantidadeTermos + 1);
		vetor1.setElemento(0, num0);
		vetor1.gerarPg(num0, razao);
		vetor1.imprimirVetor();
		scanner.close();
	}
}