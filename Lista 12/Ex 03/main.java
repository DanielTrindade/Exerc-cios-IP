import java.util.Scanner;
class Aluno {
	private int matricula;
	private String nome;
	private float coeficiente;
	Aluno(int novaMatricula, String novoNome, float novoCoeficiente) {
		this.setMatricula(novaMatricula);
		this.setNome(novoNome);
		this.setCoeficiente(novoCoeficiente);
	}
	public void setMatricula(int novaMatricula) {
		this.matricula = novaMatricula;
	}
	public int getMatricula() {
		return this.matricula;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCoeficiente(float novoCoeficiente) {
		this.coeficiente = novoCoeficiente;
	}
	public float getCoeficiente() {
		return this.coeficiente;
	}
}

class VetorAlunos {
	private Aluno[] alunos;
	private int tamanho;
	VetorAlunos(int novoTamanho) {
		this.setTamanho(novoTamanho);
		this.alunos = new Aluno[this.getTamanho()];
	}
	public void setTamanho(int novoTamanho) {
		this.tamanho = novoTamanho;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void setElemento(int index, Aluno novoAluno) {
		this.alunos[index] = novoAluno;
	}
	
	public Aluno getElemento(int index) {
		return this.alunos[index];
	}
	
	public void lerAlunos(Scanner scanner) {
		int matricula;
		String nome;
		float coeficiente;
		Aluno al;
		for(int i = 0; i < this.getTamanho(); i++) {
			matricula = scanner.nextInt();
			scanner.nextLine();
			nome = scanner.nextLine();
			coeficiente = scanner.nextFloat();
			al = new Aluno(matricula, nome, coeficiente);
			this.setElemento(i, al);
		}
	}
	public void imprimeMedia() {
		float media = 0.0f;
		Aluno al;
		for(int i = 0; i < this.getTamanho(); i++) {
			al = this.getElemento(i);
			media += (al.getCoeficiente());
		}
		media = media / this.getTamanho();
		System.out.printf("%.2f\n", media);
	}
}

public class main {//classe nome do arquivo
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidadeAlunos;
		VetorAlunos listaAlunos;
		quantidadeAlunos = scanner.nextInt();
		listaAlunos = new VetorAlunos(quantidadeAlunos);
		listaAlunos.lerAlunos(scanner);
		listaAlunos.imprimeMedia();
		scanner.close();
	}
}