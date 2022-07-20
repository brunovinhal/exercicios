public class Temperatura {

    public static void main(String[] args) {
        // (°F - 32) * 5/9 = °c
        final double FATOR = 5.0 /9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double celcios = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celcios +"°C.");

        fahrenheit = 150;
        celcios = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celcios +"°C.");

    }
}
