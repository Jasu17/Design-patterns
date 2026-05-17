package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class BackupDecorator extends FileDecorator{
    
    private final int copies;
    
    public BackupDecorator(FileComponent file, int copies){
        super(file);
        this.copies = Math.max(1, copies);
    }
    
    @Override
    public String getDescription(){
        return wrappedFile.getDescription() + " [Backup x" + copies + "]";
    }
    
    @Override
    public double getSize(){
        return Math.round(wrappedFile.getSize() * (1+copies)*100)/100;
    }
    
    @Override
    public double getCost(){
        double ioCost = copies * (wrappedFile.getSize() /200);
        return wrappedFile.getCost() + ioCost;
    }
}
