public class ContaCorrente extends Conta {

    private double chequeEspecial;




    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


    public double getSaldoDisponivel (){

        return super.getSaldo() + chequeEspecial;
    }


    @Override
    public void sacar(double valor){
        valor += 10;
        super.sacar(valor);

    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("\t=== Extrato Conta Corrente \t===");
        ImprimirAtributos();
    }

    public void ImprimirAtributos() {
        System.out.printf("Agência: %d%n", super.agencia);
        System.out.printf("Número: %d%n", super.numero);
        System.out.printf("Saldo: %.2f%n", super.saldo);
    }
}
