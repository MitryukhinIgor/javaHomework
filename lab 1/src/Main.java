/*public class Main {
    public static void main(String[] args) {//записать числа от 0 до 300, которые делятся 4 не делятся на 6 и сумма цифр которых меньше 10
        for(int i=0; i<=300; i++) {
            if (i % 4 == 0 && i % 6 !=0) {
                int sum = 0 ;
                int j,k,z;
                j = i/100;
                sum += j;
                k = i%100/10;
                sum+=k;
                z = i%100%10;
                sum+=z;
                if ( sum<10){
                    System.out.println(i);
                }

            }

        }

    }
}
*/
/*
public class Main {
    public static void main(String[] args) {//вернуть два средних знака строки
        String s = "kuba";
        int index = s.length() / 2;
        System.out.println(String.valueOf(s.charAt(index-1))+String.valueOf(s.charAt(index)));
    }
}
*/
/*
public class Main {
    public static void main(String[] args){//найти слово в строке,количество различных символов которого минимаально
        String S = "afa 232 421 ttt";
        char s = ' ';
        for(int i=0;i <S.length();i++){

             if(S.charAt(i)==s) {

             };

        }
    }
}
*/
/*
public class Main {


private static int diffWords(String st){ // число уникальных символов
StringBuffer u = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
String c; // текущий символ в строке
for (int i=0;i<st.length();i++) { // обход строки
c = String.valueOf(st.charAt(i)); // получить текущий символ
if (u.indexOf(c)==-1) // символ еще не встречался
u.append(c); // добавляем
}

return u.length(); // возвращаем длину получившейся строки
}

public static void main(String[] args) {
String[] a = {"Something", "abcdefghijklmnopq", "aaaaa","WHATEVER","..."};
String goal = a[0]; // искомое слово
System.out.println("Массив: ");
for (int i=1;i<a.length;i++){
System.out.print(a[i]+", "); // выводим очередной элемент
if ( diffWords(a[i])<diffWords(goal))
goal = a[i]; // новый мин.эл
}
System.out.println("");
System.out.println("Искомое слово: "+goal+", число разных символов: "+diffWords(goal));
}
}
*/
