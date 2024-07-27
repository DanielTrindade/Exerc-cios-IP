import java.util.Scanner;
public class Vetor{
	private int[] vet;
	private int tamanho;
	Vetor(){
		this.setTamanho(10);
		vet = new int[this.getTamanho()];
	}
	
	Vetor(int novoTamanho){
		this.setTamanho(novoTamanho);
		vet = new int[this.getTamanho()];
	}
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	public void setTamanho(int novoTam){
		this.tamanho = novoTam;
	}

	public int getElemento(int index){
		return this.vet[index];
	}
	
	public void setElemento(int index, int novoNumero){
		this.vet[index] = novoNumero;
	}
	public void imprimirInverso() {
		int posMenor = 0;
		int posMaior = 0;
		for(int i = this.getTamanho() - 1; i >= 0; i--) {
			System.out.printf("%d ", this.getElemento(i));
		}
		
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		Vetor numeros = new Vetor();
		for(int i = 0; i < 10; i++) {
			numero = scanner.nextInt();
			numeros.setElemento(i, numero);
		}
		numeros.imprimirInverso();
		scanner.close();
	}
}

