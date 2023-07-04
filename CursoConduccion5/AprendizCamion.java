
public class AprendizCamion{
    private final  String cedula;
    private String nombre;
    private String tipoLicencia;
    private double notaTeoria;
    private double notaCircuito;
    private double notaCarretera;
    private double notaParqueo;
    
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
    public double getNotaCarretera(){
        return notaCarretera;
    }
    public void setNotaCarretera(double notaCarretera){
        if(notaCarretera >= 0) this.notaCarretera = notaCarretera;
        else this.notaCarretera = 0;
    }
    public double getNotaParqueo(){
        return notaParqueo;
    }
    public void setNotaParqueo(double notaParqueo){
        if(notaParqueo >= 0) this.notaParqueo = notaParqueo;
        else this.notaParqueo = 0;
    }

    AprendizCamion(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera, double notaParqueo){
        if(cedula != null) this.cedula = cedula;
        else this.cedula = "";
        setNombre(nombre);
        setTipoLicencia(tipoLicencia);
        setNotaTeoria(notaTeoria * 0.2);
        setNotaCircuito(notaCircuito * 0.2);
        setNotaCarretera(notaCarretera * 0.3);
        setNotaParqueo(notaParqueo * 0.3);
    }
    
    double calcularPromedio(){
        return (notaTeoria + notaCircuito + notaCarretera + notaParqueo) / 4;
    }
}
