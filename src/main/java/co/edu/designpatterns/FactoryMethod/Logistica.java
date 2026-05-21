/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.designpatterns.FactoryMethod;
/**
 *
 * @author panda
 */

public abstract class Logistica {

    // El Factory Method es abstracto
    public abstract Transporte crearTransporte();

    // Lógica que usa el transporte creado por las subclases
    public void planificarEntrega() {
        System.out.println("=========================================");
        System.out.println("...Iniciando planificación logística...");
        
        // Se invoca al método abstracto
        Transporte miTransporte = crearTransporte();
        
        // Se ejecuta la acción sin saber si es barco o camión
        miTransporte.entregar();
        System.out.println("=========================================\n");
    }
}