import java.util.Scanner;

public class TrafficLigth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número correspondente à cor do semáforo (1-vermelho, 2-amarelo, 3-verde):");
        int numero = scanner.nextInt();

        if (numero == 1) {
            System.out.println("Pare! O sinal está vermelho.");
        } else if (numero == 2) {
            System.out.println("Atenção! O sinal está amarelo.");
        } else if (numero == 3) {
            System.out.println("Siga em frente! O sinal está verde.");
        } else {
            System.out.println("Valor inválido! Digite 1, 2 ou 3 para indicar a cor do semáforo.");
        }
        
        scanner.close();
    }

}
