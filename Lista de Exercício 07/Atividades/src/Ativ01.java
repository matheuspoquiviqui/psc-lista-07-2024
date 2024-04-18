import java.util.Scanner;
public class Ativ01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double[] temperatura = new double[12];

        String[] meses = {"Janeiro", "Fevereiro","Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < 12; i++) {
            System.out.print("Escreva a temperatura do mês de " + meses[i] + ": ");
            temperatura[i] = scanner.nextDouble();

        }

        scanner.close();

    double soma = 0;
    for (double somaTemperaturas : temperatura) {
        soma += somaTemperaturas;
        }
    double mediaTemperatura = soma / 12;
    System.out.println("\nMédia das temperatura durante o ano: " + mediaTemperatura + "°C");

    System.out.println("\nTemperaturas acima da média anual:");
    for (int i = 0; i < 12; i++) {
        if (temperatura[i] > mediaTemperatura) {
            System.out.println("A temperatura do mês de "+ meses[i] + " = " + temperatura[i]);
        }
        
    }
    }
}
