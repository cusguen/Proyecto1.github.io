
public class Aprendiz
{
    //atributos caracteristicas e la clase
    String nombre;
    String cedula;
    String tipoLicencia;
    double notaTeoria;
    double notaCircuito;
    double notaCarretera;
    
    
    Aprendiz(String cedula, String nombre,String tipoLicencia,double notaTeoria,double notaCircuito ,double notaCarretera){
        this.nombre = nombre;//definiendo parametros,asemos una asignacion a los atributos con this.
        this.cedula = cedula;//metodo constructor 
        this.tipoLicencia = tipoLicencia;//this, operacion de asigancion
        this.notaTeoria = notaTeoria * 0.2;
        this.notaCircuito = notaCircuito * 0.3;
        this.notaCarretera = notaCarretera * 0.5;
        
    }
    double calcularPromedio(){
        return (notaTeoria + notaCircuito + notaCarretera)/3;
    }
    

}