package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public abstract class FileComponent {
    public abstract String getDescription();
    public abstract double getSize(); // Kb
    public abstract double getCost(); // Costo de procesamiento
}
