package patronesdisenosegundoparcial.ejercicio3Strategy;

import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.addCelular(new Celular("pato","new","new",180)).addCelular(new Celular("oso","new","new",180))
        .addCelular(new Celular("perro","new","new",160)).addCelular(new Celular("gato","new","new",150))
        .addCelular(new Celular("aguila","new","new",160)).addCelular(new Celular("ganso","new","new",150));

        if(tienda.numeroCelulares()<=6){
            tienda.setBuscador(new Pocos());
            System.out.println("------------------------------------------------------------BUSCADOR POCOS--------------------------------------------------------");
        }else{
            tienda.setBuscador(new Muchos());
            System.out.println("------------------------------------------------------------BUSCADOR MUCHOS--------------------------------------------------------");
        }

        System.out.println("--------------------POR MODELO---------------");
        tienda.buscar("pato").show();

        System.out.println("--------------------POR PRECIO---------------");
        //muestra todos los celulares con un precio menor o igual al que se está buscando
        tienda.buscar(160).stream().forEach(a->a.show());

        System.out.println("--------------------POR MODELO Y PRECIO---------------");
        tienda.buscar(160, "perro").stream().forEach(a->a.show());

        tienda.addCelular(new Celular("pato2","new","new",180)).addCelular(new Celular("oso2","new","new",180))
        .addCelular(new Celular("perro2","new","new",160)).addCelular(new Celular("gato2","new","new",150))
        .addCelular(new Celular("aguila2","new","new",160)).addCelular(new Celular("ganso2","new","new",150));

        if(tienda.numeroCelulares()<=6){
            tienda.setBuscador(new Pocos());
            System.out.println("------------------------------------------------------------BUSCADOR POCOS--------------------------------------------------------");
        }else{
            tienda.setBuscador(new Muchos());
            System.out.println("------------------------------------------------------------BUSCADOR MUCHOS--------------------------------------------------------");
        }

        System.out.println("--------------------POR MODELO---------------");
        tienda.buscar("pato").show();

        System.out.println("--------------------POR PRECIO---------------");
        //muestra todos los celulares con un precio menor o igual al que se está buscando
        tienda.buscar(160).stream().forEach(a->a.show());

        System.out.println("--------------------POR MODELO Y PRECIO---------------");
        tienda.buscar(160, "perro").stream().forEach(a->a.show());

    }
}
