
/**
 
 */
import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario

public class CursoConduccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crear un nuevo objeto scanner

        // Crear arreglos para guardar las identificaciones, nombres, cursos y notas
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] cursos = new String[50];
        double[] notaTeoria = new double[50];
        double[] notaCircuito = new double[50];
        double[] notaCarretera = new double[50];

        // Crear variables para la entrada temporal del usuario
        String cedula, nombre, licencia;
       
        double promedio = 0; // Variable para calcular el promedio
        
        // Solicitar al usuario el número de estudiantes
        System.out.println("Digite el número de aprendices:");
        int numeroEstudiantes = entrada.nextInt();

        // Ciclo para pedir al usuario los detalles de cada estudiante
        for(int i=0; i<numeroEstudiantes; i++){
            // Solicitar la cédula, nombre y tipo de licencia
            System.out.println("Digite el numero de cedula del estudiante:");
            cedula = entrada.next();
            System.out.println("Digite el nombre del aprendiz:");
            nombre = entrada.next();
            System.out.println("Digite el tipo de licencia que esta aplicando:");
            licencia = entrada.next();

            // Solicitar las notas de cada estudiante
            System.out.println("Digite la nota de teoria del aprendiz:");
            notaTeoria[i] = entrada.nextDouble();
            System.out.println("Digite la nota de circuito del aprendiz:");
            notaCircuito[i] = entrada.nextDouble();
            System.out.println("Digite la nota de carretera del aprendiz:");
            notaCarretera[i] = entrada.nextDouble();
            
            // Guardar los datos en los arreglos correspondientes
            identificaciones[i] = cedula;
            nombres[i] = nombre;
            cursos[i] = licencia;
        }

        // Ciclo para calcular el promedio de las notas de todos los estudiantes
        for(int i=0; i<numeroEstudiantes; i++){
            promedio += ((notaTeoria[i]*0.2 + notaCircuito[i]*0.3 + notaCarretera[i]*0.5)/3)/numeroEstudiantes;
        }

        // Imprimir el promedio
        System.out.println("El promedio es: " + promedio);
        
        if (promedio >= 10){
            System.out.println("El curso tiene un buen promedio");
        }else{
            System.out.println("El promedio del curso es bajo");
        }
        
    }
}
