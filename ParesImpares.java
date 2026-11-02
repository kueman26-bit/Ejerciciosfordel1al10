import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int pares = 0, impares = 0, sumaPares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
                sumaPares += numero;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Suma de pares: " + sumaPares);
    }
}