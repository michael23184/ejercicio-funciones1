import java.util.Scanner;

public class PromedioNotas {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double n3 = sc.nextDouble();

        double promedio = calcularPromedio(n1, n2, n3);

        System.out.println("El promedio es: " + promedio);

        if (promedio >= 7) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
    }
}
