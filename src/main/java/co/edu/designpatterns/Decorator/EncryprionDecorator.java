package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class EncryprionDecorator extends FileDecorator {
    
    public EncryprionDecorator (FileComponent file){
        super(file);
    }
    
    @Override
    public String getDescription(){
        return file.getDescription() + " + Encryption";
    }
    
    @Override
    public int getSize(){
        return file.getSize() + 10;
    }
}
