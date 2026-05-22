package co.edu.designpatterns;

import java.util.Scanner;
/**
 *
 * @author jasu17
 */
public class DesignPatterns {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n==========================================");
            System.out.println("   PATRONES DE DISEÑO - DEMO");
            System.out.println("==========================================");
            System.out.println(" 1. Factory Method");
            System.out.println(" 2. Observer");
            System.out.println(" 3. Decorator");
            System.out.println(" 0. Salir");
            System.out.println("==========================================");
            System.out.print(" Seleccione un patrón: ");
            opcion = scan.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\n--- Factory Method ---");
                    co.edu.designpatterns.FactoryMethod.Main.main(args);
                    break;
                
                case 2:
                    System.out.println("\n--- Observer ---");
                    co.edu.designpatterns.Observer.MainApp.main(args);
                    break;
                    
                case 3:
                    System.out.println("\n--- Decorator ---");
                    co.edu.designpatterns.Decorator.MainDecorator.main(args);
                    break;
                case 0:
                    System.out.println("\n Saliendo...");
                    break;
                default:
                    System.out.println("\n Opción invalida");;
            }
        } while (opcion != 0);
        
        scan.close();
    }
}
