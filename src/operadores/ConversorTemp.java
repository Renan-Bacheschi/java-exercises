package operadores;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversorTemp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em ºF: ");
        double Fahrenheit = scanner.nextDouble();

        double conversor = (Fahrenheit - 32) / 1.8;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("A temperatura em Celsius é: " + df.format(conversor));

        scanner.close();
    }
}