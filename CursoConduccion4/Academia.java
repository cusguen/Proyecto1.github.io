
public class Academia
{
    private final String nit;
    private String nombreAcademia;
    private String direccion;
    private Aprendiz[] aprendiz;
    private int numAprendices;
    
    public Academia(String nit,String nombreAcademia,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreAcademia(nombreAcademia);
        setDireccion(direccion);        
        aprendiz = new Aprendiz[50];
        numAprendices = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreAcademia(){
        return nombreAcademia;
    }
    public void setNombreAcademia(String nombreAcademia){
        if(nombreAcademia != null){
            this.nombreAcademia = nombreAcademia;
        }else{
            this.nombreAcademia = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumAprendices(){
        return numAprendices;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numAprendices; i++){
            promedio = promedio + aprendiz[i].calcularPromedio() / numAprendices;
        }
        return promedio;
    }
    
    public void adicionarAprendiz(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera){
        Aprendiz e = new Aprendiz(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera);
        aprendiz[numAprendices] = e;
        numAprendices++;
    }
}  
