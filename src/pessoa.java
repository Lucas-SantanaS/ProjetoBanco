public class pessoa {

    public class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;

        }
    public void exibirInformacoes(){
            System.out.println("Seu nome é:  " + nome + " e sua idade: " + idade);
        }
    }
}
