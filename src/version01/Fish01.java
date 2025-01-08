package version01;

public class Fish01 extends Animal01 implements Swim01{
    @Override
    public void swim(){
        System.out.println(this.getName()+" swimming.");
    }

    //Overwrite
    protected void eat(){
        System.out.println("Fish eating..");
    }
}

