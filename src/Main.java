import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 500, aposta, pagamento;
        String[] simbolos;
        String jogarNovamente;

        System.out.println("===========================");
        System.out.println(" Bem Vindo(a) ao Byte-Bet ");
        System.out.println(" Simbolos: 👑 🔔 💰 🍒 🍉 ");
        System.out.println("============================");

        while (saldo > 0) {
            System.out.println("Seu Saldo Atual: R$"+saldo);
            System.out.println("Digite o Valor da Aposta: ");
            aposta = scanner.nextInt();
            scanner.nextLine();

            if (aposta > saldo) {
                System.out.println("Saldo insuficiente");
                continue;
            } else if (aposta <= 0) {
                System.out.println("Valor invalido Apenas valores positivos");
                continue;
            } else {
                saldo -= aposta;
            }
            System.out.println("============================");
            System.out.println("Girando...");
            simbolos = girando();
            printSimbolos(simbolos);
            pagamento = getPagamento(simbolos, aposta);

            if (pagamento > 0){
                System.out.println("Você ganhou: R$"+pagamento);
                saldo += pagamento;
            }
            else {
                System.out.println("Casa WIN, AHHAHHAHAHHAHHA!");
            }
            System.out.println("Quer Jogar novamente? (S/N) ");
            jogarNovamente = scanner.nextLine().toUpperCase();
            if (!jogarNovamente.equals("S")){
                break;
            }


        }
        System.out.println("Fim de Jogo! \nSeu Saldo: R$"+saldo);
    }

    static String[] girando() {
        String[] simbolos = {"👑", "🔔", "💰", "🍒", "🍉"};
        String[] girou = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            girou[i] = simbolos[random.nextInt(simbolos.length)];
        }
        return girou;
    }
    static void printSimbolos(String[] simbolos) {
        System.out.println("================");
        System.out.println(" " + String.join(" | ", simbolos));
        System.out.println("================");
    }
    static int getPagamento(String[] simbolos, int aposta) {
        if (simbolos[0].equals(simbolos[1]) && simbolos[1].equals(simbolos[2])) {
            return switch (simbolos[0]) {
                case "🍒" -> aposta * 3;
                case "🍉" -> aposta * 4;
                case "🔔" -> aposta * 5;
                case "💰" -> aposta * 10;
                case "👑" -> aposta * 20;
                default -> 0;
            };
        } else if (simbolos[0].equals(simbolos[1])) {
            return switch (simbolos[0]) {
                case "🍒" -> aposta * 2;
                case "🍉" -> aposta * 2;
                case "🔔" -> aposta * 2;
                case "💰" -> aposta * 5;
                case "👑" -> aposta * 7;
                default -> 0;
            };
        } else if (simbolos[1].equals(simbolos[2])) {
            return switch (simbolos[1]) {
                case "🍒" -> aposta * 2;
                case "🍉" -> aposta * 2;
                case "🔔" -> aposta * 2;
                case "💰" -> aposta * 5;
                case "👑" -> aposta * 7;
                default -> 0;
            };
        }
        return 0;
    }
}
