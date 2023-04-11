public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

        System.out.println("Exemplo byte: " + idade);
        System.out.println("Exemplo short: " + ano);
        System.out.println("Exemplo int: " + cep);
        System.out.println("Exemplo long: " + cpf);
        System.out.println("Exemplo float: " +  pi);
        System.out.println("Exemplo double: " + salario);

	}
}