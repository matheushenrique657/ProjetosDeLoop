import java.util.Scanner;

public class validarSenha {
    public static void main(String[] args) {
        String senhaDigitada;
     Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = entrada.nextLine();
        } while (!senhaDigitada.equals("Java21"));
        System.out.println("Acesso Permitido!");
    }
}
