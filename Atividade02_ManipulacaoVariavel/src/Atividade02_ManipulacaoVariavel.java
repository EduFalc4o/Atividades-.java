public class Atividade02_ManipulacaoVariavel {
    public static void main(String[] args) {
        // Declarando variáveis
        String nome = "Joe"; // Nome da pessoa
        int idade = 31; // Idade da pessoa
        double salarioMensal = 4500.00; // Salário bruto mensal em R$
        int mesesTrabalhados = 12; // Meses trabalhados no ano
        int quantidadeProdutos = 20; // Quantidade de produtos comprados

        // Operações Simples
        double salarioAnualBruto = salarioMensal * mesesTrabalhados; // Salário anual bruto
        double desconto = 2000.00; // Valor fixo de desconto
        double salarioAnualLiquido = salarioAnualBruto - desconto; // Salário anual líquido

        double totalGasto = 4500.00; // Valor total de compras
        double mediaValorPorProduto = totalGasto / quantidadeProdutos; // Média de valor gasto por produto

        String mensagem = "Olá, " + nome + "! Seu salário anual líquido é R$ " + salarioAnualLiquido;

        // Exibição de resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Mensal: R$ " + salarioMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido: R$ " + salarioAnualLiquido);
        System.out.println("Quantidade de Produtos Comprados: " + quantidadeProdutos);
        System.out.println("Média de Valor por Produto: R$ " + mediaValorPorProduto);
        System.out.println(mensagem);
    }
}
