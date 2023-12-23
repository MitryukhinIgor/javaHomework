package Adapter;

class BerryAdapter implements Fruit {
    private Berry berry;

    public BerryAdapter(Berry berry) {
        this.berry = berry;
    }

    @Override
    public void eat() {
        berry.consume();
    }
}
