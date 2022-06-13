public class Main {

    public static void main(String[] args) {
        Cliente nailton = new Cliente();
        nailton.setNome("Nailton");


        Banco Santander = new Banco() {
        };
        Conta cc = new ContaCorrente(nailton);
        Conta poupanca = new ContaPoupanca(nailton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        //



    }
}
