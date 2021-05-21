package alumnos;
import alumno.Alumno;
import java.util.Scanner;

/**
 *
 * @author ainhoaarandacaro
 */
public class Alumnos {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    Alumno[] istAlumnos = new Alumno[5];
    
    

    String nombreIntroducido;
    double notaIntroducida;

      System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        IntroduceNotas(istAlumnos, entrada);
    
    
  
    double  sumaDeMedias = 0;
  
    System.out.println("Los datos introducidos son los siguientes:");

    
        sumaDeMedias = MuestraResultados(istAlumnos, sumaDeMedias); 
    System.out.println("La media global de la clase es " + sumaDeMedias / 5);
  
  }

    private static double MuestraResultados(Alumno[] istAlumnos, double sumaDeMedias) {
        for(int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + istAlumnos[i].getNombre());
            System.out.println("Nota media: " + istAlumnos[i].getNotaMedia());
            System.out.println("----------------------------");
            sumaDeMedias += istAlumnos[i].getNotaMedia();
        }   return sumaDeMedias;
    }

    private static void IntroduceNotas(Alumno[] istAlumnos, Scanner entrada) throws NumberFormatException {
        String nombreIntroducido;
        double notaIntroducida;
        for (int i = 0; i < 5; i++) {
            
            istAlumnos[i] = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            //(istAlumnos[i]).nombre = nombreIntroducido;
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            //alum[i].notaMedia = notaIntroducida;
            
            istAlumnos[i].AsignarNota(nombreIntroducido, notaIntroducida, 10);
            
        }
    }
}

