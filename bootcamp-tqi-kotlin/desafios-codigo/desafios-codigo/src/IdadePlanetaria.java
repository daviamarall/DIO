import java.util.Scanner;

public class IdadePlanetaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Idade em anos terrestres");
        double idadeTerrestre = scanner.nextDouble();
        System.out.println("Infomr o planeta: Marte, Venus, Jupiter");
        String planeta = scanner.next();

        double idadePlaneta;
        if (planeta.equals("Marte")) {
            idadePlaneta = idadeTerrestre / 1.88;
            System.out.printf("Idade equivalente em Marte: %.2f anos", idadePlaneta);
        } else if (planeta.equals("Venus")) {
            idadePlaneta = idadeTerrestre / 0.62;
            System.out.printf("Idade equivalente em Venus: %.2f anos", idadePlaneta);
        } else if (planeta.equals("Jupiter")) {
            idadePlaneta = idadeTerrestre / 11.86;
            System.out.printf("Idade equivalente em Jupiter: %.2f anos", idadePlaneta);
        } else {
            System.out.println("Planeta invalido.");
        }

        scanner.close();
    }
}