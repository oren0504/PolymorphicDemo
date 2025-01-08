package version02;

public class Fish02 extends Animal02 implements Swim02 {
    @Override
    public void swim(){
        System.out.println("fish swimming...");
    }

    //Overwrite
    protected void eat() {
        System.out.println("fish eating...");
    }

    Fish02(){
        this.setAge(2);
        this.setColor(Color.White);
        this.setName("fish");
    }
}