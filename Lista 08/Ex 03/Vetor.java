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
	public int dotProduct(Vetor vetor) {
		int resultado = 0;
		for(int i = 0; i< this.getTamanho(); i++) {
			resultado += (this.getElemento(i) * vetor.getElemento(i));
		}
		return resultado;
	}
	public void imprimirDotProduct(Vetor vetor) {
		int product = this.dotProduct(vetor);
		System.out.println(product);
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		Vetor vetor1 = new Vetor();
		Vetor vetor2 = new Vetor();
		for(int i = 0; i < 10; i++) {
			numero = scanner.nextInt();
			vetor1.setElemento(i, numero);
		}
		for(int i = 0; i < 10; i++) {
			numero = scanner.nextInt();
			vetor2.setElemento(i, numero);
		}
		vetor1.imprimirDotProduct(vetor2);
		scanner.close();
	}
}

