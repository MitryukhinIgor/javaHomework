package Factory;

public class Factory {

    public static Food getFood(FoodType type) {
        switch (type) {
            case BERRIES:
                return new Berries();
            case FRUITS:
                return new Fruits();
            default:
                return new Food();

        }
    }
}