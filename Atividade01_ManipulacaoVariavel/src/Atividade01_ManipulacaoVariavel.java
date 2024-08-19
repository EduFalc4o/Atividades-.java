public class Atividade01_ManipulacaoVariavel {
    public static void main(String[] args) {

        // Declarando variáveis
        int idade = 27; // idade de uma pessoa
        double altura = 1.80; // altura em metros
        String nome = "Marcos"; // nome da pessoa
        boolean isEstudante = true; // se a pessoa é estudante

        // Operações simples
        int outraIdade = 30;
        int somaIdades = idade + outraIdade; // Soma de duas idades
        double alturaDobro = altura * 2; // Multiplica a altura por 2
        String saudacao = "Olá, " + nome + "!"; // Concatena nome com saudação

        // Exibição de resultados
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        System.out.println("É estudante? " + isEstudante);
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Altura em dobro: " + alturaDobro);
        System.out.println(saudacao);
    }
}
