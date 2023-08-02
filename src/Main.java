import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(myDoctor);

        User userDoc = new Doctor("Kenet", "kenet@gmail.com");
        userDoc.showDataUser();

        User userPat = new Patient("Arnulfo", "arnulfo@gmail.com");
        userPat.showDataUser();

        User user1 = new User("Kenet", "kenet@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("\nDoctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatria");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
        

        /*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/
        /*
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        System.out.println(patient);*/
    }
}