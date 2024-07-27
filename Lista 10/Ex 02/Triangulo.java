import java.util.Scanner;
public class Triangulo {
	private int quantidadeBlocos;
	public int getQuantidadeBlocos() {
		return this.quantidadeBlocos;
	}
	public void setQuantidadeBlocos(int novaQuantidadeBlocos) {
		this.quantidadeBlocos = novaQuantidadeBlocos;
	}
	public int contaBlocos(int linhas) {
		int resultado;
		if(linhas == 0){
			resultado = linhas;
		}
		else {
			resultado = linhas + contaBlocos(linhas - 1);
		}
		return resultado;
	}
	public void mostraQuantidadeDeBlocos(int linhas) {
		int quantidadeBlocos = this.contaBlocos(linhas);
		this.setQuantidadeBlocos(quantidadeBlocos);
		System.out.println(this.getQuantidadeBlocos());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int linhas = scanner.nextInt();
		Triangulo novoTriangulo = new Triangulo();
		novoTriangulo.mostraQuantidadeDeBlocos(linhas);
		scanner.close();
	}
}