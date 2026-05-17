package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class EncryptionDecorator extends FileDecorator {
    
    public enum Level { AES_128, AES_256 }
    private final Level level;
    
    public EncryptionDecorator (FileComponent file, Level level){
        super(file);
        this.level = level;
    }
    
    @Override
    public String getDescription(){
        return wrappedFile.getDescription() + " [Cifrado " + level + "]";
    }
    
    @Override
    public double getSize(){
        double overhead = (level == Level.AES_256) ? 0.05 : 0.02;
        return Math.round(wrappedFile.getSize() * (1 + overhead) * 100.0) / 100.0;
    }
    
    @Override
    public double getCost(){
        double cryptoCost = (level == Level.AES_256)? 2.0: 1.2;
        return wrappedFile.getCost() + cryptoCost;
    }
    
    
}
