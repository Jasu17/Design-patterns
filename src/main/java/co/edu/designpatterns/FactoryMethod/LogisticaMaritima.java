/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.designpatterns.FactoryMethod;
/**
 *
 * @author panda
 */
public class LogisticaMaritima extends Logistica{

    @Override
    public Transporte crearTransporte() {
        return new Barco();
    }
    
}
