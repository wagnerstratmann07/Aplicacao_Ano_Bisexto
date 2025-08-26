import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano entre 2000 e 4000.");
        int ano = sc.nextInt();

        if (ano < 2000 || ano > 4000) {
            System.out.println("Ano inválido, digite entre 2000 e 4000.");
        } else {
            int contador = 0;
            for (int i = 2000; i <= ano; i++) {
                if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) {
                    contador++;
                }
            }
            System.out.println("Existem " + contador + " anos bissextos nesse período.");
        }

        sc.close();
    }
}