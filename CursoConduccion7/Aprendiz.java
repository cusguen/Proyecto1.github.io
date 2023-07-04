
public abstract class Aprendiz{
        protected final String cedula;
        private String nombre;
        private String tipoLicencia;
        
        public Aprendiz(String cedula, String nombre, String tipoLicencia)throws Exception{
            if(cedula.trim().equals(""))
                throw new Exception("valor invalido en la cedula");
            
            if(cedula.matches(".*[a-zA-Z].*"))
                throw new Exception("La cedula no puede tener caracteres");
            
            this.cedula = cedula;
            setNombre(nombre);
            setTipoLicencia(tipoLicencia);
            
        }
        
        public abstract double calcularPromedio();
        
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
        
    }