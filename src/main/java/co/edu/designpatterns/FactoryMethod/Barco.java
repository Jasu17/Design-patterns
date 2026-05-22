/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.designpatterns.FactoryMethod;
/**
 *
 * @author panda
 */

// Producto concreto: transporte marítimo
public class Barco implements Transporte{

    @Override
    public void entregar() {
        System.out.println("🚢 Entregando mercancía por mar en un buque contenedor.");
    }
    
}
