interface Cookable{
    void cook(String str);
}
class Food{
    public void prepare(Cookable c, String str)
    { c.cook(str);}
    public static void main (String[] args){
        Food dish=new Food();
        Cookable c= new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Cooking "+ str);
            }
        };
        dish.prepare(c, "ready");
    }
}
public class CookableClass {}
