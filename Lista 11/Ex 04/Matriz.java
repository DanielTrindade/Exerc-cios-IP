import java.util.Scanner;
public class Matriz {
	private int[][] mat;
	private int tamanhoLinha;
	private int tamanhoColuna;
	Matriz(int novoTamanhoLinha, int novoTamanhoColuna) {
		this.setTamanhoLinha(novoTamanhoLinha);
		this.setTamanhoColuna(novoTamanhoColuna);
		this.mat = this.createMatrix(this.getTamanhoLinha(), this.getTamanhoColuna());
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
	
	public int[][] createMatrix(int linhas, int colunas) {
		return new int[linhas][colunas];
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
	
	public void somarMatriz(Matriz mat) {
		for(int i = 0;i < this.getTamanhoLinha();i++) {
			for(int j = 0;j < this.getTamanhoColuna();j++) {
				int soma = this.getElemento(i, j) + mat.getElemento(i, j);
				System.out.printf("%d ", soma);
			}
			System.out.printf("\n");
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
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtdLinhas;
		int qtdColunas;
		Matriz mat1;
		Matriz mat2;
		qtdLinhas = scanner.nextInt();
		qtdColunas = scanner.nextInt();
		mat1 = new Matriz(qtdLinhas, qtdColunas);
		mat2 = new Matriz(qtdLinhas, qtdColunas);
		mat1.lerMatriz(scanner);
		mat2.lerMatriz(scanner);
		mat1.somarMatriz(mat2);
		scanner.close();
	}
}