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
	
	public int somaLinha(int linha) {
		int soma = 0;
		for(int i = 0;i < this.getTamanhoColuna(); i++) {
			soma += this.getElemento(linha, i);
		}
		return soma;
	}
	
	public int somaColuna(int coluna) {
		int soma = 0;
		for(int i = 0;i < this.getTamanhoLinha(); i++) {
			soma += this.getElemento(i, coluna);
		}
		return soma;
	}
	
	public int somaDiagonalPrincipal() {
		int soma = 0;
		for(int i = 0;i < this.getTamanhoLinha(); i++) {
			for(int j = 0; j < this.getTamanhoColuna(); j++) {
				if(i == j) {
					soma += this.getElemento(i, j);
				}	
			}
		}
		return soma;
	}
	
	public int somaDiagonalSecundaria() {
		int soma = 0;
		for(int i = 0;i < this.getTamanhoLinha(); i++) {
			for(int j = 0; j < this.getTamanhoColuna(); j++) {
				if(i + j + 1 == this.getTamanhoColuna()) {
					soma += this.getElemento(i, j);
				}	
			}
		}
		return soma;
	}
	
	public void ehQuadradoMagico() {
		boolean ehQuadradoMagico = true;
		int valorMagico = this.somaLinha(0);
		
		//verificar as linhas
		for(int i = 1; i < this.getTamanhoLinha() && ehQuadradoMagico;i++) {
			if(this.somaLinha(i) != valorMagico) {
				ehQuadradoMagico = false;
			}
		}
		//verificar as colunas
		for(int i = 0; i < this.getTamanhoLinha() && ehQuadradoMagico;i++) {
			if(this.somaColuna(i) != valorMagico) {
				ehQuadradoMagico = false;
			}
		}
		//verificar as diagonais
		if(this.somaDiagonalPrincipal() != valorMagico && ehQuadradoMagico) {
			ehQuadradoMagico = false;
		}
		if(this.somaDiagonalSecundaria() != valorMagico && ehQuadradoMagico) {
			ehQuadradoMagico = false;
		}
		
		if(ehQuadradoMagico) {
			System.out.println("eh um quadrado magico!");
		}
		else {
			System.out.println("nao eh um quadrado magico!");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fator;
		Matriz matriz1;
		fator = scanner.nextInt();
		matriz1 = new Matriz(fator, fator);
		matriz1.lerMatriz(scanner);
		matriz1.imprimeMatriz();
		matriz1.ehQuadradoMagico();
		scanner.close();
	}
}