import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String linha = scanner.nextLine();
        
        String[] partes = linha.split(" ");
        
        float num1 = Float.parseFloat(partes[0]);
        float num2 = Float.parseFloat(partes[1]);
        
        float resultado = (num1 + num2)/2;
        
        if (resultado >= 7){
            System.out.println("Aprovado");
        } else if (resultado >= 4) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
        
        scanner.close();
    }
}
