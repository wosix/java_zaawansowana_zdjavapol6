package examples;

import java.util.*;

public class CollectionExamples {
    public static void main(String[] args) {

        List<String> textList = new ArrayList<>();

        textList.add("ala");
        textList.add("ma");
        textList.add("kota");

        for(String text : textList){
            System.out.println(text);
        }


        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("ktos tam","1356");
        phoneBook.put("ktos inny","2453");
    }
}
