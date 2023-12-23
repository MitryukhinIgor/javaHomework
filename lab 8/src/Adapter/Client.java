package Adapter;

public class Client {
    public static void main(String[] args) {
        Berry berry = new Berry();
        Fruit fruitAdapter = new BerryAdapter(berry);
        fruitAdapter.eat();
    }
}