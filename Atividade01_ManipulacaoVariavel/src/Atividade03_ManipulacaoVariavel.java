import java.text.DecimalFormat;

public class Atividade03_ManipulacaoVariavel {
    public static void main(String[] args) {

        // Declaracao de variáveis
        String nomeProduto = "Notebook";
        double precoUnitario = 2500.00; // Preço unitário do produto em R$
        int quantidadeComprada = 5; // Quantidade de produtos comprados
        double taxaImposto = 0.10; // Taxa de imposto de 10% (como decimal)
        double margemLucro = 0.20; // Margem de lucro de 20% (como decimal)

        // Operações Simples
        double valorTotalSemImpostos = precoUnitario * quantidadeComprada; // Valor total sem impostos
        double valorImposto = valorTotalSemImpostos * taxaImposto; // Valor do imposto
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto; // Valor total com impostos
        double precoVenda = valorTotalComImpostos * (1 + margemLucro); // Preço de venda necessário

        // Desafio Extra: Arredondar e formatar como moeda
        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");
        String valorTotalComImpostosFormatado = formatoMoeda.format(valorTotalComImpostos);
        String precoVendaFormatado = formatoMoeda.format(precoVenda);

        // Mensagem final
        String mensagemFinal = "Produto: " + nomeProduto + "\n" +
                "Valor total com impostos: " + valorTotalComImpostosFormatado + "\n" +
                "Preço de venda sugerido: " + precoVendaFormatado;

        // Exibição de resultados
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Valor Total Sem Impostos: " + formatoMoeda.format(valorTotalSemImpostos));
        System.out.println("Valor do Imposto: " + formatoMoeda.format(valorImposto));
        System.out.println("Valor Total Com Impostos: " + valorTotalComImpostosFormatado);
        System.out.println("Preço de Venda Sugerido: " + precoVendaFormatado);
        System.out.println("\n" + mensagemFinal);
    }
}
