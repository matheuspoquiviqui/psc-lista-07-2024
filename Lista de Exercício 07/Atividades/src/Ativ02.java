import java.util.Scanner;
public class Ativ02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };
        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (Sim ou Não): ");
            String repostas = scanner.nextLine().toLowerCase();
            if (repostas.equals("sim")) {
                respostasPositivas++;
            }
        }
        if (respostasPositivas == 2) {
            System.out.println("A pessoa é considerada: Suspeita.");   
        }else if (respostasPositivas >=3 && respostasPositivas <= 4) {
            System.out.println("A pessoa é considerada: Cúmplice.");           
        } else if (respostasPositivas == 5) {
            System.out.println("A pessoa é considerada: Assasino.");
        } else {
            System.out.println("A pessoa é considerada: Inocente.");
        }
        scanner.close();
    } 
}