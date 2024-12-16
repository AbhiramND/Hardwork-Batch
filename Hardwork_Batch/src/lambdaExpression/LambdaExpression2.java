package lambdaExpression;

public class LambdaExpression2 {

	public static void main(String[] args) {
		I2 i2 = (a,b) ->{ 
			System.out.println(a);
			System.out.println(b);
			};
		i2.demo(1,2);
	}
}
