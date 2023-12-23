package Factory;

public class Main {
    public static void main(String[] args) {
        Food food1 = Factory.getFood(FoodType.BERRIES);
        System.out.println(food1 instanceof Berries);
        Food food2 = Factory.getFood(FoodType.FRUITS);
        System.out.println(food2 instanceof Fruits);

    }
}