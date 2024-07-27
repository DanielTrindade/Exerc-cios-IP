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
		System.out.println("Matriz");
		for(int i = 0;i < this.getTamanhoLinha();i++) {
			for(int j = 0;j < this.getTamanhoColuna();j++) {
				System.out.printf("%d ", this.getElemento(i, j));
			}
			System.out.printf("\n");
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
	
	public void somaPrimos() {
		int somaPrimos = 0;
		for(int i = 0;i < this.getTamanhoLinha();i++) {
			for(int j = 0;j < this.getTamanhoColuna();j++) {
				int valor = this.getElemento(i, j);
				if(this.ehPrimo(valor)) {
					somaPrimos += valor;
				}
			}
		}
		System.out.println("Soma Primos: " + somaPrimos);
	
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
		matriz1.somaPrimos();
		scanner.close();
	}
}