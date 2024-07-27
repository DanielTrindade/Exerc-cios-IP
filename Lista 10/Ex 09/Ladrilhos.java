import java.util.Scanner;
public class Ladrilhos {
	private int qtdMinLadrilhos;
	public void setQtdMinLadrilhos(int novaQtdMinLadrilhos) {
		this.qtdMinLadrilhos = novaQtdMinLadrilhos;
	}
	public int getQtdMinLadrilhos() {
		return this.qtdMinLadrilhos;
	}
	public int minLadrilhos(int n, int m) {
		int qtdLadrilhos;
		if(n == 0 || m == 0){
			qtdLadrilhos = 0;
		} else {
			int ladrilhoMaximo = 1;
			while(ladrilhoMaximo * 2  <= n && ladrilhoMaximo * 2 <= m) {
				ladrilhoMaximo *= 2;
			}
			qtdLadrilhos = 1 + minLadrilhos(n - ladrilhoMaximo, m) + minLadrilhos(ladrilhoMaximo, m - ladrilhoMaximo);
		}
		return qtdLadrilhos;
	}
	public void mostrarMinLadrilhos(int n, int m) {
		int quantidadeLadrilhos = this.minLadrilhos(n, m);
		this.setQtdMinLadrilhos(quantidadeLadrilhos);
		System.out.println(this.getQtdMinLadrilhos());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		Ladrilhos base = new Ladrilhos();
		base.mostrarMinLadrilhos(w, h);
		scanner.close();
	}
}