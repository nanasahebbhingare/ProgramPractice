package geeksforgeeks;

public class TrappingRainWater {
	public static void main(String[] args) {
		// int input[] = { 2, 0, 2 };
		// int input[] = { 3, 0, 2, 0, 4 };
		// int input[] = { 3, 0, 2, 0};
		int input[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trappingRainWater(input));
	}

	private static int trappingRainWater(int[] input) {
		int trapWaterCnt = 0, leftMax = 0, rightMax = 0;
		for (int i = 0; i < input.length; i++) {
			rightMax = input[i];
			for (int j = i + 1; j < input.length; j++) {
				if (rightMax < input[j]) {
					rightMax = input[j];
				}
			}
			leftMax = input[i];
			for (int k = i; k >= 0; k--) {
				if (leftMax < input[k]) {
					leftMax = input[k];
				}
			}
			trapWaterCnt += Math.min(rightMax, leftMax) - input[i];
		}
		return trapWaterCnt;
	}
}
