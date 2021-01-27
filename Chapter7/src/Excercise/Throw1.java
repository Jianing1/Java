package Excercise;
class MyException{
	void throwEx() throws Exception{
		// TODO Auto-generated method stub
		double c;
		for(int i=10;i>=0;i--) {
			c=10/i;
		}
	}
}
public class Throw1 {
public static void main(String[] args) {
	try {
		new MyException().throwEx();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
