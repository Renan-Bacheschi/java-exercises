import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numeroUsuario = scanner.nextDouble();

        if (numeroUsuario > 0) {
            System.out.println("Seu Numero é Positivo! " + numeroUsuario);
        } else if (numeroUsuario < 0) {
            System.out.println("Numero negativo! ");
        } else System.out.println("Numero igual a zero! ");

        if (numeroUsuario > 10) {
            System.out.println("Numero maior que 10! ");
        } else System.out.println("Numero menor que 10! ");


        scanner.close();
    }
}