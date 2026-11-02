import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, suma = 0;

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= 15; i++) {
            int resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);

            suma += resultado;
        }

        System.out.println("Suma total = " + suma);
    }
}