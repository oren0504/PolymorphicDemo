package version02;

public class Dog02 extends Animal02 implements Swim02{
    @Override
    public void swim(){
        System.out.println("dogSwimming...");
    }

    //Overwrite
    protected void eat(){
        System.out.println("dogEating...");
    }
    protected void lookHome(){
        System.out.println("guarding...");
    }

    Dog02(String name,int age,Color color){
        super(name, age, color);
    }
}
