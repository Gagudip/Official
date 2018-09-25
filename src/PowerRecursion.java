
public class PowerRecursion {

	static double Power(int base, int pow) {

		if (pow == 0)
			return 1;

		else {
			
			if(pow<0)
				return 1/Power(base,-pow);
		
			
			
			if(pow>0)
			return (base * Power(base, pow - 1));
		
		
			
		}
		
		return pow;
	}

	public static void main(String[] args) {

		System.out.println(Power(2, -4));

	}

}
