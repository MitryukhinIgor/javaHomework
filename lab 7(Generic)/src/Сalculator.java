public class Сalculator {

    public static <T extends Number,V extends Number> double sum(T x, V y){
        return x.doubleValue()+y.doubleValue();
    }

    public static <T extends Number,V extends Number> double sub(T x, V y) {
        return x.doubleValue()-y.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double div(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }
    public static void main(String[] args) {

        Сalculator a = new Сalculator();
        System.out.println(a.sum(5,1.1));
        System.out.println(a.sub(1,0));
        System.out.println(a.multiply(2,0));
        System.out.println(a.div(5,3));
    }


}