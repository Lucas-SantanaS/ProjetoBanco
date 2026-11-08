public class Conta {

    private double saldo ;
    private int id;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor == 0) {
            System.out.println("O valor não a ser depositado não pode ser zero!");
        } else if (valor < 0) {
            System.out.println("O valor não pode ser negativo!");
        }else{
            System.out.println("A quantia de: R$ "+valor+" foi depositado com sucesso!");
            saldo += valor;
        }
    }
    public void sacar(double valor){
       if (saldo >= valor){
            if (valor == 0){
                System.out.println("O valor a ser sacado não pode ser 0!");
            } else if(valor < 0){
                System.out.println("O valor a ser sacado não pode ser menor que 0!");}
            else {
                System.out.println("A quantia de: R$ " + valor + " foi sacada com sucesso!");
                saldo -= valor;
            }
       } else {
           System.out.println("Saldo insuficiente!");
       }
    }
    public double getSaldo(){
        return saldo;
    }
}
