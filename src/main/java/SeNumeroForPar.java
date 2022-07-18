public class SeNumeroForPar {

    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        long x = 999999999, y = 0;
        for (int j = 0; j < 10000000; j++) {
            for (int i = 0; y != 1; i++) {
                if (x % 2 == 0) {
                    y = x / 2;
                } else {
                    y = 3 * x + 1;
                }
                System.out.print(y + ", ");
                x = y;
            }
        }
        System.out.println("\nPrimeiro metodo concluido em " + (System.currentTimeMillis() - tempoInicial));
        tempoInicial = System.currentTimeMillis();
        long a = 999999999, b = 0;
        for (int i = 0; i < 10000000; i++) {
            while (b != 1) {
                if (a % 2 == 0) {
                    b = a / 2;
                } else {
                    b = 3 * a + 1;
                }
                System.out.print(b + ", ");
                a = b;
            }
        }
    }
}