import java.util.stream.*;
import java.util.*;
import java.util.function.*;
public class Main {
    public static void main(String[] args) {
        ////////////////////////////
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number;
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            number = rand.nextInt() % 100;
            numbers.add(number);
        }
        System.out.println(numbers);
        Stream<Integer> st = numbers.stream();

        Predicate<Integer> t;
        t = (numbersOfPars) -> (numbersOfPars % 2) == 0;
        Stream<Integer> resStream = st.filter(t);
        System.out.println("numbersOfPars = " + resStream.count());
        int numbersOfPars2 = (int) (numbers.stream().filter((n) -> (n % 2) == 0)).count();
        System.out.println("numbersOfPars2 = " + numbersOfPars2);

        System.out.println(" ");
        ////////////////////
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> surname = new ArrayList<String>();
        surname.add("Ivanov");
        surname.add("Jordan");
        surname.add("Smith");
        surname.add("Jarvis");


        System.out.println("Фамилии=" + surname);

        Predicate<String> fn;
        fn = (str) -> {
            if (str.charAt(0) == 'J')
                return true;
            return false;
        };
        Stream<String> stream = surname.stream();
        Stream<String> result = stream.filter(fn);


        System.out.println(" ");

        ////////////////////
        String[] AS = {
                "abcd", "bcfk", "def", "jklmn", "jprst",
                "afc", "ambn", "kmk", "rbd", "jus"
        };
        ArrayList<String> AL = new ArrayList<String>(AS.length);
        for (int i = 0; i < AS.length; i++)
            AL.add(i, AS[i]);
        Stream<String> stream1 = AL.stream();
        Stream<String> streamSorted = stream1.sorted();
        Consumer<String> action = (str) -> {
            System.out.print(str + " ");
        };
        streamSorted.forEach(action);
        Comparator<String> comparator;

        comparator = (str1, str2) -> {
            return str2.compareTo(str1); // <0, ==0, >0
        };
        stream1 = AL.stream();
        Stream<String> streamSortedDesc = stream1.sorted(comparator);
        System.out.println(" ");
        System.out.println("-----------------------");
        streamSortedDesc.forEach(action);

        System.out.println(" ");
        System.out.println(" ");

        // Блок 2

        ////////////////////////
        System.out.print("Задача 1 ");
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(getEvenNumbersPro(list));

        System.out.println(" ");

        ////////////////////////
        System.out.print("Задача 2 ");
        List<String> names = List.of("Egor", "Max", "Ivan", "Petr", "Patric");
        List<String> outputNames = new ArrayList<String>();
        names.stream().filter(name -> name != "").map(name -> name.toUpperCase()).forEach(outputNames::add);
        System.out.println(outputNames);
        System.out.println(outputNames.stream().filter(name -> name.charAt(0) == 'M').count());
    }

    public static List<Integer> getEvenNumbersPro(List<Integer> inputList) {
        List<Integer> outputList = new ArrayList<Integer>();
        inputList.stream().filter((number) -> (number % 2) == 0).forEach(outputList::add);
        return outputList;
    }

}