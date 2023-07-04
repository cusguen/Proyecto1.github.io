
import java.util.Scanner;
public class Registro{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Academia miAcademia = new Academia("123456","IED GonzaloArango","Suba");
        String cedula, nombre, tipoLicencia;
        
        double promedio = 0;
        
        System.out.println("Digite el numero de Aprendices de moto: ");
        int numAprendices1 = sc.nextInt();
        for(int i = 0; i < numAprendices1; i++){
            double notaTeoria, notaCircuito;
            System.out.println("Digite la cedula del Aprendiz: ");
            cedula = sc.next();
            System.out.println("Digite el nombre del Aprendiz: ");
            nombre = sc.next();
            System.out.println("Digite el tipoLicencia del Aprendiz: ");
            tipoLicencia = sc.next();
            System.out.println("Digite primera nota del Aprendiz: ");
            notaTeoria = sc.nextDouble();
            System.out.println("Digite segunda nota del Aprendiz: ");
            notaCircuito = sc.nextDouble();            
            miAcademia.adicionarAprendizMoto(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito);
        }
                
        System.out.println("Digite el numero de Aprendices de Carro: ");
        int numAprendices2 = sc.nextInt();
        for(int i = 0; i < numAprendices2; i++){
            double notaTeoria, notaCircuito, notaCarretera;
            System.out.println("Digite la cedula del Aprendiz: ");
            cedula = sc.next();
            System.out.println("Digite el nombre del Aprendiz: ");
            nombre = sc.next();
            System.out.println("Digite el tipoLicencia del Aprendiz: ");
            tipoLicencia = sc.next();
            System.out.println("Digite primera nota del Aprendiz: ");
            notaTeoria = sc.nextDouble();
            System.out.println("Digite segunda nota del Aprendiz: ");
            notaCircuito = sc.nextDouble();            
            System.out.println("Digite tercera nota del Aprendiz: ");
            notaCarretera = sc.nextDouble();
            miAcademia.adicionarAprendizCarro(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera);
        }
        
        System.out.println("Digite el numero de Aprendices de Camion: ");
        int numAprendices3 = sc.nextInt();
        for(int i = 0; i < numAprendices3; i++){
            double notaTeoria, notaCircuito, notaCarretera, notaParqueo;            
            System.out.println("Digite la cedula del Aprendiz: ");
            cedula = sc.next();
            System.out.println("Digite el nombre del Aprendiz: ");
            nombre = sc.next();
            System.out.println("Digite el tipoLicencia del Aprendiz: ");
            tipoLicencia = sc.next();
            System.out.println("Digite primera nota del Aprendiz: ");
            notaTeoria = sc.nextDouble();
            System.out.println("Digite segunda nota del Aprendiz: ");
            notaCircuito = sc.nextDouble();            
            System.out.println("Digite tercera nota del Aprendiz: ");
            notaCarretera = sc.nextDouble();
            System.out.println("Digite cuarta nota del Aprendiz: ");
            notaParqueo = sc.nextDouble();            
            miAcademia.adicionarAprendizCamion(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera, notaParqueo);
        }
        
        promedio = miAcademia.calcularPromedioGeneral();
        System.out.println("\n El promedio de Registro notas es: " + promedio); 
    }
}

