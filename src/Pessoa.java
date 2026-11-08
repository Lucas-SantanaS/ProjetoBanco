public class Pessoa {

    private String nome;
    private int cpf;
    private Conta conta;

    public Pessoa(String nome, int cpf, Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome(){
        return nome;
    }
    public int getCpf(){
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(int cpf){
        if(cpf > 0) {
            this.cpf = cpf;
        }
    }
    public void consultar(){
        System.out.println("Nome: "+nome+"\nCpf: "+cpf+"\nSaldo: "+conta.getSaldo());
    }
}
