
public class EfficientPowerRecursion {
	public static double pow(int a, int n) {
		if (n == 0) {
			return 1.0;
		}
		if (n < 0) {
			if (a == 0)
				throw new IllegalArgumentException("Number can't be zero to the power something");

			return 1 / pow(a, -n);
		}

		else {

			double powerOfHalfN = pow(a, n / 2);

			double[] factor = { 1, a };

			return factor[n % 2] * powerOfHalfN * powerOfHalfN;
		}
	}

	public static void main(String[] args) {

		System.out.println(pow(0, 3));

	}

}
