package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class MainDecorator {
    public static void main(String[] args) {
        FileComponent file = new BasicFile();
        
        file = new CompressionDecorator(file);
        file = new EncryprionDecorator(file);
        file = new BackupDecorator(file);
        
        System.out.println("File: "+ file.getDescription());
        System.out.println("Final Size:" + file.getSize());
    }
}
