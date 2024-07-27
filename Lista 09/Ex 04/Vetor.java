import java.util.Scanner;
public class Vetor {
	private int[] vet;
	private int tamanho;
	Vetor(int novoTamanho) {
		this.setTamanho(novoTamanho);
		this.vet = new int[this.getTamanho()];
	}	public void setTamanho(int novoTamanho) {
		this.tamanho = novoTamanho;
	}
	public int getTamanho() {
		return this.tamanho;
	}
	public void setElemento(int index, int elemento) {
		this.vet[index] = elemento;
	}
	public int getElemento(int index) {
		return this.vet[index];
	}
	public void bubbleSort() {
		for(int i = 0;i< this.getTamanho();i++) {
			for(int j = 0;j < this.getTamanho(); j++) {
				if(this.getElemento(i) < this.getElemento(j)) {
					int aux = this.getElemento(i);
					this.setElemento(i, this.getElemento(j));
					this.setElemento(j, aux);
				}
			}
		}
	}
	public void imprimir() {
		for(int i = 0;i < this.getTamanho();i++) {
			System.out.println(this.getElemento(i));
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vetor numeros = new Vetor(6);
		int numero;
		for(int i = 0;i < numeros.getTamanho();i++) {
			numero = scanner.nextInt();
			numeros.setElemento(i, numero);
		}
		numeros.bubbleSort();
		numeros.imprimir();
		scanner.close();
	}
}