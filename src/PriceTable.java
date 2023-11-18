import java.util.Scanner;

public class PriceTable {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o valor do empréstimo?");
        double total_saldo_devedor = leitor.nextDouble();

        System.out.println("Qual a taxa de juros do empréstimo?");
        double juros_ao_mes = leitor.nextDouble();

        System.out.println("Qual o tempo para pagamento?");
        int total_de_meses = leitor.nextInt();

        double amortizacao = (total_saldo_devedor / total_de_meses);
        double saldo_devedor_atual = total_saldo_devedor;
        double juros_total = 0;
        double amortizacao_total = 0;
        double prestacao_total = 0;

        System.out.println("Valor fixo da amortização R$ " + amortizacao
                + ", Saldo devedor total R$ " + total_saldo_devedor
                + " com um juros de " + juros_ao_mes + "% ao mês");

        for (int i = 1; i <= total_de_meses; i++) {

            double juros_mensal = saldo_devedor_atual * (juros_ao_mes / 100);
            double prestacao_mensal = juros_mensal + amortizacao;
            saldo_devedor_atual -= amortizacao;

            juros_total += juros_mensal;
            amortizacao_total += amortizacao;
            prestacao_total += prestacao_mensal;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f%n",
                    i, juros_mensal, prestacao_mensal, saldo_devedor_atual);
        }

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f%n",
                prestacao_total, juros_total, amortizacao_total);

        leitor.close();
    }
}


