import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float raio = sc.nextFloat();
        float area = 3.1416f * (raio * raio);
        System.out.printf("%.2f%n", area);
    }
}
