import java.util.Scanner;
public class Loop {
	private int numero;
	Loop(int novoNumero) {
		this.setNumero(novoNumero);
	}
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	public int getNumero() {
		return this.numero;
	}
	public void imprimirContagem() {
		int fim = this.getNumero();
		int inicio = 0;
		for(int i = inicio; i <= fim; i++) {
			if(i == fim) {
				System.out.printf("%d\n", i);
			}
			else {
				System.out.printf("%d ", i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int finalIntervalo;
		finalIntervalo = scanner.nextInt();
		Loop listaNumeros = new Loop(finalIntervalo);
		listaNumeros.imprimirContagem();
		scanner.close();
	}
}