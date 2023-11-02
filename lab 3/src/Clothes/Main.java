package Clothes;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothingArray = new Clothes[3];
        clothingArray[0] = new TShirt(Size.M, 50, Color.RED);
        clothingArray[1] = new Trousers(Size.L, 120, Color.BROWN);
        clothingArray[2] = new Skirt(Size.S, 80, Color.BLACK);

        Studio atelier = new Studio();
        atelier.dressWomen(clothingArray);
        atelier.dressMen(clothingArray);
    }
}