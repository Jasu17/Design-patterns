/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class BackupDecorator extends FileDecorator{
    
    public BackupDecorator(FileComponent file){
        super(file);
    }
    
    @Override
    public String getDescription(){
        return file.getDescription() + " + Backup";
    }
    
    @Override
    public int getSize(){
        return file.getSize() + 50;
    }
}
