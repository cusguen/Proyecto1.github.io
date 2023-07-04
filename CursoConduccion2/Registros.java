
import java.util.Scanner;
public class Registros{
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       int numeroAprendices = 0,opcionMenu = 0;//numeroEstudiante contador 
       Aprendiz[] losAprendices = new Aprendiz[50];
       String cedula, nombre, tipoLicencia;
       double notaTeoria, notaCircuito, notaCarretera;
       double promedio = 0;
        
       while (opcionMenu != 3){
           System.out.println("\n menu de opciones");
           System.out.println("1.adicionar aprendiz:");
           System.out.println("2.carcular promedio de notas:");
           System.out.println("3.salir:");
           System.out.println("Escoja una opcion...");
           opcionMenu = entrada.nextInt();
           if(opcionMenu == 1){
               System.out.println("Digite cedula del aprendiz:");
               cedula = entrada.next();
               System.out.println("Digite el nombre del aprendiz:");
               nombre = entrada.next();
               System.out.println("Digite el tipoLicencia del aprendiz:");
               tipoLicencia = entrada.next();
               System.out.println("Digite la nota uno del aprendiz:");
               notaTeoria = entrada.nextInt();
               System.out.println("Digite la nota dos del aprendiz:");
               notaCircuito = entrada.nextInt();
               System.out.println("Digite la nota tres del aprendiz:");
               notaCarretera = entrada.nextInt();
               Aprendiz unAprendiz = new Aprendiz(cedula,nombre,tipoLicencia,notaTeoria,notaCircuito,notaCarretera);//variables van al metodo constructor
               losAprendices[numeroAprendices] = unAprendiz;
               numeroAprendices ++;
               
           }
           else if(opcionMenu == 2){
               for(int i = 0; i < numeroAprendices; i++){
                   promedio = promedio + losAprendices[i].calcularPromedio() / numeroAprendices;//.calcularPromedio metodo de la clase principal 
           }
           System.out.println("\n el promedio de notas del aprendiz es: " + promedio);
           }
       
        }
    
    }

}