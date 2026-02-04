package SistemaDeVentas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("***Sistema de ventans***");
        var producto1 = new Producto("Camisa", 30);
        System.out.println(producto1);
        var producto2 = new Producto("Tennis", 60);

        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        var orden2 = new Orden();
        orden2.agregarProducto(producto2);
    }
}
