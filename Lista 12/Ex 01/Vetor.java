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
	
	public boolean verificaPresente(int chave) {
		boolean achou = false;
		int tamanho = this.getTamanho();
		int index = 0;
		while(index < tamanho && !achou) {
			if(chave == this.getElemento(index)) {
				achou = true;
			}
			index++;
		}
		return achou;
	}
	
	public void imprimeListaPresente(Vetor listaM) {
		boolean semPresentes = false;
		for(int i = 0; i < listaM.getTamanho();i++) {
			int chave = listaM.getElemento(i);
			if(this.verificaPresente(chave) == true) {
				System.out.printf("%d presente.\n", chave);
				semPresentes = true;
			}
			else {
				System.out.printf("%d nao presente.\n", chave);
			}
		}
		if(semPresentes == false) {
			System.out.println("Sem presentes.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vetor listaN;
		Vetor listaM;
		int tamanhoListaN;
		int tamanhoListaM;
		tamanhoListaN = scanner.nextInt();
		listaN = new Vetor(tamanhoListaN);
		listaN.lerVetor(scanner);
		tamanhoListaM = scanner.nextInt();
		listaM = new Vetor(tamanhoListaM);
		listaM.lerVetor(scanner);
		listaN.imprimeListaPresente(listaM);
		scanner.close();
	}
}