public class Doctor {
    static int id = 0 ; //Autoincrement
    String name;
    String email;
    String speciality;

    Doctor(){
        this.name = "Nombre por defecto";
        this.speciality = "Especialidad por defecto";
    }

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
