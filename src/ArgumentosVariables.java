public class ArgumentosVariables{
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4,5);
        variosparametros("Karla", 10, 20, 30);
    }

    private static void variosparametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros){
        for(var i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + " ");


        }
    }
}
