package version02;

import java.util.Scanner;

public class PolymorphicDemo02 {
    static Animal02[] animal02s;
    static Master02 master;

    static {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你要创建的动物个数：");
        int num = scanner.nextInt();
        animal02s = new Animal02[num];

        for (int i = 0; i < num; i++) {
            switch (i%3){
                case 0:
                    animal02s[i] = new Dog02("Bob"+i,1+i, (i%2)==0 ? Animal02.Color.Black : Animal02.Color.White );
                    break;
                case 1:
                    animal02s[i] = new Chick02();
                    break;
                case 2:
                    animal02s[i] = new Fish02();
                    break;
            }
        }

        master = new Master02();
        System.out.println("加载完成。");
    }

    public static void main(String[] args) {
        for (Animal02 animal : animal02s
             ) {
            System.out.print(animal.getName()+"\t");
            animal.eat();
            animal.drink();

            if (animal instanceof Dog02){
                ((Dog02) animal).lookHome();
            }else if (animal instanceof Chick02){
                ((Chick02) animal).layEggs();
            }else if (animal instanceof Fish02){

            }else {
                System.out.println("类型不匹配。");
            }

            if (animal instanceof Swim02) ((Swim02) animal).swim();
            //换行
            System.out.println();
        }

        for (Animal02 ani : animal02s
              ) {
            master.feed(ani);

        }

    }
}
