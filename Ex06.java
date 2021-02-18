import java.util.Random;
public class Ex06 {
    public static void main(String[] args) {
        int counter = 0;
        Random random = new Random();

        do{
            System.out.println("iteration number :"+counter+"\t"+random.nextInt(11));
            counter ++;
        } while (counter <= 10);
    }   
}
