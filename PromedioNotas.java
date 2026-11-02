import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota, suma = 0;
        double mayor = 0, menor = 20;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del estudiante " + i + ": ");
            nota = entrada.nextDouble();

            suma += nota;

            if (nota > mayor) {
                mayor = nota;
            }

            if (nota < menor) {
                menor = nota;
            }
        }

        double promedio = suma / 10;

        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor nota: " + mayor);
        System.out.println("Menor nota: " + menor);
    }
}