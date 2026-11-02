import java.util.Scanner;

public class VentasSemanales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double venta, total = 0;
        double mayorVenta = 0;
        int diaMayor = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese la venta del dia " + i + ": S/ ");
            venta = entrada.nextDouble();

            total += venta;

            if (venta > mayorVenta || i == 1) {
                mayorVenta = venta;
                diaMayor = i;
            }
        }

        double promedio = total / 7;

        System.out.println("Venta total: S/ " + total);
        System.out.printf("Promedio: S/ %.2f%n", promedio);
        System.out.println("Mayor venta: Dia " + diaMayor);
    }
}