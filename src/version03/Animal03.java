package version03;

public abstract class Animal03 {
    private String name;
    private int life;

    //Constructor
    Animal03(){
        this.name = "Xxx";
        this.life = 1;
    }
    Animal03(String name){
        this.name = name;
        this.life = 3;
    }
    Animal03(String name,int life){
        this.name = name;
        this.life = (life<5) ? life : 5;
    }

    //getter and setter.
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    //methods
    protected void drink(){
        System.out.println("Animal drinking....");
    }
    //to be Override
    protected abstract void eat();
}
