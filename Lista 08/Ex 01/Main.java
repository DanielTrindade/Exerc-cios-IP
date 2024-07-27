import java.util.Scanner;
class Vetor {
	private int[] vet;
	private int tamanho;
	
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
	public void contarParesEImpares() {
		int contPar = 0;
		int contImpar = 0;
		for(int i = 0; i< tamanho; i++) {
			if(this.getElemento(i) % 2 == 0) {
				contPar++;
			}
			else {
				contImpar++;
			}
		}
		System.out.println("pares: " + contPar);
		System.out.println("impares: " +  contImpar);
	}
}


public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero, tamanho;
		tamanho = scanner.nextInt();
		Vetor vetor1 = new Vetor(tamanho);
		for(int i = 0; i < tamanho; i++) {
			numero = scanner.nextInt();
			vetor1.setElemento(i, numero);
		}
		vetor1.contarParesEImpares();
		scanner.close();
	}
}