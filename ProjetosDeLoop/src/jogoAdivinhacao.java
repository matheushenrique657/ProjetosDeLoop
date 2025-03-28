import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        int numeroResposta = (int) (Math.random() * 100) + 1;
        int numeroInput =101;

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivinhe um número de 1 a 100!");
        while (numeroInput != numeroResposta) {
        System.out.println("Palpite: ");
        numeroInput = sc.nextInt();

        if (numeroInput > numeroResposta) {
            System.out.println("Tente um número mais baixo: ");
        } else if (numeroInput < numeroResposta) {
            System.out.println("Tente um número mais alto: ");
        }
        }
        System.out.println("Numero Correto!");
    }
}
