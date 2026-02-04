public interface Traductor {
    //public y abstract
    void traducir();

    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a ingles");
    }
}
class Frances implements Traductor{
    public void traducir(){
        System.out.println("Traduzco a frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en frances");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();

        Traductor frances = new Frances();
        frances.traducir();
        frances.iniciarTraductor();
    }
}

