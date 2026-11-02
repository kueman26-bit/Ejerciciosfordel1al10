import java.util.Scanner;

public class RegistroEdades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;
        int mayor = 0, menor = 150;
        int mayores = 0, menores = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Ingrese la edad de la persona " + i + ": ");
            edad = entrada.nextInt();

            if (edad > mayor) {
                mayor = edad;
            }

            if (edad < menor) {
                menor = edad;
            }

            if (edad >= 18) {
                mayores++;
            } else {
                menores++;
            }
        }

        System.out.println("Edad mayor: " + mayor);
        System.out.println("Edad menor: " + menor);
        System.out.println("Mayores de edad: " + mayores);
        System.out.println("Menores de edad: " + menores);
    }
}