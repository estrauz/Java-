public class Homework2 {
        static String str1 = "Monster";
        static String str2 = "Bird";
        static String str3 = "Bon appitite";
    
        public static void main(String[] args) {
            System.out.println(str1.contains(str2));
            System.out.println();
        }
    
        public static boolean word(String str1, String str2) {
            word(str1, new StringBuilder(str2).reverse().toString());
            return true;
        }
    
        public static void valueOF() {
            int a = 3;
            int b = 56;
            int c = a + b;
            int d = a - b;
            int e = a * b;
            System.out.println(("3+56") + " = " + String.valueOf(c));
            System.out.println(("3-56") + " = " + String.valueOf(d));
            System.out.println(("3*56") + " = " + String.valueOf(e));
        }
    
        public static void reverseString(String str1) {
            StringBuilder stringBuilder = new StringBuilder(str1);
            stringBuilder.reverse();
            System.out.println(stringBuilder);
        }
    
        public static void append(String str1) {
            StringBuilder str3 = new StringBuilder();
            str3.append("GB = good company...");
            System.out.println(str3);
            System.out.println();
            str3.insert(str3.length() / 4, " равно ");
            str3.deleteCharAt(3);
            System.out.println(str3);
        }
    
        public static void replace() {
            String str4 = new String("i am = good");
            System.out.println(str4.replace('=', ' '));
            double begin = System.currentTimeMillis();
            for (int i = 0; i <= 10000; i++) {
                str4 += Character.getName(i);
            }
            System.out.println(System.currentTimeMillis() - begin);
            begin = System.currentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <= 10000; i++) {
                stringBuilder.append(Character.getName(i));
            }
            System.out.println(System.currentTimeMillis() - begin);
        }
    }
    
    
    
    
    
    
}
