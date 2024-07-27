import java.util.Scanner;
public class Vetor{
	private int[] vet;
	private int tamanho;
	Vetor(){
		this.setTamanho(15);
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
	public void imprimirPosicaoMaiorEMenor() {
		int posMenor = 0;
		int posMaior = 0;
		for(int i = 1; i < 15; i++) {
			if(this.getElemento(posMaior) < this.getElemento(i)) {
				posMaior = i;
			}
			if(this.getElemento(posMenor) > this.getElemento(i)) {
				posMenor = i;
			}
		}
		System.out.println("maior: " + posMaior);
		System.out.println("menor: " + posMenor);
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		Vetor numeros = new Vetor();
		for(int i = 0; i < 15; i++) {
			numero = scanner.nextInt();
			numeros.setElemento(i, numero);
		}
		numeros.imprimirPosicaoMaiorEMenor();
		scanner.close();
	}
}

