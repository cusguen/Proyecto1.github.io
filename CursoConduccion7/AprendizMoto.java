
public class AprendizMoto extends Aprendiz{
    private double notaTeoria;
    private double notaCircuito;
    
    AprendizMoto(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito)throws Exception{
        super(cedula, nombre, tipoLicencia);
        setNotaTeoria(notaTeoria);
        setNotaCircuito(notaCircuito);
    }

    public double calcularPromedio(){
        return (notaTeoria + notaCircuito) / 2;
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
    
}