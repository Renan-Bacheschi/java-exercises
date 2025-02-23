import java.util.Scanner;

public class parOuimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero escolhido é par " + numero  );

        } else {
            System.out.println("numero é impar " + numero );
        }

        scanner.close();
    }
}