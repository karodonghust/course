package com.dp.singletonPattern;

public class Singleton3 {

    private volatile static Singleton3 uniqueInstance;

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton3.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }

    public void m(){
        System.out.println(this.hashCode());
    }

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            new Thread(() ->{
                Singleton3.getInstance().m();
            }).start();
        }
    }

}
