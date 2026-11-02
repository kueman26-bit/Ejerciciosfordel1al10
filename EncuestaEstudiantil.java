import java.util.Scanner;

public class EncuestaEstudiantil {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        int excelente = 0, bueno = 0;
        int regular = 0, malo = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.println("\nEncuesta del estudiante " + i);
            System.out.println("1 = Excelente");
            System.out.println("2 = Bueno");
            System.out.println("3 = Regular");
            System.out.println("4 = Malo");

            System.out.print("Ingrese su opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    excelente++;
                    break;

                case 2:
                    bueno++;
                    break;

                case 3:
                    regular++;
                    break;

                case 4:
                    malo++;
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    i--;
                    break;
            }
        }

        System.out.println("\nRESULTADOS DE LA ENCUESTA");
        System.out.println("Excelente: " + excelente);
        System.out.println("Bueno: " + bueno);
        System.out.println("Regular: " + regular);
        System.out.println("Malo: " + malo);

        int mayor = excelente;
        String opcionMayor = "Excelente";

        if (bueno > mayor) {
            mayor = bueno;
            opcionMayor = "Bueno";
        }

        if (regular > mayor) {
            mayor = regular;
            opcionMayor = "Regular";
        }

        if (malo > mayor) {
            mayor = malo;
            opcionMayor = "Malo";
        }

        System.out.println("Opcion mas votada: " + opcionMayor);
    }
}