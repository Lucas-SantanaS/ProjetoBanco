import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        System.out.println("Bem-vindo(a) ao Banco ItaBread\n");
        System.out.println("Crie sua conta para começar!");
        System.out.println("Digite seu nome: ");
        String nomeCadastro = sc.next();
        System.out.println("Digite seu CPF: ");
        int cpfCadastro = sc.nextInt();

        Conta conta = new Conta(0);
        Pessoa pessoa = new Pessoa(nomeCadastro,cpfCadastro,conta);


        System.out.println("\nSejá bem-vindo(a) "+pessoa.getNome());

        while(menu != 5){
        System.out.print("\nDigite qual funcionalidade você deseja acessar: ");
        System.out.println(
                "\n1 - Consultar Conta \n" +
                "2 - Depositar \n" +
                "3 - Sacar \n" +
                "4 - Ver saldo \n" +
                "5 - Sair \n");
        menu = sc.nextInt();

        switch (menu){
            case 1:
                pessoa.consultar();
                break;
            case 2:
                System.out.println("Digite o valor a ser depositado: ");
                double valorDeposito = sc.nextDouble();
                conta.depositar(valorDeposito);
                break;
            case 3:
                System.out.println("Saldo disponivel para saque: R$ "+conta.getSaldo());
                System.out.println("Digite o valor a ser sacado: ");
                double valorSaque = sc.nextDouble();
                conta.sacar(valorSaque);
                break;
            case 4:
                System.out.println("Saldo disponivel: R$ "+conta.getSaldo());
                break;
            case 5:
                System.out.println("Saindo... ");
                break;
            default:
                System.out.println("Opção inválida!");

            }
        }
    }
}