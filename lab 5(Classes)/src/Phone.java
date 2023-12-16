import java.lang.String;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит {" + name + "}");
    }


    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит {" + name + "}" + number);
    }

    public void sendMessage(int... numbers) {
        for (int number : numbers)
            System.out.print(number + " ");
    }

    public static void main(String[] args) {

        Phone Samsung =new Phone(345,"23-S",200);
        Phone iPhone =new Phone(123,"12",180);
        System.out.println("Samsung: " + Samsung.getNumber() + " " + Samsung.getModel() + " " + Samsung.getWeight() + " ");
        System.out.println("iPhone: " + iPhone.getNumber() + " " + iPhone.getModel() + " " + iPhone.getWeight() + " ");

        Samsung.receiveCall("Work");
        Samsung.getNumber();
        iPhone.receiveCall("Home");
        iPhone.getNumber();

    }
}