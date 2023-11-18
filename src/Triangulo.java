import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Informe um número ímpar:");
            numero = leitor.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Por favor, informe um número ímpar.");
            }
        } while (numero % 2 == 0);

        for (int i = 1; i <= numero; i += 2) {
            int espacos = (numero - i) / 2;

            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= numero; i += 2) {
            int espaco = (numero - i) / 2;

            for (int j = 0; j < espaco; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = numero - 2; i >= 1; i -= 2) {
            int espaco = (numero - i) / 2;

            for (int j = 0; j < espaco; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        leitor.close();
    }
}





