import java.util.Random;

public class Ex07 {
    public static void main(String[] args){
    Random randomValeu = new Random();
    double sum = 0;
    double[] arr = new double[10];
    
    for (int i = 0; i <= 10; i++) {
        double value = randomValeu.nextInt(11);
        arr[i] = value;
        sum += arr[i];
        System.out.println("Value at array index " + i + " = " + arr[i]);
        System.out.println("Sum of the values in the array so far = " + sum);
    }
    double avg = (sum / arr.length);
    System.out.println("\n=======================");
    System.out.println("Total sum = " + sum + ".");
    System.out.format("The average of the values in the array = %.2f", avg);

}

}
