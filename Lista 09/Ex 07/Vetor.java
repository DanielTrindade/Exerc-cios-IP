import java.util.Scanner;
import java.text.DecimalFormat;
public class Vetor {
	private float[] vet;
	private int tamanho;
	
	Vetor(int novoTamanho, float novoDepositoInicial) {
		this.setTamanho(novoTamanho);
		this.vet = this.createVetor(this.getTamanho());
		this.setElemento(0, novoDepositoInicial);
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void setTamanho(int novoTamanho) {
		this.tamanho = novoTamanho;
	}
	
	public float getElemento(int index) {
		return this.vet[index];
	}
	
	public void setElemento(int index, float novoValor) {
		this.vet[index] = novoValor;
	}
	
	public float[] createVetor(int tamanho) {
		return new float[tamanho];
	}
	
	
	public void gerarRelatorioRenda(float depositoInicial) {
		DecimalFormat df = new DecimalFormat("#.##");
		df.setMinimumFractionDigits(1);
		double taxaDeJuros = 1.2 / 100;
		double saldo = depositoInicial;
		for (int i = 1; i < this.getTamanho(); i++) {
			saldo *= (1 + taxaDeJuros); 
			System.out.println(df.format(saldo)); 
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float depositoInicial;
		int meses;
		depositoInicial = scanner.nextFloat();
		meses = scanner.nextInt();
		Vetor vetor1 = new Vetor(meses + 1, depositoInicial);
		vetor1.gerarRelatorioRenda(depositoInicial);
		scanner.close();
	}
}