
import java.util.Scanner;
public class Registro{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Academia miAcademia = new Academia("123456","Academia S.A","kennedy");
        String cedula, nombre, tipoLicencia;
        double notaTeoria, notaCircuito, notaCarretera, notaParqueo;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Aprendiz de Moto: ");
            System.out.println("[2]- Adicionar Aprendiz de Carro: ");
            System.out.println("[3]- Adicionar Aprendiz de Camion: ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
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
                        try{
                            miAcademia.adicionarAprendiz(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
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
                        try{// para hacer el control de exepciones                       
                        miAcademia.adicionarAprendiz(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();                        
                        System.out.println("Digite la cedula del Aprendiz: ");
                        cedula = sc.next();
                        System.out.println("Digite el nombre del Aprendiz: ");
                        nombre = sc.next();
                        System.out.println("Digite el tipoLicencia del Aprendiz: ");
                        tipoLicencia = sc.next();
                        System.out.println("Digite nota de teoria del Aprendiz: ");
                        notaTeoria = sc.nextDouble();
                        System.out.println("Digite nota de circuito del Aprendiz: ");
                        notaCircuito = sc.nextDouble();            
                        System.out.println("Digite nota de carretera del Aprendiz: ");
                        notaCarretera = sc.nextDouble();
                        System.out.println("Digite nota de parqueo del Aprendiz: ");
                        notaParqueo = sc.nextDouble();
                        try{                         
                        miAcademia.adicionarAprendiz(cedula, nombre, tipoLicencia, notaTeoria, notaCircuito, notaCarretera, notaParqueo);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = miAcademia.calcularPromedioGeneral();
                        System.out.println("\n El promedio de Registro de notas  es: " + String.format("%.2f",promedio)); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}