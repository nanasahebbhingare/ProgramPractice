package geeksforgeeks;

public class SubStringProblem {
	public static void main(String[] args) {
		String str = "abc";
		int arrayLength = str.toCharArray().length;
		System.out.println("SubString Cnt :- " + (arrayLength * (arrayLength + 1) / 2));
		/*for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}*/
		char[] strArray = str.toCharArray();
		for (int i = 0; i < arrayLength; i++) { // 3 time executed
			for (int j = i; j < arrayLength; j++) { //
				String strOutput = "";
				for (int k = j; k < arrayLength; k++) {
					strOutput+=strArray[k];
				}
				System.out.println(strOutput);
			}
		}
	}
}