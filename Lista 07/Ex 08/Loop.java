import java.util.Scanner;
public class Loop {
	private int tamanhoPadrao;
	Loop(int novoTamanhoPadrao) {
		this.setTamanhoPadrao(novoTamanhoPadrao);
	}
	public int getTamanhoPadrao() {
		return this.tamanhoPadrao;
	}
	public void setTamanhoPadrao(int novoTamanhoPadrao){
		this.tamanhoPadrao = novoTamanhoPadrao;
	}
	public void imprimirPadrao() {
		int tamanho = this.getTamanhoPadrao();
		int tamanhoEstrelas = 1;
		int tamanhoPonto = tamanho - 1;
		String estrelas = "";
		String pontos = "";
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanhoPonto; j++) {
				pontos += ".";
			}
			for(int k = 0; k < tamanhoEstrelas; k++) {
				estrelas += "*";
			}
			System.out.printf("%s%s%s\n", pontos, estrelas, pontos);
			tamanhoPonto--;
			tamanhoEstrelas += 2;
			estrelas = "";
			pontos = "";
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int tamanho = scanner.nextInt();
		Loop padrao = new Loop(tamanho);
		padrao.imprimirPadrao();
	}
}