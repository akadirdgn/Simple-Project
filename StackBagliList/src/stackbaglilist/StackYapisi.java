/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackbaglilist;

/**
 *
 * @author kadir
 */
public class StackYapisi {
    
    int size;
    int cnt;
    
    Node head;//en üst dügüm ,head

    public StackYapisi(int size) {
        this.size = size;
        cnt=0;
    }
    
    void push(int data){ 
        Node eleman = new Node(data);
        
        if(isFull()){
            System.out.println("Stack dolu...");
        }
        else{
            if(isEmpty()){
                head=eleman;
            }
            else{
                
                eleman.next=head;
                head = eleman;
            }
        }
        cnt++;
    }
    
    void pop(){
        if(isEmpty()){
            System.out.println("Stack bos...");
        }
        else{
            head=head.next;
        }
        cnt--;
    }
    
    boolean isFull(){
        return cnt == size;
    }
    
    boolean isEmpty(){
        return cnt == 0;
        
    }
    
    void print(){
        
        if(isEmpty()){
            System.out.println("Stack bos...");
        }
        else{
            Node temp = head;
            while (temp != null) { 
                System.out.println(temp.data);
                temp = temp.next;
                
            }
        }
    }
    
    
}
