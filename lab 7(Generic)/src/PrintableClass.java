interface Printable{
    void  print();
}

public class PrintableClass {
    public static void main(String[] args){
        Printable printable=new Printable() {
            @Override
            public void print() {
                System.out.println("I am printing");
            }
            public void printAnon() {
                System.out.println("I am anon");
            }
        };
        printable.print();

    }
}
