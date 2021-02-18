
public class Ex15 {

	public static void main(String[] args) {
		int sum = 0;
		int counter = 0;
		
		do {
			if(counter % 2 ==0) {
				System.out.println(counter);
				//sum += counter * counter;
			}
			counter++;
		} while (counter <= 20);
	
		
		//System.out.println(sum);
	}

}
