import java.util.Scanner;

public class SistemaEmpleados {

    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("Cual es tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Cual es tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("Cual es tu salario: ");
        var salario = Double.parseDouble(consola.nextLine());
        System.out.println("Eres jefe de area ? ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi edad es: " + edad);
        System.out.println("Mi salario es:" + salario);
        System.out.println("Soy jefe de area: " + esJefe);


    }

}
