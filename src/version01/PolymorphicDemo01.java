package version01;

public class PolymorphicDemo01 {
    public static void main(String[] args) {
        Animal01[] animal01s = new Animal01[3];
        animal01s[0] = new Dog01("Bruce", 4, Animal01.Color.BLACK);
        animal01s[1] = new Chick01();
        animal01s[1].setName("Chicky");
        animal01s[2] = new Fish01();
        animal01s[2].setName("Fishy");

        for (Animal01 animal01 : animal01s
             ) {
            System.out.println(animal01.getName());
            animal01.eat();
            animal01.drink();

            if (animal01 instanceof Dog01){
                ((Dog01) animal01).lookHome();
            }else if(animal01 instanceof Chick01){
                ((Chick01) animal01).layEggs();
            }else if(animal01 instanceof Fish01){
//                ((Fish01) animal01).swim();
            }else{
                System.out.println("Declare Failed.");
            }

            if (animal01 instanceof Swim01) ((Swim01) animal01).swim();

            System.out.println();
        }

        Master01 master = new Master01();
        for (Animal01 ani : animal01s
             ) {
            master.feed(ani);
        }

    }
}
