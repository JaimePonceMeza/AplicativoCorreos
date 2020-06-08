package aplicativocorreos;

import java.util.Scanner;

/**
 *
 * @author jaimeponcemeza
 */
public class AplicativoCorreos {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int contador = 0;
        Correos vocalA = new Correos("A", 0);
        Correos vocalB = new Correos("B", 0);
        Correos vocalC = new Correos("C", 0);
        Correos vocalD = new Correos("D", 0);
        String opcion = "";
        String rut;
        boolean repetir = true;
        //MENU DE OPCIONES
        do {
            System.out.print("INGRESE SU RUT (sin puntos y con guión):\n");
            rut = lector.nextLine();
        } while (rut.length() < 10);
//        System.out.close();

        do {
            System.out.println("\n****MENÚ DE CORREOS****\n"
                    + "[E] Enviar documento\n"
                    + "[R] Recibir documento\n"
                    + "[C] Enviar encomienda\n"
                    + "[M] Recibir encomienda\n"
                    + "[N] Enviar dinero\n"
                    + "[I] Recibir dinero\n"
                    + "[X] Salir\n");
            System.out.print("Seleccione una opción : ");
            opcion = lector.next();
            switch (opcion) {
                case "E":
                    System.out.println("Su boleto de atención es: " + vocalA.getLetra() + vocalA.aumentarNumero(0));
                    System.out.println("Número es:" + vocalA.getNumero());
                    break;
                case "R":
                    System.out.println("Su boleto de atención es: " + vocalA.getLetra() + vocalA.aumentarNumero(0));
                    System.out.println("Número es:" + vocalA.getNumero());
                    break;

                case "C":
                    System.out.println("Su boleto de atención es: " + vocalA.getLetra() + vocalA.aumentarNumero(0));
                    System.out.println("Número es:" + vocalA.getNumero());
                    break;
                    
                case "M":
                    System.out.println("Su boleto de atención es: " + vocalA.getLetra() + vocalA.aumentarNumero(0));
                    System.out.println("Número es:" + vocalA.getNumero());
                    break;
                    
                case "X":
                    repetir = false;
                    break;
            }
        } while (vocalA.getNumero() <= 9);

        do {
            System.out.println("\nMENÚ DE CORREOS\n"
                    + "[E] Enviar documento\n"
                    + "[R] Recibir documento\n"
                    + "[C] Enviar encomienda\n"
                    + "[M] Recibir encomienda\n"
                    + "[N] Enviar dinero\n"
                    + "[I] Recibir dinero\n"
                    + "[X] Salir\n");
            System.out.print("Seleccione una opción : ");
            opcion = lector.next();
            switch (opcion) {
                case "E":
                    System.out.println("Su boleto de atención es: " + vocalB.getLetra() + vocalB.aumentarNumero(0));
                    System.out.println("Número es:" + vocalB.getNumero());
                    break;
                case "R":
                    System.out.println("Su boleto de atención es: " + vocalB.getLetra() + vocalB.aumentarNumero(0));
                    System.out.println("Número es:" + vocalB.getNumero());
                    break;
                case "C":
                    System.out.println("Su boleto de atención es: " + vocalB.getLetra() + vocalB.aumentarNumero(0));
                    System.out.println("Número es:" + vocalB.getNumero());
                    break;
                case "M":
                    System.out.println("Su boleto de atención es: " + vocalB.getLetra() + vocalB.aumentarNumero(0));
                    System.out.println("Número es:" + vocalB.getNumero());
                    break;
                case "X":
                    repetir = false;
                    break;
            }
        } while (vocalB.getNumero() <= 9);
        do {
            System.out.println("\nMENÚ DE CORREOS\n"
                    + "[E] Enviar documento\n"
                    + "[R] Recibir documento\n"
                    + "[C] Enviar encomienda\n"
                    + "[M] Recibir encomienda\n"
                    + "[N] Enviar dinero\n"
                    + "[I] Recibir dinero\n"
                    + "[X] Salir\n");
            System.out.print("Seleccione una opción : ");
            opcion = lector.next();
            switch (opcion) {
                case "E":
                    System.out.println("Su boleto de atención es: " + vocalC.getLetra() + vocalC.aumentarNumero(0));
                    System.out.println("Número es:" + vocalC.getNumero());
                    break;
                case "R":
                    System.out.println("Su boleto de atención es: " + vocalC.getLetra() + vocalC.aumentarNumero(0));
                    System.out.println("Número es:" + vocalC.getNumero());
                    break;
                case "C":
                    System.out.println("Su boleto de atención es: " + vocalC.getLetra() + vocalC.aumentarNumero(0));
                    System.out.println("Número es:" + vocalC.getNumero());
                    break;
                case "M":
                    System.out.println("Su boleto de atención es: " + vocalC.getLetra() + vocalC.aumentarNumero(0));
                    System.out.println("Número es:" + vocalC.getNumero());
                    break;
                case "X":
                    repetir = false;
                    break;
            }
        } while (vocalC.getNumero() <= 9);
        do {
            System.out.println("\nMENÚ DE CORREOS\n"
                    + "[E] Enviar documento\n"
                    + "[R] Recibir documento\n"
                    + "[C] Enviar encomienda\n"
                    + "[M] Recibir encomienda\n"
                    + "[N] Enviar dinero\n"
                    + "[I] Recibir dinero\n"
                    + "[X] Salir\n");
            System.out.print("Seleccione una opción : ");
            opcion = lector.next();
            switch (opcion) {
                case "E":
                    System.out.println("Su boleto de atención es: " + vocalD.getLetra() + vocalD.aumentarNumero(0));
                    System.out.println("Número es:" + vocalD.getNumero());
                    break;
                case "R":
                    System.out.println("Su boleto de atención es: " + vocalD.getLetra() + vocalD.aumentarNumero(0));
                    System.out.println("Número es:" + vocalD.getNumero());
                    break;
                case "C":
                    System.out.println("Su boleto de atención es: " + vocalD.getLetra() + vocalD.aumentarNumero(0));
                    System.out.println("Número es:" + vocalD.getNumero());
                    break;
                case "M":
                    System.out.println("Su boleto de atención es: " + vocalD.getLetra() + vocalD.aumentarNumero(0));
                    System.out.println("Número es:" + vocalD.getNumero());
                    break;
                case "X":
                    repetir = false;
                    break;
            }
        } while (vocalD.getNumero() <= 9);
    }
}

//        System.out.close();
// TODO code application logic here

