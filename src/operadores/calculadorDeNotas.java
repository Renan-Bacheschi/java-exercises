package operadores;
import java.util.Scanner;

public class calculadorDeNotas {
    public static void main(String[] args) {
      Scanner  scanner = new Scanner(System.in);

      int nota = 1;
      double soma = 0.0;

      while (true) {
          System.out.println("Digite sua nota: " + nota +  " :");

          String line = scanner.nextLine();

          if (line.isBlank()) {
              nota--;
              break;
          }
          soma += Double.parseDouble(line);
          nota++;
      }
double avg = soma / nota;
        System.out.println(nota + "Nota fornecida(s)");
        System.out.println("A media é: " + avg );

        scanner.close();

    }

}
