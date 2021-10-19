import java.util.Scanner;

class NextLevel {
  public static void main(String[] args) {

    // criacao da variaveis
    float prova, projeto, exercicios, moocs, media, mediaSemestre;
    float media1 = 0, media2 = 0;
    int bimestre = 0;
    System.out.println("Bem vindo a Next Level");
    System.out.println("Sistema de calculo de médias bimestrais e semestrais");

    while (bimestre < 2) {
      bimestre++;
      System.out.println("Digite as notas do " + bimestre + "º Bimestre");

      // leitura e armazenamento da nota prova
      Scanner lerProva = new Scanner(System.in);
      System.out.print("Digite a nota da prova: ");
      prova = lerProva.nextFloat();

      // leitura e armazenamento da nota projeto
      Scanner lerProjeto = new Scanner(System.in);
      System.out.print("Digite a nota do projeto: ");
      projeto = lerProjeto.nextFloat();

      // leitura e armazenamento da nota projeto
      Scanner lerExercicios = new Scanner(System.in);
      System.out.print("Digite a nota dos exercícios: ");
      exercicios = lerExercicios.nextFloat();

      // leitura e armazenamento da nota do MOOCs
      Scanner lerMoocs = new Scanner(System.in);
      System.out.print("Digite a nota do MOOCs: ");
      moocs = lerMoocs.nextFloat();

      // calculando a média do bimestre
      media = ((prova * 3) + (projeto * 3) + (exercicios * 2) + (moocs * 3)) / 11;

      System.out.println("Sua média no " + bimestre + "º bimestre é " + media);
      System.out.println();
      if (bimestre == 1) {
        media1 = media;
      } else if (bimestre == 2) {
        media2 = media;
      } 
    }
    if (bimestre == 2) {
      mediaSemestre = ((media1 + media2) / 2);
      if (mediaSemestre >= 8) {
        System.out.println("Sua média semestral é " + mediaSemestre);
        System.out.println("Você foi aprovado ");
      } else {
        System.out.println("Sua média semestral é " + mediaSemestre);
        System.out.println("Você foi reprovado e necessita de " + (10 - mediaSemestre) + " pontos na prova final");

      }
    }
  }
}
