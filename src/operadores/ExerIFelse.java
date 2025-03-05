package operadores;

public class ExerIFelse {
    public static void main(String[] args) {
        int x = 11;

        if (x % 2 == 0){
            System.out.println("Seu numero é par: " + x + "\nCom mais 5 fica: " + (x + 5));
        } else System.out.println("Seu numero é impar: " + x + "\nMultiplicado por 2 fica: "+ (x * 2));
    }

}