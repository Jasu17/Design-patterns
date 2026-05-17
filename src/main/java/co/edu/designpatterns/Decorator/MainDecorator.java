package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class MainDecorator {
    public static void main(String[] args) {
        System.out.println("=== Caso 1: Compresión GZIP + Cifrado AES-256 ===");
        FileComponent file1 = new BasicFile("reporte.pdf", 500.0);
        file1 = new CompressionDecorator(file1, CompressionDecorator.Algorithm.GZIP);
        file1 = new EncryptionDecorator(file1, EncryptionDecorator.Level.AES_128);
        printInfo(file1);
        
                System.out.println("\n=== Caso 2: Cifrado AES-128 + Backup x2 ===");
        FileComponent file2 = new BasicFile("base_datos.sql", 1200.0);
        file2 = new EncryptionDecorator(file2, EncryptionDecorator.Level.AES_128);
        file2 = new BackupDecorator(file2, 2);
        printInfo(file2);

        System.out.println("\n=== Caso 3: Compresión LZMA + Cifrado AES-256 + Backup x3 ===");
        FileComponent file3 = new BasicFile("logs.txt", 800.0);
        file3 = new CompressionDecorator(file3, CompressionDecorator.Algorithm.LZMA);
        file3 = new EncryptionDecorator(file3, EncryptionDecorator.Level.AES_256);
        file3 = new BackupDecorator(file3, 3);
        printInfo(file3);
    }

    private static void printInfo(FileComponent f) {
        System.out.println(" Descripcion: "+ f.getDescription());
        System.out.printf(" Tamano final: %.2f KB%n", f.getSize());
        System.out.printf(" Costo toal: %.2f Unidades%n", f.getCost());
    }
}
