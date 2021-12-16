public class TesteUnitario {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(253.00);

        System.out.println(cc.getSaldo());
        cc.ImprimirExtrato();

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(900.00);
        cp.ImprimirExtrato();
        cp.sacar(300.00);
        cp.ImprimirExtrato();

        Conta conta1 = new Conta();
        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.ImprimirExtrato();

        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(1000);
        conta2.sacar(100);
        conta2.ImprimirExtrato();

        Conta conta3 = new ContaCorrente();
        conta3.depositar(1000);
        conta3.sacar(100);
        conta3.ImprimirExtrato();


        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setChequeEspecial(2000);

        contaCorrente.sacar(500);
        contaCorrente.ImprimirExtrato();


    }
}
