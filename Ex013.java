
public class Ex013 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
				//modulus (mod) % = 0
				// 10 / 2 = 5 (0)
			}
		}
		
		System.out.println(sum);
	}

}
