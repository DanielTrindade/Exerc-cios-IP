import java.util.Scanner;
//melhorar a organização do cód
public class FazendinhaToya {
  private int quantidadeDeOperacoes;
  private int quantidadeBoisBranco;
  private int quantidadeBoisPreto;
  private float pesoTotalRacaBranca;
  private float pesoTotalRacaPreta;
  FazendinhaToya(int novaQuantidadeDeOperacoes) {
    this.setQuantidadeDeOperacoes(novaQuantidadeDeOperacoes);
  }
  
  public int getQuantidadeDeOperacoes() {
    return this.quantidadeDeOperacoes;
  }
  public void setQuantidadeDeOperacoes(int novaQuantidadeDeOperacoes) {
    this.quantidadeDeOperacoes = novaQuantidadeDeOperacoes;
  }

  public int getQuantidadeBoisBranco() {
    return this.quantidadeBoisBranco;
  }
  
  public void setQuantidadeBoisBranco(int novaQuantidadeBoisBranco) {
    this.quantidadeBoisBranco = novaQuantidadeBoisBranco;
  }

  public int getQuantidadeBoisPreto() {
    return this.quantidadeBoisPreto;
  }
  
  public void setQuantidadeBoisPreto(int novaQuantidadeBoisPreto) {
    this.quantidadeBoisPreto = novaQuantidadeBoisPreto;
  }

  public void setPesoTotalRacaBranca(float novoPesoTotalRacaBranca) {
    this.pesoTotalRacaBranca = novoPesoTotalRacaBranca;
  }
  
  public float getPesoTotalRacaBranca() {
    return this.pesoTotalRacaBranca;
  }

  public void setPesoTotalRacaPreta(float novoPesoTotalRacaPreta) {
    this.pesoTotalRacaPreta = novoPesoTotalRacaPreta;
  }

  public float getPesoTotalRacaPreta() {
    return this.pesoTotalRacaPreta;
  }

  public void simularFazendinha(Scanner scanner) {
    int quantidadeOperacoes = this.getQuantidadeDeOperacoes();
    int quantidadeDeBois;
    int quantidadeBoisBrancos = 0;
    int quantidadeBoisPretos = 0;
    float pesoTotalBranco = 0.0f;
    float pesoTotalPreto = 0.0f;
    float pesoVaca;
    String raca;
    for(int i = 0; i < quantidadeOperacoes; i++) {
      scanner.nextLine();
      raca = scanner.nextLine();
      quantidadeDeBois = scanner.nextInt();
      for(int j = 0; j < quantidadeDeBois; j++) {
        pesoVaca = scanner.nextFloat();
        if(raca.equals("p") == true) {
          pesoTotalPreto += pesoVaca;
          quantidadeBoisPretos++;
        }
        else{
          pesoTotalBranco += pesoVaca;
          quantidadeBoisBrancos++;
        }
      }
    }
    this.setQuantidadeBoisBranco(quantidadeBoisBrancos);
    this.setQuantidadeBoisPreto(quantidadeBoisPretos);
    this.setPesoTotalRacaBranca(pesoTotalBranco);
    this.setPesoTotalRacaPreta(pesoTotalPreto);
  }
  public void exibirDadosSimulacaoFazendinha() {
    int quantidadeBoisBrancos = this.getQuantidadeBoisBranco();
    int quantidadeBoisPretos = this.getQuantidadeBoisPreto();
    float pesoTotalRacaBranca = this.getPesoTotalRacaBranca();
    float pesoTotalRacaPreta = this.getPesoTotalRacaPreta();
    System.out.printf("Quantidade de bois brancos: %d\n", quantidadeBoisBrancos);
    System.out.printf("Peso total dos bois brancos: %.2f KG\n",pesoTotalRacaBranca);
    System.out.printf("Quantidade de bois pretos: %d\n", quantidadeBoisPretos);
    System.out.printf("Peso total dos bois pretos: %.2f KG\n",pesoTotalRacaPreta);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int valor;
    valor = scanner.nextInt();
    FazendinhaToya fazenda = new FazendinhaToya(valor);
    fazenda.simularFazendinha(scanner);
    fazenda.exibirDadosSimulacaoFazendinha();
    scanner.close();
  }
}