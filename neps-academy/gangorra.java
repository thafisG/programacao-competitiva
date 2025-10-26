import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine();
        
        String[] palavras = linha.split(" ");

        int p1 = Integer.parseInt(palavras[0]);  
        int c1 = Integer.parseInt(palavras[1]);  
        int p2 = Integer.parseInt(palavras[2]);  
        int c2 = Integer.parseInt(palavras[3]); 

        if (p1 * c1 == p2 * c2) {
            System.out.println("0");
        } else if (p1 * c1 > p2 * c2) {
            System.out.println("-1");
        } else {
            System.out.println("1");
        }
        
        scanner.close();
    }
}
