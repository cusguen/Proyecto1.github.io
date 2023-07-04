
public class Academia
{
    private final String nit;
    private String nombreAcademia;
    private String direccion;
    private AprendizMoto[] aprendiz1;
    private AprendizCarro[] aprendiz2;
    private AprendizCamion[] aprendiz3;    
    private int numAprendices1;
    private int numAprendices2;
    private int numAprendices3;    
    
    public Academia(String nit,String nombreAcademia,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreAcademia(nombreAcademia);
        setDireccion(direccion);        
        aprendiz1 = new AprendizMoto[50];
        aprendiz2 = new AprendizCarro[50];
        aprendiz3 = new AprendizCamion[50];        
        numAprendices1 = 0;
        numAprendices2 = 0;
        numAprendices3 = 0;        
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
    
    public int getnumAprendices1(){
        return numAprendices1;
    }
    
    public int getnumAprendices2(){
        return numAprendices2;
    }
    
    public int getmumAprendices3(){
        return numAprendices3;
    }    
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numAprendices1; i++){
            promedio = promedio + aprendiz1[i].calcularPromedio() / numAprendices1;
        }
        for(int i = 0; i < numAprendices2; i++){
            promedio = promedio + aprendiz2[i].calcularPromedio() / numAprendices2;
        }
        for(int i = 0; i < numAprendices3; i++){
            promedio = promedio + aprendiz3[i].calcularPromedio() / numAprendices3;
        }
        return promedio / 3;
    }
    public void adicionarAprendizMoto(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito){
        aprendiz1[numAprendices1] = new AprendizMoto(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito);
        numAprendices1++;
    }
    
    public void adicionarAprendizCarro(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera){
        aprendiz2[numAprendices2] = new AprendizCarro(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera);
        numAprendices2++;
    }
    
    public void adicionarAprendizCamion(String cedula, String nombre, String tipoLicencia, double notaTeoria, double notaCircuito, double notaCarretera, double notaParqueo){
        aprendiz3[numAprendices3] = new AprendizCamion(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera, notaParqueo);
        numAprendices3++;
    }
} 