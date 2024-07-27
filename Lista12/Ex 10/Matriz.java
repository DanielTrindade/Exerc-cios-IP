import java.util.Scanner;
public class Matriz {
	private int[][] mat;
	private int ordem;
	Matriz(int novaOrdem) {
		this.setOrdem(novaOrdem);
		this.mat = this.criarMatriz(this.getOrdem(), this.getOrdem());
	}
	
	public void setOrdem(int novaOrdem) {
		this.ordem = novaOrdem;
	}
	
	public int getOrdem() {
		return this.ordem;
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
	
	public void lerMatriz(Scanner scanner) {
		int valor;
		for(int i = 0;i < this.getOrdem();i++) {
			for(int j = 0;j < this.getOrdem();j++) {
				valor = scanner.nextInt();
				this.setElemento(i, j, valor);
			}
		}
	}
	public void imprimeMatriz() {
		for(int i = 0;i < this.getOrdem();i++) {
			for(int j = 0;j < this.getOrdem();j++) {
				System.out.printf("%d ", this.getElemento(i, j));
			}
			System.out.printf("\n");
		}
	}
	public void matrizTransposta(Matriz matA) {
		for(int i = 0;i < this.getOrdem(); i++) {
			for(int j = 0; j < this.getOrdem(); j++) {
				this.setElemento(i, j, matA.getElemento(j, i));
			}
		}
	}
	
	public void multiplicaMatriz(Matriz matA, Matriz matB) {
		for(int i = 0;i < matA.getOrdem(); i++) {
			for(int j = 0; j < matB.getOrdem(); j++) {
				for(int k = 0; k < this.getOrdem();k++) {
					int valor = this.getElemento(i, j) + (matA.getElemento(i,k) * matB.getElemento(k,j));
					this.setElemento(i , j, valor);
				}
			}
		}
	}
	
	public void imprimeMatrizMultiplicacao(Matriz matA, Matriz matB) {
		this.multiplicaMatriz(matA, matB);
		System.out.println("Matriz A");
		matA.imprimeMatriz();
		System.out.println("Matriz B");
		matB.imprimeMatriz();
		System.out.println("Matriz Resultante");
		this.imprimeMatriz();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ordem;
		Matriz matrizA;
		Matriz matrizB;
		Matriz matrizMultiplicacao;
		ordem = scanner.nextInt();
		matrizA = new Matriz(ordem);
		matrizB = new Matriz(ordem);
		matrizMultiplicacao = new Matriz(ordem);
		matrizA.lerMatriz(scanner);
		matrizB.lerMatriz(scanner);
		matrizMultiplicacao.imprimeMatrizMultiplicacao(matrizA, matrizB);
		scanner.close();
	}
}