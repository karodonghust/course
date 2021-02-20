package com.designPattern.singletonPattern;

public class Singleton {

    //unique 独一无二的
    private static Singleton uniqueInstance;
    /**
     * 懒加载的同时保证线程同步，会造成性能被拖慢，所以此时可以放弃使用懒加载。
     * private static Singleton uniqueInstance = new Singleton();
     * 或者使用双重检查锁
     * private volatile static Singleton uniqueInstance;
     *
     * public static Singleton getInstance(){
     *     if(uniqueInstance == null){
     *         synchronized(Singleton.class){
     *             if(uniqueInstance == null){
     *                uniqueInstance =  new Singleton();
     *             }
     *         }
     *     }
     *     return uniqueInstance;
     * }
     *
     * volatile 确保多线程使用时，Singleton被安全的初始化。
     * 为什么不直接将所有业务方法都设置为静态方法，而使用单例模式？
     * 答：当类自给自足，不需要复杂的初始化时，可以通过将方法均设置为静态方法。
     * 当该类依赖别的类时，为了保证初始化的正确性，推荐使用单例模式
     */

    private Singleton(){}

    //非线程安全
//    public static Singleton getInstance(){
//        if(null == uniqueInstance){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }

    //线程安全，但是只有在首次获取对象时，才会出现线程不安全问题，编程同步方法后，导致后续应用性能被拖慢
    public static synchronized Singleton getInstance(){
        if(null == uniqueInstance){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
