import java.util.Set;
import java.util.TreeSet;

public class ExercicioPropostoSet {

    public static void main(String[] args) {
        
        //crie um conjunto contendo as cores do arco-íris e:
        // A. Exiba todas as cores uma abaixo da outra
        // B. A quantidade de cores que o arco-íris tem
        // C. Exiba as cores em ordem alfabética
        // D. Exiba as cores na ordem inversa da que foi informada
        // E. Exiba todas as cores que começam com a letra ”v”  
        // F. Remova todas as cores que não começam com a letra “v”
        // G. Limpe o conjunto
        // H. Confira se o conjunto está vazio

        Set<String> cores = new TreeSet<>();
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Anil");
        cores.add("Violeta");

        System.out.println("A. Exiba todas as cores uma abaixo da outra");

        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println(" ");
        System.out.println("B. A quantidade de cores que o arco-íris tem");
        System.out.println(cores.size());

        System.out.println(" ");
        System.out.println("C. Exiba as cores em ordem alfabética");

        System.out.println(cores);

        System.out.println(" ");
        System.out.println("D. Exiba as cores na ordem inversa da que foi informada");

        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println(cores);

        System.out.println(" ");
        System.out.println("E. Exiba todas as cores que começam com a letra ”v”");
        
        for (String cor : cores) {
            if (cor.startsWith("V")) {
                System.out.println(cor);
            }
        }
        
        System.out.println(" ");
        System.out.println("F. Remova todas as cores que não começam com a letra 'v' ");

        java.util.Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("V")) {
                iterator.remove();
            }
        }

        System.out.println(cores);

        System.out.println(" ");
        System.out.println("G. Limpe o conjunto");

        cores.clear();

        System.out.println(cores);

        System.out.println(" ");
        System.out.println("H. Confira se o conjunto está vazio");

        System.out.println(cores.isEmpty());

 
    }
    
}
