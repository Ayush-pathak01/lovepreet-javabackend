// import java.util.List;
// import java.util.ArrayList;       = import java.util.* means you are importing all public classes and interfaces from the java.util package into your Java program. This allows you to use those classes by their simple names (like Scanner) instead of their fully qualified names (like java.util.Scanner).

import java.util.*; 

public class Test { 
    public static void main(String[] args) { 
        List<Integer> arr = new ArrayList<>(); 
        Map <String,Integer> marks = new HashMap<>();
        marks.put("rahul",100);
        marks.put("simmy",200);


        for(Map.Entry<String , Integer> entry:marks.entrySet()){
            System.out.print(entry.getKey()+"-----------");
            System.out.println(entry.getValue());
            System.out.println("-------------");
        }

    }}
            
