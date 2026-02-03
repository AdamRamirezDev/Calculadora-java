package Persona;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int Edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = Edad;
    }

    public void getNombre(){
        System.out.println("Este es el nombre: " + this.nombre + " " + this.apellido);
    }

    public void getEdad(){
        System.out.println("Esta es la edad: " + this.edad);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }





}
