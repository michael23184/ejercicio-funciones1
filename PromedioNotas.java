
import java.util.Scanner;

public class PromedioNotas {

    // Función para calcular promedio
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // Función para validar notas
    public static double pedirNota(Scanner sc, String mensaje) {
        double nota;
        
        while (true) {
            System.out.print(mensaje);
            
            if (sc.hasNextDouble()) {
                nota = sc.nextDouble();
                
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    System.out.println("Error: la nota debe estar entre 0 y 10.");
                }
            } else {
                System.out.println("Error: ingrese un número válido.");
                sc.next(); // limpiar entrada incorrecta
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = pedirNota(sc, "Ingrese la nota 1: ");
        double nota2 = pedirNota(sc, "Ingrese la nota 2: ");
        double nota3 = pedirNota(sc, "Ingrese la nota 3: ");

        double promedio = calcularPromedio(nota1, nota2, nota3);

        System.out.println("El promedio es: " + promedio);

        // Evaluar si aprueba o reprueba
        if (promedio >= 7) {
            System.out.println("Estado: APROBADO ✅");
        } else {
            System.out.println("Estado: REPROBADO ❌");
        }
    }
}