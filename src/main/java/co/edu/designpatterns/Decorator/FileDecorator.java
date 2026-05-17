package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public abstract class FileDecorator extends FileComponent{
    
    protected FileComponent file;
    
    public FileDecorator(FileComponent file){
        this.file = file;
    }
}
