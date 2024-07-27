import java.util.Scanner;
public class Potencia {
	private int resultado;
	public void setResultado(int novoResultado) {
		this.resultado = novoResultado;
	}
	public int getResultado() {
		return this.resultado;
	}
	public int pot(int base, int expoente) {
		int valor;
		if(expoente == 1){
			valor = base;
		}
		else {
			valor = base * pot(base, expoente - 1);
		}
		return valor;
	}
	public void mostrarPotencia(int base, int expoente) {
		int valorPotencia = this.pot(base, expoente);
		this.setResultado(valorPotencia);
		System.out.println(this.getResultado());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		int expoente = scanner.nextInt();
		Potencia calcular = new Potencia();
		calcular.mostrarPotencia(base, expoente);
		scanner.close();
	}
}