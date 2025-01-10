package version03;

import javax.security.auth.callback.ConfirmationCallback;
import java.util.*;
import java.util.stream.Collectors;

public class PolymorphicDemo03 {

    private static int gameRound;

    static ConfirmState confirmState;
    private enum ConfirmState{
        Y,N,
    }
    static Master03 master;
    static Animal03[] animal03s;

    static {
        System.out.println("想玩几局？");
        Scanner scanner = new Scanner(System.in);
        try{
            gameRound = scanner.nextInt();
            gameRound = gameRound>0 ? gameRound : -1;

            while (gameRound == -1){
                System.out.println("不想玩就爬。");
                gameRound = scanner.nextInt();
                gameRound = gameRound>0 ? gameRound : -1;
            }
        }catch (Exception e){
            System.out.println("别玩了。");
        }

    }

    private static void setUp(){
        master = new Master03();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要创建的动物个数：");
        int num = 0 ;

        try{
            num = scanner.nextInt();
            num = num>0 ? num : -1 ;
            while (num==-1){
                System.out.println("请给出正整数。");
                System.out.println("请输入你要创建的动物个数：");
                num = scanner.nextInt();
                num = num>0 ? num : -1 ;
            }
        }catch (Exception e){
            System.out.println("异常。");
            num = 0;
        }



        animal03s = new Animal03[num];
        Random random = new Random();
        for (int i = 0; i < animal03s.length; i++) {
            num = random.nextInt(20)+1;
            if (num<=8){
                animal03s[i] = new Dog03(String.format("Puppy%d\t",i+1));
            }else if (num<=14){
                animal03s[i] = new Chick03(String.format("chick%d\t",i+1));
            }else{
                animal03s[i] = new Fish03(String.format("fishy%d\t",i+1));
            }
        }
        System.out.println("加载完成。");
    }

    private static void printAll(){
        for (Animal03 animal : animal03s
        ) {
            System.out.print(animal.getName()+" ");
            animal.eat();
            animal.drink();

            if (animal instanceof Dog03){
                ((Dog03) animal).lookHome();
            }else if(animal instanceof Chick03){
                ((Chick03) animal).layEggs();
            }

            if (animal instanceof Swim03){
                ((Swim03) animal).swim();
            }
            System.out.println();
            System.out.println("完成全部检查。");
            System.out.println();
        }

    }

    public static void main(String[] args) {

        for (int a = 1; a <= gameRound; a++) {
            System.out.printf("第%d局游戏开始了。。。\n",gameRound);
            setUp();
            printAll();

            List<Animal03> dynamicList = Arrays.asList(animal03s);

            List<String> strOut = dynamicList
                    .stream()
                    .filter(i -> i instanceof Swim03)
                    .map(i ->{
                                if (i instanceof Dog03) {
                                    System.out.print(i.getName()+"开始工作 -> ");
                                    ((Dog03) i).lookHome();
                                }

                                return
                                        i.getName().toUpperCase(Locale.ROOT)+" filtered by stream";
                            }
                    )
                    .collect(Collectors.toList());

            System.out.println();
            strOut.forEach(i -> System.out.println(i));

            Scanner scanner = new Scanner(System.in);
            System.out.print("你是否选择喂养所有动物？\n\t\t[Y] / [N]\n");

            while (true){
                try{
                    String confirmInput = scanner.nextLine();

                    if (confirmInput.length()!=1) continue;

                    if (            ConfirmState.Y.toString().charAt(0) == confirmInput.charAt(0)
                    ){
                        dynamicList.forEach( i -> master.feed(i));
                        break;
                    }else if (      ConfirmState.N.toString().charAt(0) == confirmInput.charAt(0)
                    ){
                        break;
                    }else ;

                }catch (Exception e) {
                    System.out.println("异常");
                    System.out.println("\t\t[Y] / [N]");
                }

            }

            System.out.printf("第%d局结束。",a);

        }
    }

}
