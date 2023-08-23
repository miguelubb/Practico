public class Persona {
    private String primerNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int añoNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;

    public Persona(String primerNombre, String apellidoPaterno, String apellidoMaterno, int añoNacimiento, int mesNacimiento, int diaNacimiento) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.añoNacimiento = añoNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
    }

    public String getNombre(){
        return   formatoNombre(primerNombre)+" "
                +formatoNombre(apellidoPaterno)+" "
                +formatoNombre(apellidoMaterno);
    }

    private String formatoNombre(String s){
        return s.toUpperCase().charAt(0)+s.toLowerCase().substring(1);
    }

    public String getFechaNacimiento(){
        return diaNacimiento+"/"+mesNacimiento+"/"+añoNacimiento;
    }

    public int CalculaEdad(int dia, int mes, int año){
        if(añoNacimiento==año){
            return 0;
        }else if(mesNacimiento < mes ||
                (mesNacimiento==mes && diaNacimiento<=dia)){
            //ya fue su cumpleaños
            return año-añoNacimiento;
        }else{
            //no ha sido su cumpleaños
            return año-añoNacimiento-1;
        }
    }

    public String toString(){
        return getNombre()+";"+getFechaNacimiento();
    }

    public boolean equals(Persona otro){
        return otro.toString().equals(this.toString());
    }

}
