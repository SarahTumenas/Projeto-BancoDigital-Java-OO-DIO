public class ContaPoupanca extends Conta {
    @Override
    public void ImprimirExtrato() {
        System.out.println("\t==== Extrato Conta Poupança \t===");
        System.out.printf("Agência: %d%n", super.agencia);
        System.out.printf("Número: %d%n", super.numero);
        System.out.printf("Saldo: %.2f%n", super.saldo);
    }
}
