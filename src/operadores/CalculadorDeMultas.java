package operadores;

public class CalculadorDeMultas {
    public static void main(String[] args) {
        int veloCarro = 147;
        int limiteComTolerancia = 107;
        int calculador = (veloCarro - limiteComTolerancia) * 10;

        if (veloCarro > limiteComTolerancia) {
            System.out.println("Voce ultrapassou a velocidade maxima! \nCada Km/h acima do permitido São R$ 10,00");
            System.out.println("Valor da Multa: R$ " + calculador);
        } else System.out.println("Transitou na velocidade permitida! ");
    }
}
