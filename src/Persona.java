public class Persona {

    String nombre;
    String apellido;

    void mostrarPersona(){
        var variableLocal = "valor1";
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
    }

    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos");
        var objeto1 = new Persona();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona();

        var objeto2 = new Persona();
        objeto2.nombre = "Ian";
        objeto2.apellido = "Gomez";
        objeto2.mostrarPersona();
    }



}

