import java.util.Scanner;
public class Produto {
	private int produto;
	public void setProduto(int novoProduto) {
		this.produto = novoProduto;
	}
	public int getProduto() {
		return this.produto;
	}
	public int proRec(int x, int y) {
		int resultado;
		if(y == 0 || x == 0){
			resultado = 0;
		}
		else if((x > 0 && y > 0) || (x < 0 && y > 0)) {
			resultado = x + this.proRec(x, y - 1);
		}
		else {
			resultado = this.proRec(x, y + 1) - x;
		}
		return resultado;
	}
	public void mostrarProduto(int num1, int num2) {
		int novoProduto = this.proRec(num1, num2);
		this.setProduto(novoProduto);
		System.out.println(this.getProduto());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		Produto numeros = new Produto();
		numeros.mostrarProduto(num1, num2);
		scanner.close();
	}
}