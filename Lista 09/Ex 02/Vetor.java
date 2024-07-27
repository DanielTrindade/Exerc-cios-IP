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
	
	public void maior() {
		int numero;
		for(int i = 0;i < this.getTamanho(); i++) {
			numero = this.getElemento(i);
			if(numero > 50) {
				System.out.println(numero);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		Vetor vetor1 = new Vetor(5);
		for(int i = 0; i < vetor1.getTamanho(); i++) {
			numero = scanner.nextInt();
			vetor1.setElemento(i, numero);
		}
		vetor1.maior();
		scanner.close();
	}
}