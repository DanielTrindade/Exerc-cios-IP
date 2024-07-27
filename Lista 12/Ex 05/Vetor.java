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
	
	public void lerVetor(Scanner scanner) {
		int numero;
		for(int i = 0;i < this.getTamanho();i++) {
			numero = scanner.nextInt();
			this.setElemento(i, numero);
		}
	}
	
	public void imprimirMaioresQue(int n) {
		for(int i = 0;i < this.getTamanho();i++) {
			int valor = this.getElemento(i);
			if(valor > n) {
				System.out.println(valor);
			}	
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		Vetor numeros = new Vetor(5);
		numeros.lerVetor(scanner);
		numero = scanner.nextInt();
		numeros.imprimirMaioresQue(numero);
		scanner.close();
	}
}