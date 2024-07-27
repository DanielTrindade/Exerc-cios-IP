import java.util.Scanner;
public class Matriz {
	private int[][] mat;
	private int tamanhoLinha;
	private int tamanhoColuna;
	Matriz(int novoTamanhoLinha, int novoTamanhoColuna) {
		this.setTamanhoLinha(novoTamanhoLinha);
		this.setTamanhoColuna(novoTamanhoColuna);
		this.mat = this.criarMatriz(this.getTamanhoLinha(), this.getTamanhoColuna());
		this.preencherMatriz();
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
				boolean isDiagonalPrincipal = i == j;
				boolean isDiagonalSecundaria = i + j + 1 == this.getTamanhoLinha();
				if(isDiagonalPrincipal && !isDiagonalSecundaria) {
					this.setElemento(i, j, 1);
				} 
				else if(isDiagonalSecundaria) {
					this.setElemento(i, j, 2);
				}
				else {
					this.setElemento(i, j, 3);
				}
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
				System.out.printf("%d", this.getElemento(i, j));
			}
			System.out.printf("\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dimensao;
		Matriz matriz;
		dimensao = scanner.nextInt();
		while(dimensao > 0) {
			matriz = new Matriz(dimensao, dimensao);
			matriz.imprimeMatriz();
			dimensao = scanner.nextInt();
		}
		
		scanner.close();
	}
}