package Seminars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// Дан массив путей, где пути [i] = ["Город А", "Город Б"] означают, что существует прямой путь
// из города А в город Б

public class Task05_2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        {
            map.put("Москва", "Самара");
            map.put("Курск", "Пенза");
            map.put("Самара", "Курск");
        }
        System.out.println(getFinalCity(map));
    }


    public static String getFinalCity(Map<String, String>map){
        List<String>arr = new ArrayList<>(map.values());
        for (String i: arr ){
            if (map.containsKey(i)) {
                continue;
            }
            return i;
        }
        return "";
    }
}


