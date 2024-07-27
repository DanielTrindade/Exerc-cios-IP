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
	//algoritmo counting sort
	public void imprimirOrdenado() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Vetor vet;
		for(int i = 0; i < this.getTamanho(); i++) {
			int valor = this.getElemento(i);
			if(valor < min) {
				min = valor;
			}
			if(valor > max) {
				max = valor;
			}
		}
		vet = new Vetor(max - min + 1);
		for(int i = 0;i < this.getTamanho();i++) {
			int valor = this.getElemento(i);
			vet.setElemento(valor - min, vet.getElemento(valor - min) + 1);
		}
		
		for (int i = 0; i < vet.getTamanho(); i++) {
				for (int j = 0; j < vet.getElemento(i); j++) {
					System.out.println(i + min);
				}
		}
		
	}
	
	public void lerVetor(Scanner scanner) {
		int numero;
		for(int i = 0;i < this.getTamanho();i++) {
			numero = scanner.nextInt();
			this.setElemento(i, numero);
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
		numeros.lerVetor(scanner);
		numeros.imprimirOrdenado();
		scanner.close();
	}
}