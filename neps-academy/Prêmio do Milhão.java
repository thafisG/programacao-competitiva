import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numLinhas = scanner.nextInt();
        
        int soma = 0;
        int dias = 0;
        
        for (int i = 0; i < numLinhas; i++) {
            int acessos = scanner.nextInt();
            soma += acessos;
            dias++;
            if (soma >= 1000000) break;
        }
        
        System.out.println(dias);
        scanner.close();
    }
}
