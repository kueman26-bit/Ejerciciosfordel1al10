import java.util.Scanner;

public class SumaConsecutivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n, suma = 0;

        System.out.print("Ingrese un numero entero positivo: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los numeros es: " + suma);
    }
}