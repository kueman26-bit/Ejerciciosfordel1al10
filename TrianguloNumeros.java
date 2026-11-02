import java.util.Scanner;

public class TrianguloNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.print("Ingrese un numero N: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}