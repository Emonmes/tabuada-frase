import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int resposta;
        String saudacao;

        System.out.println("Seja Bem-vindo ao programa de tabuada de multiplicação!");


            System.out.println("Escolha um número: ");
            int numero = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);
            }

        do {

            System.out.println("Deseja continuar? \n 1 - SIM \n 2 - NÃO");
            resposta = scanner.nextInt();
            scanner.nextLine();

            if (resposta == 1) {
                System.out.println("Digite uma frase para encerrar:");
                saudacao = scanner.nextLine();

                    System.out.println(" Você Digitou " + saudacao);
                    break;

            } else if (resposta == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                break;
            } else {
                System.out.println("Opção inválida, digite novamente!");

            }

        } while (true);

        System.out.println("Programa encerrado!");
        scanner.close();
    }
}
