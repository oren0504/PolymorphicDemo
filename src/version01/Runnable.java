package version01;

public interface Runnable {
    default void run(){
        if (hasLegs(this)){
            System.out.println(((Animal01)this).getName()+" is running..");
        }else{
            System.out.println(((Animal01)this).getName()+" doesn't have legs.");
        }
    }

    static boolean hasLegs(Object ani){
        if (ani instanceof version01.Dog01  || ani instanceof version01.Chick01) return true;
        return false;
    }
}
