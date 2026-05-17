package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class BasicFile extends FileComponent {
    
    private final String name;
    private final double sizeKB;
    
    public BasicFile(String name, double sizeKB){
        this.name = name;
        this.sizeKB = sizeKB;
    }
    
    @Override
    public String getDescription(){
        return "\"" + name + "\" (" + sizeKB + " KB)";
    }
    
    @Override
    public double getSize(){
        return sizeKB;
    }
    
    @Override
    public double getCost(){
        return 1.0;
    }
}
