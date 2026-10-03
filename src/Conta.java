public class Conta {

    private double saldo;
    private Pessoa cpf;

    public Conta(double saldo, Pessoa cpf){
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public void depositar(double valor){
        if (valor == 0) {
            System.out.println("O valor não a ser depositado não pode ser zero!");
        } else if (valor < 0) {
            System.out.println("O valor não pode ser negativo!");
        }else{
            saldo += valor;
        }

    }
}
