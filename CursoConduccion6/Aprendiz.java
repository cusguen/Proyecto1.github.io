
public class Aprendiz
{
    private String nombre;
    protected final String cedula ;
    private String tipoLicencia;
    
    public Aprendiz(String cedula, String nombre, String tipoLicencia){
      if(cedula != null)this.cedula  = cedula;
      else this.cedula = ""; 
      setNombre(nombre);
      setTipoLicencia(tipoLicencia);
    }
    double calcularPromedio () {
        return  0;
    }
    public String getCedula (){
       return cedula;
    }
       public String getNombre (){
       return nombre;
    }
    
    public void setNombre (String nombre){
        if(nombre != null ) this.nombre = nombre;
        else this.nombre = "";
    }
        public String getTipoLicencia (){
       return tipoLicencia;
    }
    
    public void setTipoLicencia (String tipoLicencia){
        if(tipoLicencia != null ) this.tipoLicencia = tipoLicencia;
        else this.tipoLicencia = "";
    }
}