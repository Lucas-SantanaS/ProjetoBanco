import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao Banco ItaBread\n");

        System.out.print("Digite qual funcionalidade você deseja acessar: ");
        System.out.println(
                "\n1 - Criar Conta \n" +
                "2 - Consultar Conta \n" +
                "3 - Depositar \n" +
                "4 - Sacar \n" +
                "5 - Ver saldo \n" +
                "6 - Sair \n");
        int menu = sc.nextInt();

        switch (menu){
            case 1:
                System.out.println("Função criar Conta em construção!");
                break;
            case 2:
                System.out.println("função consultar Conta em construção!");
                break;
            case 3:
                System.out.println("função depositar em construção!");
                break;
            case 4:
                System.out.println("função sacar em construção!");
                break;
            case 5:
                System.out.println("função ver saldo em construção!");
                break;
            case 6:
                System.out.println("Saindo... ");
                break;
            default:
                System.out.println("Valor inválido!!");
        }

    }
}