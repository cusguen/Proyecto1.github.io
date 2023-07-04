
import java.util.Scanner;
public class Registro
{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int numeroAprendices;
            Aprendiz[] losAprendices = new Aprendiz[50];
            String cedula, nombre, tipoLicencia;
            double notaTeoria, notaCircuito, notaCarretera;
            double promedio = 0;
            System.out.println("Digite la cantidad de Aprendices: ");
            numeroAprendices = sc.nextInt();
            
            for(int i = 0; i < numeroAprendices; i++){
                System.out.println("Digite la cedula del Aprendiz. ");
                cedula = sc.next();
                System.out.println("Digite nombre del Aprendiz: ");
                nombre = sc.next();
                System.out.println("Digite el tipoLicencia del Aprendiz: ");
                tipoLicencia = sc.next();
                System.out.println("Digite la nota de teoria del Aprendiz: ");
                notaTeoria = sc.nextDouble();
                System.out.println("Digite la nota Circuito del Aprendiz: ");
                notaCircuito = sc.nextDouble();
                System.out.println("Digite la nota Carretera del Aprendiz: ");
                notaCarretera = sc.nextDouble();
                Aprendiz unAprendiz = new Aprendiz();
                unAprendiz.cedula = cedula;
                unAprendiz.nombre = nombre;
                unAprendiz.tipoLicencia = tipoLicencia;
                unAprendiz.notaTeoria = notaTeoria;
                unAprendiz.notaCircuito = notaCircuito;
                unAprendiz.notaCarretera = notaCarretera;
                losAprendices[i] = unAprendiz;
            }
            for(int i = 0; i < numeroAprendices; i++){
                double sum =(losAprendices[i].notaTeoria +losAprendices[i].notaCircuito +losAprendices[i].notaCarretera)/3;
                promedio = promedio + sum / numeroAprendices;
            }
            System.out.println("El promedio de Registrode notas es: "+ promedio);
    }
}

