
public class AprendizCamion extends Aprendiz{
    private double notaTeoria;
    private double notaCircuito;
    private double notaCarretera;
    private double notaParqueo;
    
    AprendizCamion(String cedula, String nombre, String curso, double notaTeoria, double notaCircuito, double notaCarretera,double notaParqueo)throws Exception{
        super(cedula, nombre, curso);
        setNotaTeoria(notaTeoria);
        setNotaCircuito(notaCircuito);
        setNotaCarretera(notaCarretera);
        setNotaParqueo(notaParqueo);
    }
    
    public double calcularPromedio(){
        return (notaTeoria + notaCircuito + notaCarretera + notaParqueo) / 3;
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
    
}