import java.util.Scanner;

public class Bissexto {

    // Função que verifica se um ano é bissexto
    public static boolean ehBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }

    // Função que conta quantos anos bissextos existem entre dois anos
    public static int contarBissextos(int anoInicial, int anoFinal) {
        int contador = 0;
        for (int ano = anoInicial; ano <= anoFinal; ano++) {
            if (ehBissexto(ano)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int anoI = 2000;
        int anoF;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano entre 2000 e 4000:");
        anoF = sc.nextInt();

        if (anoF < anoI || anoF > 4000) {
            System.out.println("Ano inválido! Digite entre 2000 e 4000.");
        } else {
            // Verifica se o ano digitado é bissexto
            if (ehBissexto(anoF)) {
                System.out.println(anoF + " é bissexto.");
            } else {
                System.out.println(anoF + " não é bissexto.");
            }

            // Conta os anos bissextos entre 2000 e o ano digitado
            int totalBissextos = contarBissextos(anoI, anoF);
            System.out.println("De " + anoI + " até " + anoF + " existem " + totalBissextos + " anos bissextos.");
        }

        sc.close();
    }
}
