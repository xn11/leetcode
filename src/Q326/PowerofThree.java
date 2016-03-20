package Q326;

/*
 * 判断是否为3的次方
 * Given an integer, write a function to determine if it is a power of three.
Follow up:
Could you do it without using any loop / recursion?
 * */
public class PowerofThree {
	public static boolean isPowerOfThree(int n) {
		double res = Math.log10(n) / Math.log10(3);
		return res == (int) res;
	}

	public static void main(String[] args) {
		System.out.print(isPowerOfThree(9));

	}

}
