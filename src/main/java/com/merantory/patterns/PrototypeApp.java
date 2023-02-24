package com.merantory.patterns;

public class PrototypeApp
{
    public static void main( String[] args )
    {
        User firstUser = new User("FirstUser", 20);
        System.out.println(firstUser);
        User copyUser = firstUser.copy();
        System.out.println(copyUser);
    }
}

interface Copyable {
    Object copy();
}

class User implements Copyable {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User copy() {
        return new User(name, age);
    }

    @Override
    public String toString() {
        return "User: (name: " + name + " | age: " + age + ")";
    }
}