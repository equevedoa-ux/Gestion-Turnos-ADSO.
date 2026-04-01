import java.util.Scanner;

/**
 * Proyecto: Gestión de turnos y trámites presenciales al ciudadano
 * Evidencia: GA7-220501096-AA3-EV01
 * Programador: Edinson Quevedo
 */
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // 1. Entrada de datos del ciudadano
        System.out.println("--- SISTEMA DE GESTIÓN DE TURNOS ---");
        System.out.print("Ingrese nombre del ciudadano: ");
        String nombre = lector.nextLine();

        System.out.print("Ingrese número de cédula: ");
        String cedula = lector.nextLine();

        System.out.print("Ingrese el trámite (Ej: Sisben, Hacienda): ");
        String tramite = lector.nextLine();

        // 2. Lógica: Generar un código de turno aleatorio
        int numeroAleatorio = (int)(Math.random() * 100 + 1);
        String codigoTurno = tramite.substring(0, 1).toUpperCase() + "-" + numeroAleatorio;

        // 3. Salida de información (Resultado del módulo)
        System.out.println("\n------------------------------------");
        System.out.println("¡TURNO GENERADO EXITOSAMENTE!");
        System.out.println("Ciudadano: " + nombre);
        System.out.println("Documento: " + cedula);
        System.out.println("Trámite: " + tramite);
        System.out.println("SU TURNO ES: " + codigoTurno);
        System.out.println("------------------------------------");
    }
}