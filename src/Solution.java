import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            strings.add(0, strings.remove(strings.size() - 1));
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}