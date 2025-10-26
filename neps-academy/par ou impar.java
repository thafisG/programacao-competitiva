import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bino = scanner.nextInt();
        int cino = scanner.nextInt();

        int soma = bino + cino;

        if (soma % 2 == 0) {
            System.out.println("Bino");
        } else {
            System.out.println("Cino");
        }
        
        scanner.close();
    }
}
