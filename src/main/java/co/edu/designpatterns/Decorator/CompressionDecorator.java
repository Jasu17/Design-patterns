package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class CompressionDecorator extends FileDecorator {
    
    public enum Algorithm { ZIP, GZIP, LZMA}
    
    private final Algorithm algorithm;
    private final double ratio;
    
    public CompressionDecorator(FileComponent file, Algorithm algorithm){
        super(file);
        this.algorithm = algorithm;
        this.ratio = resolveRatio(algorithm);
    }
    
    private double resolveRatio(Algorithm alg){
        switch(alg){
            case ZIP: return 0.70;
            case GZIP: return 0.60;
            case LZMA: return 0.45;
            default: return 1.0;
        }
    }
    
    @Override
    public String getDescription(){
        return wrappedFile.getDescription() + " [Comprimido con " + algorithm + "]";
    }
    
    @Override
    public double getSize(){
        return Math.round(wrappedFile.getSize() * ratio *100.0) /100;
    }
    
    @Override
    public double getCost(){
        double compressionCost = 0.5 * (wrappedFile.getSize() /100);
        return wrappedFile.getCost() + compressionCost;
    }
}
