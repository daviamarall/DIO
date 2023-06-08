package facade;

public class FacadeTest {

    public static void main(String[] args) {
        String nome = "João";
        String cep = "12345-678";

        Facade facade = new Facade();
        facade.migrarCliente(nome, cep);
    }
}
