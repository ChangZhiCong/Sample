package javaapplication14;

import java.util.*;

public class JavaApplication14 {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();
        table.put("100", "Spongebob");
        table.put("321", "Patrick");
        table.put("777", "Sandy");
        
        //table.remove(321);
        for(String key : table.keySet()){
            System.out.println(key.hashCode() % Integer.MIN_VALUE + "\t" + key + "\t" + table.get(key));
        }
    }
}
