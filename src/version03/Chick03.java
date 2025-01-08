package version03;

public class Chick03 extends Animal03{
    @Override
    protected void eat(){
        System.out.println("Override Chick eat");
    }

    protected void layEggs(){
        System.out.println("laying eggs..");
    }
    Chick03(String name){
        super(name);
    }
}
