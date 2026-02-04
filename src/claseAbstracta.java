public class claseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

//Clase abstracta
abstract class FiguraGeometrica{
    public abstract void dibujar();
}
class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibujar un rectangulo");
    }
}

class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se debe dibujar un Circulo");
    }
}
