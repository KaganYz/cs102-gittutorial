/**
 * arrayhw
 */
import java.util.Random;
public class arrayhw {

    public static void main(String[] args) {
        final int ARRAY_SIZE = 7;
        Random rd = new Random();
        int [] array = new int [ARRAY_SIZE];

        for (int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(101);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
    }
}
}