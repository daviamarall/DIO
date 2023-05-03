public class Arrays_Ex1_OrdemInversa {
    
    public static void main(String[] args) {
        
        int [] vetor = {-4,-5,20,30,6,9};
        int count = 0;

        System.out.println("Vetor: ");
        while(count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.println(vetor[i] + " ");

        }

    }

}
