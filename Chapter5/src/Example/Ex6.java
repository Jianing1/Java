package Example;

import java.util.Random;

public class Ex6 {
public static void main(String[] args) {
	Random ran=new Random();
	System.out.println(ran.nextInt());
	System.out.println(ran.nextBoolean());
	System.out.println(ran.nextDouble());
	System.out.println(ran.nextFloat());
	System.out.println(ran.nextLong());
	System.out.println(ran.nextInt(100));
}
}
