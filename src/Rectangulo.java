public class Rectangulo {
    //atributos
    private int ancho;
    private int largo;

    //métodos
    public Rectangulo(int ancho, int largo){
        this.ancho=ancho;
        this.largo=largo;
    }

    public void setAncho(int ancho){
        this.ancho=ancho;
    }

    public void setLargo(int largo){
        this.largo=largo;
    }

    public int area(){
        return ancho*largo;
    }

    public int perimetro(){
        return 2*(largo+ancho);
    }

    public float diagonal(){
        return (float)Math.sqrt((largo*largo)+Math.pow(ancho,2));
    }
}
