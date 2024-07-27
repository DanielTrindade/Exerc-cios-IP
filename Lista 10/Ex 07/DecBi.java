import java.util.Scanner;
public class DecBi {
	private int numeroBinario;
	public void setNumeroBinario(int novoNumeroBinario) {
		this.numeroBinario = novoNumeroBinario;
	}
	public int getNumeroBinario() {
		return this.numeroBinario;
	}
	public int converte(int numeroDecimal) {
		int numBinario;
		if(numeroDecimal == 0) {
			numBinario = 0;
		} else {
			numBinario = 10 * converte(numeroDecimal / 2) + (numeroDecimal % 2) ;
		}
		return numBinario;
	}
	public void mostrarNumeroBinario(int numeroDecimal) {
		int novoNumeroBinario = this.converte(numeroDecimal);
		this.setNumeroBinario(novoNumeroBinario);
		System.out.println(this.getNumeroBinario());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroDecimal = scanner.nextInt();
		DecBi numero = new DecBi();
		numero.mostrarNumeroBinario(numeroDecimal);
		scanner.close();
	}
}