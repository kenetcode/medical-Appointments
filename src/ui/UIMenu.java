package ui;

import java.util.Scanner;

public class UIMenu {
    public static void showMenu() {
        System.out.println("Bienvenido a mi sistema de citas medicas");
        System.out.println("Selecciona una opcion");

        int respuesta = 0;

        do{
            System.out.println("1. Doctor/n2. Paciente/n0. Salir");
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    //Implementar el metodo del menu del paciente
                    break;
                case 0:
                    System.out.println("Gracias por tu visita");
                    break;
                default:
                    System.out.println("Por favor selecciona una respuesta correcta");
            }

        }while (respuesta != 0);


    }
}
