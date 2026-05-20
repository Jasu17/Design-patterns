/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.designpatterns.Observer;

/**
 *
 * @author jasu17
 */
public class MainApp {

    public static void main(String[] args) {

        Store store = new Store();

        // Corregido: Se agregó 'Event.' antes de cada constante
        store.getService().subscribe(Event.NEW_ITEM, new EmailMsgListener("smuke@like.com"));
        store.getService().subscribe(Event.SALE, new EmailMsgListener("smuke@like.com"));
        store.getService().subscribe(Event.SALE, new EmailMsgListener("smuke@subs.com"));
        store.getService().subscribe(Event.NEW_ITEM, new MobileAppListener("Smuke"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(Event.SALE, new EmailMsgListener("geekific@like.com"));
        store.salePromotion();

    }
}
