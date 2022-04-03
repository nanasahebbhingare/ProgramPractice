package patternprograms;
/**
 * Number Pyramid Pattern.
 *				1
 *			2	3	2
 *		3	4	5	4	3
 *	4	5	6	7	6	5	4
 *
 * @author Bhingare Nanasaheb.
 *
 */
public class NumberPyramidPattern {
	public static void main(String[] args) {
		int n = 4;
		int value = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print("\t");
			}
			System.out.print(i);

			for (int j = 1; j <= (i - 1); j++) {
				value = (i + j);
				System.out.print("\t" + value);
			}

			for (int j = 1; j <= (i - 1); j++) {
				value -= 1;
				System.out.print("\t" + value);
			}
			System.out.println();
		}
	}
}
