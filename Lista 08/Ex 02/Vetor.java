import java.util.Scanner;
public class Vetor{
	private int[] vet;
	private int tamanho;
	Vetor(){
		this.setTamanho(5);
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
	public Vetor vectorialSum(Vetor vetor) {
		Vetor vetSoma = new Vetor();
		for(int i = 0; i< this.getTamanho(); i++) {
			vetSoma.setElemento(i,this.getElemento(i) + vetor.getElemento(i));
		}
		return vetSoma;
	}
	public void imprimirVetor() {
		int tamanho = this.getTamanho();
		for(int i = 0; i< tamanho; i++) {
			System.out.printf("%d ", this.getElemento(i));
		}
	}
	public void imprimirVectorialSum(Vetor vetor) {
		Vetor vetorSoma = this.vectorialSum(vetor);
		vetorSoma.imprimirVetor();
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		Vetor vetor1 = new Vetor();
		Vetor vetor2 = new Vetor();
		for(int i = 0; i < 5; i++) {
			numero = scanner.nextInt();
			vetor1.setElemento(i, numero);
		}
		for(int i = 0; i < 5; i++) {
			numero = scanner.nextInt();
			vetor2.setElemento(i, numero);
		}
		vetor1.imprimirVectorialSum(vetor2);
		scanner.close();
	}
}

