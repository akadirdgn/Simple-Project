package com.kadir.matematik;

public class Matametik implements IMatematik{

    @Override
    public void toplama(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println(a*b);
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println((double)a/b);
    }
    
}
