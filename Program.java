import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Chocolate chocolate1 = new Chocolate("Milka", 31, 100);
        Chocolate chocolate2 = new Chocolate("Ritter Sport", 33, 50);
        Chocolate chocolate3 = new Chocolate("Alpen Gold", 32, 100);
        Chips chips1 = new Chips("Lays", 17, 100);
        Chips chips2 = new Chips("Бульба", 20, 100);
        Crackers crackers1 = new Crackers("Flint", 7, 40);
        Crackers crackers2 = new Crackers("Кириешки", 9, 50);

        List <Snacks> snacks = new ArrayList<>();
        snacks.add(chocolate1);
        snacks.add(chocolate2);
        snacks.add(chocolate3);
        snacks.add(chips1);
        snacks.add(chips2);
        snacks.add(crackers1);
        snacks.add(crackers2);

        VendingMachine vendingMachine = new VendingMachine(snacks);
        Chocolate chocolateResult = vendingMachine.getChocolate("Milka");
        if (chocolateResult != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.toString());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }

    }
}