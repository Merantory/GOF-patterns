package com.merantory.patterns;

public class Singleton {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getClassObject();
        obj.data = "Hello";
        System.out.println(obj.data);
    }
}

class SingletonClass {
    private static final SingletonClass uniqueInstance = new SingletonClass();
    public String data;

    private SingletonClass() {}

    public static SingletonClass getClassObject() {
        return uniqueInstance;
    }
}
