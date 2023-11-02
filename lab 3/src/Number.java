import java.io.IOException;
/**
 * <b> Сложение двух чисел </b>
 * Класс Number реализует сложение
 * двух заданных целых чисел и выводит
 * результат на экран.
 *
 * @author Mitryukhin Igor'
 * @version 1.0
 * @since 2023-10-11
 * */
public class Number {


    /**
     * Метод используется для сложения двух целых чисел. Это
     * простейшая форма метода класса, просто чтобы
     * показать использование различных тегов javadoc.
     * @param numberFirst - первый параметр метода sum
     * @param numberSecond - второй параметр метода sum
     * @return int - тип возвроащаемого значения суммы numberFirst и numberSecond.
     * */


    public int sum(int numberFirst, int numberSecond)
    {return numberFirst+numberSecond;}

    /**
     * Это основной метод, использующий метод sum.
     * @param args Не используется.
     * @exception IOException При ошибке ввода.
     * @see IOException
     */

    public static void main(String args[]) throws IOException{
        Number number= new Number();
        int sum=number.sum(50, 50);
        System.out.println("Суммой 50 и 50 является :"+sum);

    }



}