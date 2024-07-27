import java.util.Scanner;
class Vetor {
	private int[] vet;
	private int tamanho;
	Vetor(int novoTamanho) {
		this.setTamanho(novoTamanho);
		this.vet = new int[this.getTamanho()];
	}	
	public void setTamanho(int novoTamanho) {
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
}
public class Matriz {
	private int[][] mat;
	private int tamanhoLinha;
	private int tamanhoColuna;
	Matriz(int valorInicial) {
		this.setTamanhoLinha(valorInicial);
		this.setTamanhoColuna(valorInicial);
		this.mat = this.criarMatriz(this.getTamanhoLinha(), this.getTamanhoColuna());
	}
	
	Matriz(int novoTamanhoLinha, int novoTamanhoColuna) {
		this.setTamanhoLinha(novoTamanhoLinha);
		this.setTamanhoColuna(novoTamanhoColuna);
		this.mat = this.criarMatriz(this.getTamanhoLinha(), this.getTamanhoColuna());
	}
	
	public void setTamanhoLinha(int novoTamanhoLinha) {
		this.tamanhoLinha = novoTamanhoLinha;
	}
	
	public int getTamanhoLinha() {
		return this.tamanhoLinha;
	}
	
	public void setTamanhoColuna(int novoTamanhoColuna) {
		this.tamanhoColuna = novoTamanhoColuna;
	}
	
	public int getTamanhoColuna() {
		return this.tamanhoColuna;
	}
	
	public void setElemento(int linha, int coluna, int novoElemento) {
		this.mat[linha][coluna] = novoElemento;
	}
	
	public int getElemento(int linha, int coluna) {
		return this.mat[linha][coluna];
	}
	
	public int[][] criarMatriz(int linhas, int colunas) {
		return new int[linhas][colunas];
	}
	
	public void preencherMatriz() {
		for(int i = 0;i < this.getTamanhoLinha();i++) {
			for(int j = 0;j < this.getTamanhoColuna();j++) {
				this.setElemento(i, j, 1);
			}
		}
	}
	
	
	public void lerMatriz(Scanner scanner) {
		int valor;
		for(int i = 0;i < this.getTamanhoLinha();i++) {
			for(int j = 0;j < this.getTamanhoColuna();j++) {
				valor = scanner.nextInt();
				this.setElemento(i, j, valor);
			}
		}
	}
	public void imprimeMatriz() {
		System.out.println("Matriz");
		for(int i = 0;i < this.getTamanhoLinha();i++) {
			for(int j = 0;j < this.getTamanhoColuna();j++) {
				System.out.printf("%d ", this.getElemento(i, j));
			}
			System.out.printf("\n");
		}
	}
	
	public void buscaRepetidos() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		boolean naoTemRepetido = true;
		Vetor vet;
		for(int i = 0;i < this.getTamanhoLinha();i++) {
			for(int j = 0;j < this.getTamanhoColuna();j++) {
				int valor = this.getElemento(i, j);
				if(valor < min) {
					min = valor;
				}
				if(valor > max) {
					max = valor;
				}
			}
		}
		vet = new Vetor(max - min + 1);
		for(int i = 0; i < this.getTamanhoLinha(); i++) {
			for(int j = 0; j < this.getTamanhoColuna(); j++) {
				int valor = this.getElemento(i, j);
				vet.setElemento(valor - min, vet.getElemento(valor - min) + 1);
			}
		}
		for(int i = 0; i < vet.getTamanho() && naoTemRepetido; i++) {
			if(vet.getElemento(i) > 1) {
				naoTemRepetido = false;
			}
		}
		if(naoTemRepetido) {
			System.out.println("Nao tem elementos repetidos!!");
		}
		else {
			System.out.println("Tem elementos repetidos!!");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int linha;
		int coluna;
		Matriz matriz1;
		linha = scanner.nextInt();
		coluna = scanner.nextInt();
		matriz1 = new Matriz(linha, coluna);
		matriz1.lerMatriz(scanner);
		matriz1.imprimeMatriz();
		matriz1.buscaRepetidos();
		scanner.close();
	}
} 