import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //создал 1 рюкзак
        ArrayList<Object>backpack1 = new ArrayList<>();
        for (int i = 0;i<20;i++){
            backpack1.add(new Apple());
        }
        backpack1.add(new Book());
        backpack1.add(new CocaCola());
        System.out.println("Первый Рюкзак " + backpack1);

        // создал 2 рюкзак
        ArrayList<Object>backpack2 = new ArrayList<>();
        for (int i = 0;i<50;i++){
            backpack2.add(new TennisBall());
        }
        backpack2.add(new Papka());
        backpack2.add(new WaterBottle());

        System.out.println("Второй Рюкзак " + backpack2);


        // создал 3 рюкзак
        ArrayList<Object>backpack3 = new ArrayList<>();
        for (int i = 0;i<10;i++){
            backpack3.add(new Apple());
        }
        for (int i = 0;i<3;i++){
            backpack3.add(new TennisBall());
        }
        backpack3.add(new Papka());
        backpack3.add(new CocaCola());

        System.out.println("Третий Рюкзак " + backpack3);
    }
}
