import java.util.Scanner;

public class Prestacao {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor do veículo:");

        double valorVeiculo = leitor.nextDouble();
        double minValorParcela = 1000;

        int numeroParcelas = (int) (valorVeiculo / minValorParcela);
        if (valorVeiculo % minValorParcela != 0) {
            numeroParcelas--;
        }
        System.out.printf("O veículo pode ser ser financiado em " + numeroParcelas + " parcelas");

        leitor.close();
    }
}
