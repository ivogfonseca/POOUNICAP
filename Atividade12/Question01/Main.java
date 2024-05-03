package Question01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(3.5);
        Circulo circulo2 = new Circulo(6.2);
        Circulo circulo3 = new Circulo(2.0);
        Circulo circulo4 = new Circulo(5.8);
        Circulo circulo5 = new Circulo(4.3);

        List<Circulo> listaCirculos = new ArrayList<>();
        listaCirculos.add(circulo1);
        listaCirculos.add(circulo2);
        listaCirculos.add(circulo3);
        listaCirculos.add(circulo4);
        listaCirculos.add(circulo5);

        for(int i = 0; i < listaCirculos.size(); i++){
            Circulo circulo = listaCirculos.get(i);
            double area = circulo.calcularArea();
            System.out.println("Area do circulo" + (i + 1) + ":" + area);
        }
    }
}
