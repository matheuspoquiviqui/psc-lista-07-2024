import java.util.ArrayList;
import java.util.Scanner;
public class Ativ04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList<>();

        while (true) {
            System.out.print("Informe as vendas brutas do vendedor (ou -1 para sair): ");
            double vendasBrutas = scanner.nextDouble();

            if (vendasBrutas == -1) {
                break;
            }

            double salario = 200 + 0.09 * vendasBrutas;
            salarios.add(salario);
        }

        int[] contadores = new int[9];
        for (double salario : salarios) {
            if (salario >= 200 && salario < 300) {
                contadores[0]++;
            } else if (salario >= 300 && salario < 400) {
                contadores[1]++;
            } else if (salario >= 400 && salario < 500) {
                contadores[2]++;
            } else if (salario >= 500 && salario < 600) {
                contadores[3]++;
            } else if (salario >= 600 && salario < 700) {
                contadores[4]++;
            } else if (salario >= 700 && salario < 800) {
                contadores[5]++;
            } else if (salario >= 800 && salario < 900) {
                contadores[6]++;
            } else if (salario >= 900 && salario < 1000) {
                contadores[7]++;
            } else {
                contadores[8]++;
            }
        }

        System.out.println("Quantidade de vendedores em cada intervalo de salário:");
        for (int i = 0; i < contadores.length; i++) {
            if (i < 8) {
                System.out.printf("$%d - $%d: %d\n", 200 + i * 100, 299 + i * 100, contadores[i]);
            } else {
                System.out.printf("$1000 em diante: %d\n", contadores[i]);
            }
        }
    }
}
    
