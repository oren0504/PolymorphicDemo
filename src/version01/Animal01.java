package version01;

public class Animal01 implements Runnable{
    private String name;
    private int age;
    private Color color;
    protected enum Color{
        GREY,BLACK,WHITE,YELLOW,
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


    Animal01(){ }

    Animal01(String name,int age,Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    protected void drink(){
        System.out.println(this.getClass()+this.getName() +" Drinking..");
    }

    protected void eat(){
        System.out.println(this.getClass()+this.getName()+" Eating..");
    }

}
