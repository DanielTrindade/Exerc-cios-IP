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
		int cont0E100 = 0;
		int cont101E200 = 0;
		int contMaiorQue200 = 0;
		int inicio = 0;
		for(int i = inicio; i <= fim; i++) {
			if(i > 0 && i < 100) {
				cont0E100++;
			}
			else if(i > 101 && i < 200){
				cont101E200++;
			}
			else if(i > 200){
				contMaiorQue200++;
			}
		}
		System.out.printf("Entre 0 e 100: %d\n", cont0E100);
		System.out.printf("Entre 101 e 200: %d\n", cont101E200);
		System.out.printf("Maior que 200: %d\n", contMaiorQue200);
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