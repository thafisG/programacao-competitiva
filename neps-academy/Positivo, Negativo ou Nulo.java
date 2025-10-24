import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        if (X < 0){
            System.out.println("negativo");
        } else if (X == 0){
            System.out.println("nulo");
        } else {
            System.out.println("positivo");
        }

        scanner.close();
    }
}
