package ui;

import javax.script.ScriptContext;
import java.util.Scanner;

public class UIMenu {

    public static String[] MONTHS = {"Enero","Febrero","Marzo",
            "Abril","Mayo","Junio","Julio","Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu() {
        System.out.println("Bienvenido a mi sistema de citas medicas");
        System.out.println("Selecciona una opcion");

        int respuesta = 0;

        do{
            System.out.println("1. Doctor\n2. Paciente\n0. Salir");
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 0:
                    System.out.println("\nGracias por tu visita");
                    break;
                case 1:
                    System.out.println("Doctor");
                    respuesta = 0;
                    break;
                case 2:
                    showPatientMenu();
                    //Aca había un error, cada vez que el programa ejecutaba el metodo anterior, la variable respuesta
                    //conservava su valor en respuesta = 2, por lo que se repetia nuevamente el bucle, pero al cambiar
                    //el valor de la variable respuesta = 0, ya queda solucionado.
                    respuesta = 0;
                    break;
                default:
                    System.out.println("\nPor favor selecciona una respuesta correcta");
                    break;
            }

        }while (respuesta != 0);
    }

    public static void showPatientMenu() {
        int salirMenu = 0;

        do{
            System.out.println("\nPaciente");
            System.out.println("1. Reservar una cita");
            System.out.println("2. Mis citas");
            System.out.println("0. Regresar al Menu anterior");

            Scanner sc = new Scanner(System.in);
            salirMenu = Integer.valueOf(sc.nextLine());

            switch (salirMenu){
                case 0:
                showMenu();
                break;
                case 1:
                    System.out.println(":: Cita reservada");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i+1) + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println(":: Mis citas");
                    break;
                default:
                    System.out.println("\nPor favor selecciona una respuesta correcta");
                    break;
            }

        }while (salirMenu != 0);
    }
}
