import java.util.Scanner;
public class MediaTurmas {
	private int quantidadeTurmas;
	MediaTurmas(int novaQuantidadeTurmas) {
		this.setQuantidadeTurmas(novaQuantidadeTurmas);
	}
	public void setQuantidadeTurmas(int novaQuantidadeTurmas) {
		this.quantidadeTurmas = novaQuantidadeTurmas;
	}
	
	public int getQuantidadeTurmas() {
		return this.quantidadeTurmas;
	}
	
	public void CalcularEMostrarMedias(Scanner scanner) {
		int turmas = this.getQuantidadeTurmas();
		int quantidadeAlunos;
		int mediaAluno;
		int nomeTurma;
		float somaMedias = 0.0f;
		float mediaTurma = 0.0f;
		for(int i = 0; i < turmas; i++) {
			quantidadeAlunos = scanner.nextInt();
			for(int j = 0; j < quantidadeAlunos; j++) {
				mediaAluno = scanner.nextInt();
				somaMedias += mediaAluno;
			}
			mediaTurma = somaMedias / quantidadeAlunos;
			nomeTurma = i + 1;
			System.out.printf("Media da turma %d = %.2f\n", nomeTurma, mediaTurma);
			somaMedias = 0.0f;
			mediaTurma = 0.0f;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int turmas;
		turmas = scanner.nextInt();
		MediaTurmas listaAlunos = new MediaTurmas(turmas);
		listaAlunos.CalcularEMostrarMedias(scanner);
		scanner.close();
	}
}