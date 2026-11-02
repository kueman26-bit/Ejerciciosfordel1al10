import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.print("Ingrese un numero entero positivo: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println(numero + "! = " + factorial);
    }
}