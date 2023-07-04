
import java.util.ArrayList;
public class Academia
{
    private final String nit;
    private String nombreAcademia;
    private String direccion;
    private ArrayList aprendiz;//arreglo tipo dinamico
    
    public Academia(String nit,String nombreAcademia,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreAcademia(nombreAcademia);
        setDireccion(direccion);        
        aprendiz = aprendiz = new ArrayList();
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
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < aprendiz.size(); i++){
            promedio += ((Aprendiz)aprendiz.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    //polimorfismo por sobrecarga de metodos
    public void adicionarAprendiz(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito)throws Exception{//sobrecarga del metodo
        aprendiz.add(new AprendizMoto(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito));//polimosrfismo mismo metodo diferentes parametros
    }
    
    public void adicionarAprendiz(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera)throws Exception{
        aprendiz.add(new AprendizCarro(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera));//throws Exception control de exepciones 
    }
    
    public void adicionarAprendiz(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera, double notaParqueo)throws Exception{
        aprendiz.add(new AprendizCamion(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera, notaParqueo));
    }
}
