
public class AprendizMoto extends Aprendiz
{
    private double notaTeoria;
    private double notaCircuito;
    
    public AprendizMoto(String nombre, String cedula, String tipoLicencia, double notaTeoria, double notaCircuito){
      super (nombre, cedula, tipoLicencia);
      setNotaTeoria(notaTeoria);
      setNotaCircuito(notaCircuito);
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
    public double calcularPromedio(){
        return (notaTeoria + notaCircuito ) / 2;
    }
}