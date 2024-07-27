import java.util.Scanner;
public class Soma {
	private int somaDigitos;
	public void setSomaDigitos(int novaSomaDigitos) {
		this.somaDigitos = novaSomaDigitos;
	}
	public int getSomaDigitos() {
		return this.somaDigitos;
	}
	public int somaDigitos(int valor) {
		int soma;
		if(valor % 10 == valor){
			soma = valor;
		}
		else {
			soma = (valor % 10) + somaDigitos(valor / 10);
		}
		return soma;
	}
	public void mostrarSomaDigitos(int valor) {
		int soma = this.somaDigitos(valor);
		this.setSomaDigitos(soma);
		System.out.println(this.getSomaDigitos());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		Soma digitos = new Soma();
		digitos.mostrarSomaDigitos(valor);
		scanner.close();
	}
}