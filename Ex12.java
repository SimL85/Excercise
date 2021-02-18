
public class Ex12 {

	public static void main(String[] args) {
		double sum = 0;
		int counter = 0;
		double avg = 0;
		int totalOfNumber = 20;
		
		while (counter < 20) {
			sum += counter + 1;
			counter++;
		}
		avg = sum / totalOfNumber;
		System.out.println(sum);
		System.out.println(avg);

	}

}
