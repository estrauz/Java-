import java.util.HashMap;

public class Homework6 {
    
    public static void main (String[] args){
        add(9);
        add(15);
        add(24);
        add(225);
        add(209);

        System.out.println(Collections.keySet());
    }

    private static HashMap<Integer, Object> Collections = new HashMap<>();

    private static final Object element = new Object();

    public static void add(Integer numbers){
        Collections.put(numbers, element);
    }

    

    

}