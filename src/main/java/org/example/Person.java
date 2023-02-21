package org.example;

public class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("String int");
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = Integer.parseInt(id);
        System.out.println("String String");
    }

    public Person(int id,String name) {
        this.name = name;
        this.id = id;
        System.out.println("int String");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getOP(){
        System.out.println(getId());
        System.out.println(getName());
    }
}
