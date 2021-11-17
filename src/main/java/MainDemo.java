import utilll.ArithmeticUtils;

class MainDemo
{
	public static void main(String[] args)  
	{
		
		int a = 10;
		int b = 40;
		int c = 57;
		int res;
		
		res = ArithmeticUtils.gcd(a, b);
		System.out.println(1);
		
		res = ArithmeticUtils.gcd(a, c);
		
		
		res = ArithmeticUtils.gcd(c, b);
		
		
		
		a = 10;
		b = 40;
		c = 57;
		
		res = ArithmeticUtils.lcm(a, b);
		
		
		res = ArithmeticUtils.lcm(a, c);
		
		
		res = ArithmeticUtils.lcm(c, b);
		
		
		
		a = 5;
		b = 8;
		c = 9;
		
		res = ArithmeticUtils.pow(a, b);
		
		
		res = ArithmeticUtils.pow(a, c);
		
		
		res = ArithmeticUtils.pow(c, b);
		
	}
}
