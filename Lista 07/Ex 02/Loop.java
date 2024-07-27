import java.util.Scanner;
public class Loop {
	private int numero1;
	private int numero2;
	Loop(int novoNumero1, int novoNumero2) {
		this.setNumero1(novoNumero1);
		this.setNumero2(novoNumero2);
	}
	public void setNumero1(int novoNumero1) {
		this.numero1 = novoNumero1;
	}
	public int getNumero1() {
		return this.numero1;
	}
	public void setNumero2(int novoNumero2) {
		this.numero2 = novoNumero2;
	}
	public int getNumero2() {
		return this.numero2;
	}
	public void imprimirContagem() {
		int num1 = this.getNumero1();
		int num2 = this.getNumero2();
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				if(i == num2) {
					System.out.printf("%d\n", i);
				}
				else {
					System.out.printf("%d ", i);
				}
			}
		}
		else {
			for(int i = num1; i >= num2; i--) {
				if(i == num2) {
					System.out.printf("%d\n", i);
				}
				else {
					System.out.printf("%d ", i);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int limite1;
		int limite2;
		limite1 = scanner.nextInt();
		limite2 = scanner.nextInt();
		Loop listaNumeros = new Loop(limite1, limite2);
		listaNumeros.imprimirContagem();
		scanner.close();
	}
}