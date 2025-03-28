public class contagemFizzBuzz {
    public static void main(String[] args) {
        int contagem;
        for (contagem = 1; contagem <= 50; contagem++) {
            if (contagem % 3 == 0 && contagem % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (contagem % 3 == 0) {
                System.out.println("Fizz");
            } else if (contagem % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(contagem);
            }
        }
    }
}
