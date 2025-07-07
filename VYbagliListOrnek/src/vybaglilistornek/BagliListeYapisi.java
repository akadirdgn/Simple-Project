/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vybaglilistornek;

/**
 *
 * @author kadir
 */
public class BagliListeYapisi {

    Node head = null;
    Node tail = null;

    void ekle(int data) {
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
            head.prev = null;
        } else {

            tail.next = eleman;
            eleman.prev = tail;
            tail = tail.next;
        }

    }

    void sırala() {
        Node temp = head;
        int degisken;
        boolean control = true;

        do {
            control = false;
            while (temp.next != null) {
                if (temp.next.data < temp.data) {//5 3 3 5
                    degisken = temp.next.data;
                    temp.next.data = temp.data;
                    temp.data = degisken;
                    control = true;
                }
                temp = temp.next;
            }
            
        } while (control);

    }

    void yazdir() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

}
