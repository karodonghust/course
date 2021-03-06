package com.dp.singletonPattern;

public class Singleton {

    //unique 独一无二的
    private static Singleton uniqueInstance;

    public void m(){
        System.out.println(this.hashCode());
    }

    private Singleton(){}

    //非线程安全
//    public static Singleton getInstance(){
//        if(null == uniqueInstance){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }

    //线程安全，但是只有在首次获取对象时，才会出现线程不安全问题，编程同步方法后，导致后续应用性能被拖慢
    public static Singleton getInstance(){
        if(null == uniqueInstance){
            try{
                Thread.sleep(1);
            } catch (Exception e){
                e.printStackTrace();
            }
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            new Thread(() ->{
                Singleton.getInstance().m();
            }).start();
        }
    }

}
