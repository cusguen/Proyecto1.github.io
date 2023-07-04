
public class AprendizCarro extends Aprendiz
{
    private double notaTeoria;
    private double notaCircuito;
    private double notaCarretera;
    
    public AprendizCarro(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera){
      super (cedula, nombre, tipoLicencia);
      setNotaTeoria(notaTeoria);
      setNotaCircuito(notaCircuito);
      setNotaCarretera(notaCarretera);
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
    public double calcularPromedio(){
        return (notaTeoria + notaCircuito + notaCarretera ) / 3;
    }
}
