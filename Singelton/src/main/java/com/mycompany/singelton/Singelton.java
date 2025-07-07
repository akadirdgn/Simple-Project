package com.mycompany.singelton;


class A{
    private static A a = new A();
    private static int count;
    private static String name;
    
    private A(){
        count++;
        name = "Singelton" + count;
    }
    
    public static A getInstance(){
        return a;
    }
    
    public void print(){
        System.out.println(name);
    }
}
public class Singelton {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            A a = A.getInstance();
            a.print();
        }
    }
}
