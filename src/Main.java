public class Main {
    public static void main(String[] args) {
        Cliente Doni = new Cliente();
        Doni.setName("Donizetti");



        Conta cc = new ContaCorrente(Doni);
        Conta poupanca = new ContaPoupanca(Doni);

        cc.depositar(1000);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
