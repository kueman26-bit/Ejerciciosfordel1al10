import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n, suma = 0;

        System.out.print("Ingrese un numero N: ");
        n = entrada.nextInt();

        System.out.println("Serie numerica:");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            suma = suma + i;
        }

        System.out.println();
        System.out.println("Cantidad: " + n);
        System.out.println("Suma: " + suma);
    }
}