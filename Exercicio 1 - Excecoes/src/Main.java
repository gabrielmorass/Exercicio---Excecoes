public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Gabriel", 1111);
        Cliente cliente2 = new Cliente("Livia", 2222);
        Cliente cliente3 = null;

        Conta conta = new Conta(1500, 500);

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mostraInfo();


    }
}