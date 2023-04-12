import java.util.Scanner;

public class LojaGeek {
  
  public static void main(String[] args) {

    System.out.println("Insira a média das avaliações de desempenho dos funcionários: ");
    Scanner scanner = new Scanner(System.in);
    double media = scanner.nextDouble();

    if (media < 5.0) {
        System.out.println("REP");
    } else if (media < 7.0) {
        System.out.println("MED");
    } else {
        System.out.println("APR");
    }
  }
}
