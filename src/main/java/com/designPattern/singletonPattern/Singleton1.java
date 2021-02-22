package com.designPattern.singletonPattern;

public enum Singleton1 {
    /**
     * 在实现懒加载的同时，可以保证线程安全，同时可以防止反序列化
     */

    INSTANCE;

    public void m(){
        System.out.println(this.hashCode());
    }

    public static void main(String[] args) {
            for(int i=0;i<1000;i++){
                new Thread(() ->{
                    Singleton1.INSTANCE.m();
                }).start();
            }
    }


}
