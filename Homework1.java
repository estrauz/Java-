import java.util.Arrays;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        Random rnd = new Random();
        int i = new Random().nextInt(0,2000);
        System.out.printf("i = %d \n", i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = Integer.toBinaryString(i).len();
        System.out.printf("n = %d \n", n);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int size = 0;
            for (int j = i; j < Short.MAX_VALUE; j++) {  // Чтобы найти элементы массива m1
                if (j %  n == 0) {
                    size++;
                }
            }
        int[] m1 = new int[size];
        size = 0;
            for (int j = i; j < Short.MAX_VALUE; j++) {  // Чтобы посчитать кратные m1
                if (j % n == 0) {
                    m1[size++] = j;
                }
            }


        System.out.print("m1 = ");
        System.out.println(Arrays.toString(m1));

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        int size1 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {  // Чтобы найти элементы массива m2
            if (j %  n != 0) {
                size1++;
            }
        }
        int[] m2 = new int[size1];
        size1 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {  // Чтобы посчитать некратные m2
            if (j % n != 0) {
                m2[size1++] = j;
            }
        }
        System.out.print("m2 = ");
        System.out.println(Arrays.toString(m2));



    }
}

