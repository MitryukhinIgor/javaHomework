import java.lang.String;

import java.util.Date;

public class Reader {
    String name;
    String lastName;
    String patronymic;

    int ticket;
    String faculty;
    Date birthday;
    int phoneNumber;

    public Reader(String name,String lastName,String patronymic){
        this.name=name;
        this.lastName=lastName;
        this.patronymic=patronymic;
    }
    public void takeBook() {
    }

    public void returnBook() {
    }

    public void takeBook(int value) {
        System.out.println(name + " " + patronymic + " " + lastName + " взял " + value + " книг(и)");
        System.out.println(" ");
    }

    public void takeBook(String... value) {
        System.out.println(name + " " + patronymic + " " + lastName + " взял книги: ");
        for (String a : value)
            System.out.print(a + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void takeBook(Book... value) {
        System.out.println(name + " " + patronymic + " " + lastName + " взял книги: ");
        for (Book a : value)
            System.out.print("'" + a.bookname + "' " + a.authorName + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void returnBook(int value) {
        System.out.println(name + " " + patronymic + " " + lastName + " вернул " + value + " книг(и)");
        System.out.println(" ");
    }

    public void returnBook(String... value) {
        System.out.println(name + " " + patronymic + " " + lastName + " вернул книги: ");
        for (String a : value)
            System.out.print(a + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void returnBook(Book... value) {
        System.out.println(name + " " + patronymic + " " + lastName + " вернул книги: ");
        for (Book a : value)
            System.out.print("'" + a.bookname + "' " + a.authorName + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Reader[] readers=new Reader[5];
        readers[0]=new Reader("Василий","Петров","Васильевич");
        readers[1]=new Reader("Иван","Иванов","Иванович");
        readers[2]=new Reader("Степанов","Степан","Степанович");

        Book booking=new Book("Война и мир","Толстой");
        Book bookingFirst=new Book("Мастер и Маргарита","Булгаков");
        Book bookingSecond=new Book("Капитал","Маркс");

        readers[0].returnBook(booking);
        readers[1].returnBook(2);
        readers[2].takeBook(3);
        readers[0].takeBook("Словарь");
        readers[1].takeBook(booking,bookingFirst,bookingSecond);
    }

}