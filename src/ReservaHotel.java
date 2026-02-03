public class ReservaHotel {

    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de hoteles ***");

        //Definimos la variable
        var nombreCliente = "Adam Ramirez";
        var diasEstancia = 7;
        var tarifaDiaria = 1300.00;
        var hasVistaAlMar = true;

        // Mostrar el detalle de la reserva
        System.out.println("client = " + nombreCliente);
        System.out.println("dias = " + diasEstancia);
        System.out.println("tarifa diaria = " + tarifaDiaria);
        System.out.println("tiene vista al mar = " + hasVistaAlMar);

        //Modificamos valores
        diasEstancia = 5;
    }
}
