import java.util.Random;
import java.util.Scanner;

public class GeneradorDeID {

    public static void main(String[] args) {

        Random random = new Random();
        int numeroAleatorio = random.nextInt(10000);
        String numero = String.valueOf(numeroAleatorio);

        while(numero.length() < 4) {
            numero = "0" + numero;
        }

        var scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre: ");
        var nombre = scanner.nextLine();
        System.out.println("Cual es tu apellido: ");
        var apellido = scanner.nextLine();
        System.out.println("Cual es tu fecha de nacimiento: ");
        var fechaNacimiento = scanner.nextLine();

        var idNombre = nombre.substring(0, 2).toUpperCase();
        var idApellido = apellido.substring(0, 2).toUpperCase();
        String idNacimiento = fechaNacimiento.substring(2, 4);

        var ID = new StringBuilder();
        ID.append(idNombre).append(idApellido).append(idNacimiento).append(numero);

        System.out.println("Tu ID es: " + ID);


    }
}
