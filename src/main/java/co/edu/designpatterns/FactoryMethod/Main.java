/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.designpatterns.FactoryMethod;

/**
 *
 * @author panda
 */
public class Main {
    public static void main(String[] args) {
        
        Logistica empresaLogistica;

        // Transporte terrestre
        System.out.println("CASO A: El cliente solicita envío terrestre.");
        empresaLogistica = new LogisticaTerrestre();
        empresaLogistica.planificarEntrega();

        // Transporte marítimo
        System.out.println("CASO B: El cliente solicita envío marítimo.");
        empresaLogistica = new LogisticaMaritima();
        empresaLogistica.planificarEntrega();
    }
}
