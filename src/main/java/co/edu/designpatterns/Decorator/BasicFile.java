package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class BasicFile extends FileComponent {
    @Override
    public String getDescription(){
        return "Basic file";
    }
    
    @Override
    public int getSize(){
        return 100;
    }
}
