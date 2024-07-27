import java.util.Scanner;
public class Vetor {
	private int[] vet;
	private int tamanho;
	
	Vetor(int novoTamanho) {
		this.setTamanho(novoTamanho);
		this.vet = this.createVetor(this.getTamanho());
		this.fillVetor();
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
	
	public void fillVetor() {
		for(int i = 0;i < this.getTamanho(); i++) {
			this.setElemento(i, i + 1);
		}
	}
	
	public void imprimirMultiplos() {
		int elemento;
		for(int i = 0;i < this.getTamanho(); i++) {
			elemento = this.getElemento(i);
			if(elemento % 3 == 0 || elemento % 5 == 0) {
				System.out.printf("%d ", this.getElemento(i));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		numero = scanner.nextInt();
		Vetor vetor1 = new Vetor(numero);
		vetor1.imprimirMultiplos();
		scanner.close();
	}
}