package version02;

import version01.Animal01;

import java.awt.*;

public class Animal02 {
    private String name;
    private int age;
    private Color color;
    protected enum Color {
        Black,White,Yellow,
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    Animal02(){}
    Animal02(String name, int age, Color color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    protected void drink(){
        System.out.println("Animal Drinking...");
    }
    protected void eat(){
        System.out.println("Animal Eating...");
    }
}
