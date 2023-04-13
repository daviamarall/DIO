import java.util.Scanner;

public class MudancaparaIrlanda {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite o Salario Bruto:");
            double salarioBruto = input.nextDouble();
            System.out.println("Digite os Beneficios:");
            double beneficios = input.nextDouble();

            double imposto = 0;

            if (salarioBruto <= 1100.00) {
                imposto = salarioBruto * 0.05;
            } else if (salarioBruto <= 2500.00) {
                imposto = salarioBruto * 0.1;
            } else {
                imposto = salarioBruto * 0.15;
            }

            double salarioLiquido = salarioBruto - imposto + beneficios;

            System.out.printf("Salario liquido: %.2f", salarioLiquido);
        } finally {
            input.close();
        }
    }

}
