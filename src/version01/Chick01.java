package version01;

public class Chick01 extends Animal01 {
    //Overwrite
    protected void eat(){
        System.out.println("Chick eating..");
    }

    protected void layEggs(){
        System.out.println("laying eggs..");
    }

    //
    Chick01(){
        this.setName("defaultName");
        this.setAge(1);
        this.setColor(Color.YELLOW);
    }

}
