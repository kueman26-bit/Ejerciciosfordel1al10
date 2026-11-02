import java.util.Scanner;

public class AnalisisSalarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sueldo, total = 0;
        double mayor = 0, menor = 0;
        int trabajadores = 0;

        for (int i = 1; i <= 25; i++) {
            System.out.print("Ingrese el sueldo del trabajador " + i + ": S/ ");
            sueldo = entrada.nextDouble();

            total += sueldo;

            if (i == 1) {
                mayor = sueldo;
                menor = sueldo;
            }

            if (sueldo > mayor) {
                mayor = sueldo;
            }

            if (sueldo < menor) {
                menor = sueldo;
            }

            if (sueldo > 2500) {
                trabajadores++;
            }
        }

        double promedio = total / 25;

        System.out.println("\nANALISIS DE SALARIOS");
        System.out.println("Planilla total: S/ " + total);
        System.out.printf("Promedio: S/ %.2f%n", promedio);
        System.out.println("Mayor sueldo: S/ " + mayor);
        System.out.println("Menor sueldo: S/ " + menor);
        System.out.println("Trabajadores con sueldo > S/2500: " + trabajadores);
    }
}