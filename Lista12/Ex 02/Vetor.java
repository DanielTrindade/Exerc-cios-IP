import java.util.Scanner;
public class Vetor{
	private int[] vet;
	private int tamanho;
	Vetor(int novoTamanho) {
		this.setTamanho(novoTamanho);
		this.vet = this.createVetor(this.getTamanho());
	}
	
	public int[] createVetor(int tamanho) {
		return new int[tamanho];
	}
	
	public void setTamanho(int novoTamanho) {
		this.tamanho = novoTamanho;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void setElemento(int index, int novoElemento) {
		this.vet[index] = novoElemento;
	}
	
	public int getElemento(int index) {
		return this.vet[index];
	}
	
	public void lerVetor(Scanner scanner) {
		int valor;
		for(int i = 0; i< this.getTamanho(); i++) {
			valor = scanner.nextInt();
			this.setElemento(i, valor);
		}
	}
	public void imprimirVetor() {
		for(int i = 0; i< this.getTamanho(); i++) {
			System.out.printf("%d ", this.getElemento(i));
		}
	}
	
	public boolean ehPrimo(int numeroCandidato){
		boolean flagPrimo;
		int restoDiv, divisor;
		flagPrimo = true;
		divisor = 2;
		if(numeroCandidato != 1){
			while((divisor < numeroCandidato) && (flagPrimo)){
				restoDiv = numeroCandidato % divisor;
				if(restoDiv == 0){
					flagPrimo = false;
				}
				divisor++;
			}
		}	
		else{
			flagPrimo = false;
		}	
		return flagPrimo;
	}
	public void somaOsPrimos() {
		int soma = 0;
		for(int i = 0; i< this.getTamanho();i++) {
			int valor = this.getElemento(i);
			if(this.ehPrimo(valor)) {
				soma += valor;
			}
		}
		System.out.println(soma);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vetor listaN;
		listaN = new Vetor(10);
		listaN.lerVetor(scanner);
		listaN.somaOsPrimos();
		listaN.imprimirVetor();
		scanner.close();
	}
}