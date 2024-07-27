import java.util.Scanner;
class Vetor{
	private Pessoa[] vet;
	private int tamanho;
	Vetor(){
		this.setTamanho(4);
		vet = new Pessoa[this.getTamanho()];
	}
	
	Vetor(int novoTamanho){
		this.setTamanho(novoTamanho);
		vet = new Pessoa[this.getTamanho()];
	}
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	public void setTamanho(int novoTam){
		this.tamanho = novoTam;
	}

	public Pessoa getElemento(int index){
		return this.vet[index];
	}
	
	public void setElemento(int index, Pessoa novaPessoa){
		this.vet[index] = novaPessoa;
	}
	public void maisAlto() {
		Pessoa maisAlta = this.getElemento(0);
		for(int i = 1; i < this.getTamanho();i++) {
			Pessoa pessoaAtual = this.getElemento(i);
			if(maisAlta.getAltura() < pessoaAtual.getAltura()) {
				maisAlta = pessoaAtual;
			}
		}
		maisAlta.imprimirPessoa();
	}
}
public class Pessoa {
	private String nome;
	private String profissao;
	private float altura;
	Pessoa(String novoNome, String novaProfissao, float novaAltura) {
		this.setNome(novoNome);
		this.setProfissao(novaProfissao);
		this.setAltura(novaAltura);
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setProfissao(String novaProfissao) {
		this.profissao = novaProfissao;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public void setAltura(float novaAltura) {
		this.altura = novaAltura;
	}
	public float getAltura() {
		return this.altura;
	}
	public void imprimirPessoa() {
		System.out.println(this.getNome());
		System.out.printf("%.2f\n",this.getAltura());
		System.out.println(this.getProfissao());
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		String profissao;
		float altura;
		Vetor pessoas = new Vetor();
		Pessoa pessoa;
		for(int i = 0;i < 4; i++) {
			nome = scanner.nextLine();
			pessoa = new Pessoa(nome, "", 0.0f);
			pessoas.setElemento(i, pessoa);
		}
		for(int i = 0;i < 4; i++) {
			profissao = scanner.nextLine();
			pessoa = pessoas.getElemento(i);
			pessoa.setProfissao(profissao);
		}
		for(int i = 0;i < 4; i++) {
			altura = scanner.nextFloat();
			pessoa = pessoas.getElemento(i);
			pessoa.setAltura(altura);
		}
		pessoas.maisAlto();
		scanner.close();
	}
}
