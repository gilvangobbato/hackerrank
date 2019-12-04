package com.mycompany.solutions;

/**
 *
 * @author gilvan
 */
public class SingletonPattern {
    public static void main(String args[]) {
        Singleton.getSingleInstance().str = "Hello Word";
        System.out.println(Singleton.getSingleInstance().str);
    }
}

class Singleton{
    private static Singleton instance;
    public String str;

    private Singleton() {
        
    }
    
    public static Singleton getSingleInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
}