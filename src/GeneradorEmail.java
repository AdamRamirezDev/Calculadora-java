public class GeneradorEmail {

    public static void main(String[] args) {

        String nombre = "Adam Samuel Ramirez";
        String empresa = "Revature";
        String dominio = "com.mx";

        String nameEmail = nombre.toLowerCase().replace(" ", ".");
        var builder = new StringBuilder();
        builder.append(nameEmail).append("@").append(empresa).append(dominio);

        System.out.println(builder);

    }

}
