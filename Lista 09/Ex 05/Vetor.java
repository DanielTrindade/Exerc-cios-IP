import java.util.Scanner;
public class Vetor {
	private boolean[] vet;
	private int tamanho;
	
	Vetor(int novoTamanho) {
		this.setTamanho(novoTamanho);
		this.vet = new boolean[this.getTamanho()];
		this.fillVetor();
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void setTamanho(int novoTamanho) {
		this.tamanho = novoTamanho;
	}
	
	public boolean getElemento(int index) {
		return this.vet[index];
	}
	
	public void setElemento(int index, boolean novoValor) {
		this.vet[index] = novoValor;
	}
	
	public void fillVetor() {
		for(int i = 0; i < this.getTamanho();i++) {
			this.setElemento(i, false);
		}
	}
	
	public void ocuparVaga(int numeroVaga) {
		this.setElemento(numeroVaga, true);
	}

	public void imprimir() {
		for(int i = 0;i < this.getTamanho(); i++) {
			System.out.printf("%b ", this.getElemento(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtdVagas;
		int qtdVagasModificadas;
		int numeroVaga;
		qtdVagas = scanner.nextInt();
		qtdVagasModificadas = scanner.nextInt();
		Vetor vagas;
		Vetor listaVagas;
		vagas = new Vetor(qtdVagas);
		if(qtdVagasModificadas > 0) {
			for(int i = 0;i< qtdVagasModificadas; i++) {
				numeroVaga = scanner.nextInt();
				vagas.ocuparVaga(numeroVaga);
			}
		}
		vagas.imprimir();
		scanner.close();
	}
}