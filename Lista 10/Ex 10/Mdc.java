import java.util.Scanner;
public class Mdc {
	private int resultado;
	public void setResultado(int novoResultado) {
		this.resultado = novoResultado;
	}
	
	public int getResultado() {
		return this.resultado;
	}
	
	public int calculaMdc(int a, int b) {
		int resultado;
		if(b == 0){
			resultado = a;
		}
		else {
			resultado = calculaMdc(b, a % b);
		}
		return resultado;
	}
	
	public void mostrarMdc(int n, int m) {
		int valorMdc = this.calculaMdc(n, m);
		this.setResultado(valorMdc);
		System.out.println(this.getResultado());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Mdc numeros = new Mdc();
		numeros.mostrarMdc(a, b);
		scanner.close();
	}
}