public class Animal {

    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }

    protected void dormir(){
        System.out.println("Duermo muchas horas al dia");
    }
}

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

    @Override
    public void dormir(){
        System.out.println("Duermo muchas horas");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {

        System.out.println("Ejemplo de herencia");
        var animal1 = new Animal();
        var perro1 = new Perro();
    }
}



