package version03;

public class Dog03 extends Animal03 implements Swim03{
    @Override
    public void swim(){
        System.out.println("Dog swimming");
    }

    @Override
    protected void eat(){
        System.out.println("Override dog eat.");
    }

    protected void lookHome(){
        System.out.println("Guarding...");
    }

    Dog03(String name){
        super(name);
    }
}
