import java.util.HashMap;

public class Homework6 {
    
    public static void main (String[] args){
        add(9);
        add(15);
        add(24);
        add(225);
        add(209);

        // Выводим множество в консоль
        
        System.out.println(Collections.keySet());
        for(Integer keys : Collections.keySet()){
            System.out.println(keys);
        
        
        }
    }
    // Создаем множество с ключем, но без значения
    private static HashMap<Integer, Object> Collections = new HashMap<>();

    private static final Object value = new Object();

    public static void add(Integer keys){
        Collections.put(keys, value);
    }

         

      

    
        

       

}