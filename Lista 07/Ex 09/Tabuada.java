import java.util.Scanner;
public class Tabuada {
	private int fator1;
	private int fator2;
	Tabuada(int novoFator1, int novoFator2) {
		this.setFator1(novoFator1);
		this.setFator2(novoFator2);
	}
	public int getFator1() {
		return this.fator1;
	}
	public void setFator1(int novoFator1) {
		this.fator1 = novoFator1;
	}
	public int getFator2() {
		return this.fator2;
	}
	public void setFator2(int novoFator2) {
		this.fator2 = novoFator2;
	}
	public void imprimirTabuada() {
		int inicio = this.getFator1();
		int fim = this.getFator2();
		int multiplicacao;
		System.out.printf(" |");
		for(int j = inicio; j <= fim; j++) {
			System.out.printf("  %d", j);
		}
		System.out.printf("\n\n");
		for(int j = inicio; j <= fim; j++) {
			System.out.printf("%d| ", j);
			for(int i = inicio; i <= fim; i++) {
				multiplicacao = j * i;
				System.out.printf("%02d ", multiplicacao);
			}
			System.out.printf("\n");
		}	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fator1;
		int fator2;
		fator1 = scanner.nextInt();
		fator2 = scanner.nextInt();
		Tabuada numero = new Tabuada(fator1, fator2);
		numero.imprimirTabuada();
		scanner.close();
	}
}