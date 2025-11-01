import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int coposQuebrados = 0;
        
        for (int i = 0; i < N; i++) {
            int L = scanner.nextInt();
            int C = scanner.nextInt(); 
            
            if (L > C) {
                coposQuebrados += C;
            }
        }
        
        System.out.println(coposQuebrados);
        
        scanner.close();
    }
}
