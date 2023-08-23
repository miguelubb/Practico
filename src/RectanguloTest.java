import java.util.Scanner;

public class RectanguloTest {
    public static void main(String[] args) {
        //CASO 1
        System.out.println("Rectángulo de 3x4");
        Rectangulo r=new Rectangulo(3,4 );
        desplegar(r);
        //CASO 2
        System.out.println("Aumentando el ancho a 6");
        r.setAncho(6);
        desplegar(r);
        //CASO 3
        System.out.println("cambiando el ancho a 3");
        r.setAncho(3);
        desplegar(r);
    }

    private static void desplegar(Rectangulo r){
        System.out.println("Perimetro: "+ r.perimetro());
        System.out.println("Area: "+r.area());
        System.out.println("Diagonal: "+r.diagonal());
    }
}
