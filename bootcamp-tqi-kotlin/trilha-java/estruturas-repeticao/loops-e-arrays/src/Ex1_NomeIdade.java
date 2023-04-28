import java.util.Scanner;

public class Ex1_NomeIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite '0' para sair do programa");
        System.out.println(" ");

        while (true) {

            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0"))
                break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }

    }

}
