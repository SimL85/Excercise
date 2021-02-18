import java.util.Random;

public class Ex11 {
    public static void main(String[] args){
        int[] arr = new int[30];
        Random randomInt = new Random();
        for (int i = 0; i <= 30;i++){
            int value = randomInt.nextInt(11);
            arr[i] = value;
            System.out.println("Value at array index " + i + " = " + arr[i]);
            
        }

    }
}
