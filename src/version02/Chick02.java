package version02;

public class Chick02 extends Animal02{
    //Overwrite
    protected void eat() {
        System.out.println("Chick eating...");
    }

    protected void layEggs(){
        System.out.println("laying eggs...");
    }

    Chick02(){
        this.setAge(1);
        this.setColor(Color.Yellow);
        this.setName("chick");
    }
}
