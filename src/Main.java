import java.util.Scanner;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Kenet Ortiz","Anestesista");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Sergio Castillo", "castilloser@gmail.com");

        patient.setWeight(54.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());
    }
}