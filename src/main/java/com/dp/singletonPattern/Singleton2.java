package com.dp.singletonPattern;

public class Singleton2 {

    public void m(){
        System.out.println(this.hashCode());
    }

    private Singleton2(){

    }

    public static class Holder{
            private final static Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            new Thread(() ->{
                Singleton2.getInstance().m();
            }).start();
        }
    }
}
