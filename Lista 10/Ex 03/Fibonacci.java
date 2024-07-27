import java.util.Scanner;
public class Fibonacci {
	private int valorFibo;
	
	public void setValorFibo(int novoValorFibo) {
		this.valorFibo = novoValorFibo;
	}
	
	public int getValorFibo() {
		return this.valorFibo;
	}
	
	public int fibo(int posicao) {
		int resposta;
		if(posicao == 0) {
			resposta = 0;
		}
		else if(posicao == 1) {
			resposta = 1;
		}
		else {
			resposta = fibo(posicao - 1) + fibo(posicao - 2);
		}
		return resposta;
	}
	public void mostrarFibonacci(int posicao) {
		int fiboN = this.fibo(posicao);
		this.setValorFibo(fiboN);
		System.out.println(this.getValorFibo());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int posicao = scanner.nextInt();
		Fibonacci newFibo = new Fibonacci();
		newFibo.mostrarFibonacci(posicao);
		scanner.close();
	}
}