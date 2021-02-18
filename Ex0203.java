
public class Ex0203 {

	

	public static void main(String[] args) {
		String word = "noon";
		boolean isPalidrome = true;
		for(int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == word.charAt(word.length()-i-1)) {
				
			} else {
				isPalidrome = false;
			}
		}
		System.out.println(word);
		if(isPalidrome == true) {
			System.out.println("The word is a palindrome");
		}else {
			System.out.println("The word is not a palindrome");
		}
		}

}
