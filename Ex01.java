import java.util.Scanner;
public class Ex01{
    public static void main(String[] args){
        System.out.println("Ange din Namn");
        Scanner input = new Scanner(System.in);
        String namn = input.nextLine();
        System.out.println(namn.length());
        
    }
}