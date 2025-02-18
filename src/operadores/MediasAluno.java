import java.util.Scanner;

public class MediasAluno {
    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);

        System.out.println("Diga seu nome: ");
        String nome = recebe.nextLine();

        System.out.println("Digite sua primeira nota: ");
        double nota1 = recebe.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = recebe.nextDouble();

        System.out.println("Digite a terceira e última nota: ");
        double nota3 = recebe.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        // Saída formatada corretamente
        System.out.println(nome + " tirou a nota " + String.format("%.2f", media));

        // Fechando o Scanner corretamente
        recebe.close();
    }
}
