import java.util.*;

public class A1113338_0224_2{
	public static void main(String[] argv)	{
		float celcius, farenheit;

	System.out.println("enter celcius: ");
    Scanner sc = new Scanner(System.in);
    celcius = sc.nextFloat();

    farenheit = celcius * 9/5 +32;
    System.out.println(+celcius+ " C = " +farenheit+ " F");
    }
}