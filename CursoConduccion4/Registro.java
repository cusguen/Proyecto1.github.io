
import java.util.Scanner;
public class Registro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numAprendices;
        Academia miAcademia = new Academia("123456","IED GonzaloArango","Suba");
        String cedula, nombre, tipoLicencia;
        double notaTeoria, notaCircuito, notaCarretera;
        double promedio = 0;
        
        System.out.println("Digite el numero de aprendices: ");
        numAprendices = sc.nextInt();
        
        for(int i = 0; i < numAprendices; i++){
            System.out.println("Digite el nombre del Aprendiz: ");
            nombre = sc.next();
            System.out.println("Digite la cedula del Aprendiz: ");
            cedula = sc.next();
            System.out.println("Digite el tipoLicencia del Aprendiz: ");
            tipoLicencia = sc.next();
            System.out.println("Digite primera nota del Aprendiz: ");
            notaTeoria = sc.nextDouble();
            System.out.println("Digite segunda nota del Aprendiz: ");
            notaCircuito = sc.nextDouble();            
            System.out.println("Digite tercera nota del Aprendiz: ");
            notaCarretera = sc.nextDouble();
            miAcademia.adicionarAprendiz(nombre,cedula, tipoLicencia, notaTeoria, notaCircuito, notaCarretera);
        }
        
        promedio = miAcademia.calcularPromedioGeneral();        
        System.out.println("\n El promedio de Registro de notas es: " + promedio); 
    }
}
