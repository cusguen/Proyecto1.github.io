
public class Academia
{
    private final String nit;
    private String nombreAcademia;
    private String direccion;
    private Aprendiz[] aprendiz;
    private int numAprendices; 
    
    public Academia (String nit, String nombre, String direccion){
      if(nit != null) this.nit = nit;
      else this.nit ="";
      setNombreAcademia(nombreAcademia);
      setDireccion(direccion);
      aprendiz = new Aprendiz[50];
      numAprendices = 0; 
    }
    public String getNit(){
        return nit;
    }
    public String getNombreAcademia (){
        return nombreAcademia;
    }
    public void setNombreAcademia (String nombreAcademia){
        if(nombreAcademia != null) {
           this.nombreAcademia = nombreAcademia; 
        }else{
            this.nombreAcademia = "";
        }    
    }
    public String getDireccion (){
    return direccion;
    }
    public void setDireccion (String direccion){
        if(direccion != null) {
           this.direccion = direccion; 
        }else{
            this.direccion = "";
        }
    }
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numAprendices; i++){
            promedio = promedio + aprendiz[i].calcularPromedio();
        }
        return promedio / 3;
    }
    public void adicionarAprendizMoto(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito){
        aprendiz[numAprendices] = new AprendizMoto(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito);
        numAprendices++;
    }
    
    public void adicionarAprendizCarro(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera){
        aprendiz[numAprendices] = new AprendizCarro(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera);
        numAprendices++;
    }
    
    public void adicionarAprendizCamion(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera, double notaParqueo){
        aprendiz[numAprendices] = new AprendizCamion(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera, notaParqueo);
        numAprendices++;
    }
}
