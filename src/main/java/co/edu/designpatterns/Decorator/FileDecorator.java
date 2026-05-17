package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public abstract class FileDecorator extends FileComponent{
    
    protected FileComponent wrappedFile;
    
    public FileDecorator(FileComponent file){
        this.wrappedFile = file;
    }
    
    @Override
    public String getDescription(){
        return wrappedFile.getDescription();
    }
    
    @Override
    public double getSize(){
        return wrappedFile.getSize();
    }
    
    @Override
    public double getCost(){
        return wrappedFile.getCost();
    }
}
