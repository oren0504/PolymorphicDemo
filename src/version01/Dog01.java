package version01;

public class Dog01 extends Animal01 implements Swim01{
    @Override
    public void swim(){
        System.out.println(getClass()+" "+getName()+ " Swimming..");
    }

    Dog01(String name, int age, Color color){
        super(name, age, color);
    }

    //Overwrite
    protected void eat(){
        System.out.println("Dog eating.. ");
    }

    protected void lookHome(){
        System.out.println("Dog's Guarding..");
    }
}
