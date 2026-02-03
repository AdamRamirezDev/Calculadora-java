package Persona;

public class pruebaPersona {

    public static void main(String[] args) {

        var Adam = new Persona("Adam", "Ramirez", 23);
        Adam.getNombre();
        Adam.getEdad();
        Adam.setNombre("Zoe");
        Adam.getNombre();
    }
}
