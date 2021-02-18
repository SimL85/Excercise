import java.util.Random;

public class Ex18 {

	public static void main(String[] args) {
		int[] Arr= new int[10];
		int counter = 0;
		int greatest = -100;
		Random randomInt = new Random(); 
		
		while (counter < Arr.length) {
			int value = randomInt.nextInt(100);
			Arr[counter] = value;
			System.out.println(Arr[counter]);
			if (Arr[counter] > greatest) {
				greatest = Arr[counter];
			}
			counter++;
		}
		System.out.println(greatest);
	}

}
