/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees_2_post_in_preorder;

/**
 *
 * @author kadir
 */
public class Uygulama {
    
    Node root;

    public Uygulama() {
        root=null;
    }
    
    Node newNode(int data){
        root = new Node(data);
        return root;
    }
     
    Node insert(Node root,int data){//ekleme
        if(root!=null){
            if(data<root.data)
                root.left = insert(root.left, data);
            
            else
                root.right = insert(root.right, data);
            
        }
        else{
             root = newNode(data);
        }
        return root;
    }
    
    void preOrder(Node root){//önce Kök
        if(root!=null){
            System.out.print(root.data+"  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    void inOrder(Node root){//Ortada kök
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+"  ");
            inOrder(root.right);
        }
    }
    
    void postOrder(Node root){// en son kök
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"  ");
        }
    }
    
    int height(Node root){
        if(root == null){
            return -1;
        }
        else{
            int sol=0,sag=0;
            
            sol = height(root.left);
            sag = height(root.right);
            
            if(sol>sag){
                return sol+1;
            }
            else{
                return sag+1;
            }
        }
    }
    
    int size(Node root){
        if(root == null){
            return 0;
        }
        else{
            return size(root.left)+1+size(root.right);
        }
    }
    
    
    
}
