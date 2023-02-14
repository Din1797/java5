// Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
// Изменить значения дописав восклицательные знаки.
// *Создать TreeMap, заполнить аналогично.
// *Увеличить количество элементов до 1000 случайными ключами и общей строкой.
// **Сравнить время последовательного и случайного перебора тысячи элементов словарей.

import java.util.HashMap;
import java.util.TreeMap;

public class dz5 {
    public static void main(String[] args) {
        //Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "black");
        System.out.println(map);
        //Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        map.put(2, "white");
        map.put(3, "blue");
        System.out.println(map);
        //Изменить значения дописав восклицательные знаки.
        map.put(1, "black!");
        map.put(2, "white!");
        map.put(3, "blue!");
        System.out.println(map);
        //*Создать TreeMap, заполнить аналогично.
        TreeMap<Integer,String> trm = new TreeMap();
        trm.put(1, "black!");
        trm.put(2, "white!");
        trm.put(3, "blue!");
        System.out.println(trm);
        //*Увеличить количество элементов до 1000 случайными ключами и общей строкой.
        for (int i = 0; i < 1000; i++){
            map.put(i, "");
        }
        for (int a = 0; a < 1000; a++){
            trm.put(a, "");
        }
        System.out.println(map);
        System.out.println(trm);
        //**Сравнить время последовательного и случайного перебора тысячи элементов словарей.
        long start1 = System.currentTimeMillis();
        for (Integer key: map.keySet())
            map.get(key);
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        for (Integer key: trm.keySet())
            trm.get(key);
        long end2 = System.currentTimeMillis();
        System.out.println("Время перебора map: " + (end1 - start1));
        System.out.println("Время перебора trm: " + (end2 - start2));
    }
}