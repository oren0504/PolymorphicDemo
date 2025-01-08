package version03;

public class Fish03 extends Animal03 implements Swim03{
    @Override
    protected void eat(){
        System.out.println("Override fish eating.");
    }
    @Override
    public void swim(){
        System.out.println("fish swimming.");
    }
    Fish03(String name){
        super(name);
    }
}
