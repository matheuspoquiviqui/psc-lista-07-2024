import java.util.ArrayList;
import java.util.Scanner;

public class Ativ03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Escreva várias notas e saiba suas especificações:");
        System.out.print("Escreva as notas ou digite (-1) para sair: ");
        double nota = scanner.nextDouble();
        while (nota != -1) {
            notas.add(nota);
            System.out.print("Escreva as notas ou digite (-1) para sair: ");
            nota = scanner.nextDouble();
        }
        System.out.println("Valores lidos: " + notas.size());

        System.out.println("Valores na ordem que foram digitados:");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Valores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        System.out.println("A soma das notas é: " + soma);

        double media = soma / notas.size();
        System.out.println("A média dos valores é: " + media);

        int acimaDaMedia = 0;
        int abaixoDeSete = 0;

        for (double n : notas) {
            if (n > media) {
                acimaDaMedia++;
            }
            if (n < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de valores menores que 07: " + abaixoDeSete);

        scanner.close();
    }
}
