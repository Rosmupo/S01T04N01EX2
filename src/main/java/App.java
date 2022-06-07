import java.util.Scanner;
public class App {

    public static void main (String [] args ){

        int num= askNumId();
        CalculateId calculateDni = new CalculateId(num);
        //Llamada al método de la clase CalculateId que calcula la letra del dni.
        char letter=calculateDni.calculateLetterId();
        System.out.println("Su dni es: "+ num + letter );
    }

////////// Entrada de datos
    private static int askNumId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de su DNI: ");
        int numId = sc.nextInt();
        sc.close();
        return numId;
    }
}
