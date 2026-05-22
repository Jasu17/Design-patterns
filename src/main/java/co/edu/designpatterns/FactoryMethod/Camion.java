/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.designpatterns.FactoryMethod;
/**
 *
 * @author panda
 */

// Producto concreto: transporte terrestre
public class Camion implements Transporte{

    @Override
    public void entregar() {
        System.out.println("🚛 Entregando mercancía por carretera en un camión.");
    }
    
}
