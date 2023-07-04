
public class Aprendiz
{
    private String cedula;
    private String nombre;
    private String tipoLicencia;
    private double notaTeoria;
    private double notaCircuito;
    private double notaCarretera;
    
    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula){
        if(cedula != null)this.cedula = cedula;
        else this.cedula = "";
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
    public void setTipoLicencia(String tipoLcicencia){
        if(tipoLcicencia != null) this.tipoLicencia = tipoLicencia;
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
    
    public double getNotaCarretera(){
        return notaCarretera;
    }
    public void setNotaCarretera(double notaCarretera){
        if(notaCarretera >= 0) this.notaCarretera = notaCarretera;
        else this.notaCarretera = 0;
    }
    
    Aprendiz(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera){
        setCedula(cedula);    
        setNombre(nombre);
        setTipoLicencia(tipoLicencia);
        setNotaTeoria(notaTeoria);
        setNotaCircuito(notaCircuito);
        setNotaCarretera(notaCarretera);
    }
    
    double calcularPromedio(){
        return (notaTeoria + notaCircuito + notaCarretera) / 3;
    }
}