package main.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {

        // for (Days d : Days.values())
        //System.out.println(d);

        //Days f = Days.FRIDAY;

        //System.out.println(f.ordinal());

//
        //System.out.println(LoginPassCheck.checkLoginInfo("Nadiia","Yatsiuk", "Yatsiuk"));

//        HashSet <String> myHashSet = new HashSet <String>();
//        myHashSet.add("Dog1");
//        myHashSet.add("Dog1");
//        myHashSet.add("Dog3");
//        myHashSet.add("Cat1");
//        myHashSet.add("Cat2");
//        myHashSet.add("Cat3");
//        System.out.println(myHashSet);


        HashMap<String, String> map = new HashMap<>();
        map.put("apple", "fruit");
        map.put("orange", "fruit");
        map.put("tomato", "vegetable");
        map.put("potato", "vegetable");
        map.put("strawberry", "fruit");
        map.put("cabbage", "vegetable");
        map.put("lime", "fruit");
        map.put("lettuce", "vegetable");
        map.put("cherry", "fruit");
        map.put("zucchini", "vegetable");


        Set<Map.Entry<String, String>> setValue= map.entrySet();

        Iterator <Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            String type = entry.getValue();

            if (type.equals("fruit"))
                itr.remove();

            System.out.println(map.entrySet());

        }







            }
        }







