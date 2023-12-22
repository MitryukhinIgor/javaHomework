import java.io.Serializable;
class Animal{}
class Cat extends Animal implements Serializable{}

public class GenericClass<T extends String,V extends Animal,K extends Number> {
    private T ComparableT;
    private V SerializableV;
    private K NumberK;

    public GenericClass(T ComparableT, V SerializableV, K NumberK) {
        this.ComparableT = ComparableT;
        this.SerializableV = SerializableV;
        this.NumberK = NumberK;
    }

    public T getComparableT() {
        return ComparableT;
    }

    public V getSerializableV() {
        return SerializableV;
    }

    public K getNumberK() {
        return NumberK;
    }
    public void showTypes(){
        System.out.println("Type of T: "+ ComparableT.getClass().getName());
        System.out.println("Type of V: "+ SerializableV.getClass().getName());
        System.out.println("Type of K: "+ NumberK.getClass().getName());
    }

    public static void main (String[] args){
        GenericClass<String,Cat,Integer> Cat=new GenericClass<>("mow", new Cat(),10);
        Cat.showTypes();
    }


}
