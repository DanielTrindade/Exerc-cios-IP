import java.util.Scanner;
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
		for(int i = 0;i < this.getTamanhoLinha();i++) {
			for(int j = 0;j < this.getTamanhoColuna();j++) {
				System.out.printf("%d ", this.getElemento(i, j));
			}
			System.out.printf("\n");
		}
	}
	public void somaMatrizes(Matriz matA, Matriz matB) {
		int soma;
		for(int i = 0;i < this.getTamanhoLinha(); i++) {
			for(int j = 0; j < this.getTamanhoColuna(); j++) {
					soma = matA.getElemento(i, j) + matB.getElemento(i, j);
					this.setElemento(i, j, soma);
			}
		}
	}
	
	public void imprimeMatrizSoma(Matriz matA, Matriz matB) {
		this.somaMatrizes(matA, matB);
		System.out.println("Matriz A");
		matA.imprimeMatriz();
		System.out.println("Matriz B");
		matB.imprimeMatriz();
		System.out.println("Matriz Resultante");
		this.imprimeMatriz();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fator;
		Matriz matrizA;
		Matriz matrizB;
		Matriz matrizSoma;
		fator = scanner.nextInt();
		matrizA = new Matriz(fator, fator);
		matrizB = new Matriz(fator, fator);
		matrizSoma = new Matriz(fator, fator);
		matrizA.lerMatriz(scanner);
		matrizB.lerMatriz(scanner);
		matrizSoma.imprimeMatrizSoma(matrizA, matrizB);
		scanner.close();
	}
}