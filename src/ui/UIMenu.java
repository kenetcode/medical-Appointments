package ui;

import javax.script.ScriptContext;
import java.util.Scanner;

public class UIMenu {
    public static void showMenu() {
        System.out.println("Bienvenido a mi sistema de citas medicas");
        System.out.println("Selecciona una opcion");

        int respuesta = 0;

        do{
            System.out.println("1. Doctor\n2. Paciente\n0. Salir");
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("\nGracias por tu visita");
                    break;
                default:
                    System.out.println("\nPor favor selecciona una respuesta correcta");
                    break;
            }

        }while (respuesta != 0);
    }

    public static void showPatientMenu() {
        int respuesta = 0;

        do{
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("1. Reservar una cita");
            System.out.println("2. Mis citas");
            System.out.println("0. Regresar al Menu anterior");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    System.out.println(":: Cita reservada");
                    break;
                case 2:
                    System.out.println(":: Mis citas");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("\nPor favor selecciona una respuesta correcta");
                    break;
            }

        }while (respuesta != 0);
    }
}
