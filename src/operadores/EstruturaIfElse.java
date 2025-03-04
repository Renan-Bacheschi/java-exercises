package operadores;

public class EstruturaIfElse {
    public static void main(String[] args) {
        int hora = 00;

        if (hora >= 0 && hora <= 12) {
            System.out.println("Bom dia! ");

        } else if (hora >= 13 && hora <= 18) {
            System.out.println("Boa Tarde! ");

        } else if (hora >= 19 && hora <= 23) {
            System.out.println("Boa Noite! ");
        }
    }
}