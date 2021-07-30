package playercar;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PlayerCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroJugadores = 0;
        String nombre;
        ArrayList<String> nomConductor = new ArrayList();

        System.out.println("Ingrese número de jugadores: ");
        numeroJugadores = sc.nextInt();

        for (int i = 0; i < numeroJugadores; i++) {
            System.out.print("Ingrese nombre de jugador" + (i + 1) + ":");
            nombre = sc.next();
            nomConductor.add(nombre);
        }//fin for
        
        /*marcas de vehiculos*/
        String marca1 = "BMW";
        String marca2 = "Mercedes-Benz";
        String marca3 = "Renault";

        /*ArrayList para guardar las marcas de vehiculos*/
        ArrayList<String> vehiculo = new ArrayList();
        int opcion = 1;
        String opcCarac;

        for (int i = 0; i < numeroJugadores; i++) {

            System.out.println("\nMarcas de coches disponible");
            System.out.println("1: " + marca1 + "\n" + "2: " + marca2 + "\n" + "3: " + marca3);
            System.out.println(" Escoja una opcion Jugador " + nomConductor.get(i));
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            opcCarac = String.valueOf(opcion);
            vehiculo.add(opcCarac);
            if (opcion > 3) {
                System.out.println("Error has selecciona la opcion incorrecta");
            }

        }

    }//fin main

   

}
