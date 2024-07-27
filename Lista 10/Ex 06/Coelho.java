import java.util.Scanner;
public class Coelho {
	private int quantidadeOrelhas;
	public void setQuantidadeOrelhas(int novaQuantidadeOrelhas) {
		this.quantidadeOrelhas = novaQuantidadeOrelhas;
	}
	public int getQuantidadeOrelhas(){
		return quantidadeOrelhas;
	}
	public int contarOrelhas(int quantidadeCoelhos) {
		int qtdOrelhas;
		if(quantidadeCoelhos == 0){
			qtdOrelhas = 0;
		}
		else if(quantidadeCoelhos % 2 == 0) {
			qtdOrelhas = 3 + contarOrelhas(quantidadeCoelhos - 1);
		}
		else {
			qtdOrelhas = 2 + contarOrelhas(quantidadeCoelhos - 1);
		}
		return qtdOrelhas;
	}
	public void mostrarQuantidadeOrelhas(int quantidadeCoelhos) {
		int novaQuantidadeOrelhas = this.contarOrelhas(quantidadeCoelhos);
		this.setQuantidadeOrelhas(novaQuantidadeOrelhas);
		System.out.println(this.getQuantidadeOrelhas());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidadeCoelhos = scanner.nextInt();
		Coelho contarOrelhas = new Coelho();
		contarOrelhas.mostrarQuantidadeOrelhas(quantidadeCoelhos);
		scanner.close();
	}
}