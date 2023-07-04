
public class AprendizMoto{
    private final  String cedula;
    private String nombre;
    private String tipoLicencia;
    private double notaTeoria;
    private double notaCircuito;
    
    public String getCedula(){
        return cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getTipoLicencia(){
        return tipoLicencia;
    }
    public void setTipoLicencia(String tipoLicencia){
        if(tipoLicencia != null) this.tipoLicencia = tipoLicencia;
        else this.tipoLicencia = "";
    }
    
    public double getNotaTeoria(){
        return notaTeoria;
    }
    public void setNotaTeoria(double notaTeoria){
        if(notaTeoria >= 0) this.notaTeoria = notaTeoria;
        else this.notaTeoria = 0;
    }
    
    public double getNotaCircuito(){
        return notaCircuito;
    }
    public void setNotaCircuito(double notaCircuito){
        if(notaCircuito >= 0) this.notaCircuito = notaCircuito;
        else this.notaCircuito = 0;
    }
    
    AprendizMoto(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito){
        if(cedula != null) this.cedula = cedula;
        else this.cedula = "";
        setNombre(nombre);
        setTipoLicencia(tipoLicencia);
        setNotaTeoria(notaTeoria * 0.4);
        setNotaCircuito(notaCircuito * 0.6);
    }
    
    double calcularPromedio(){
        return (notaTeoria + notaCircuito) / 2;
    }
}