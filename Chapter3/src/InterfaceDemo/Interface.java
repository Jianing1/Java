package InterfaceDemo;

interface IChineseWelcome {
	String CHINESE_MSG = "你好，欢迎你！";

	void sayChinese();
}

interface IEnglishWelcome {
	public static final String ENGLISH_MSG = "Hello,Welcome!";

	public abstract void sayEnglish();
}

interface IWelcome extends IChineseWelcome, IEnglishWelcome {
	String ENGLISH_AN_CHINESE_MSG = "Hello,Welcome!你好，欢迎你！";

	void sayChineseAndEnglish();
}

class A implements IWelcome {
	@Override
	public void sayChinese() {

		System.out.println(CHINESE_MSG);
	}

	@Override
	public void sayEnglish() {

		System.out.println(ENGLISH_MSG);
	}

	@Override
	public void sayChineseAndEnglish() {
		System.out.println(ENGLISH_AN_CHINESE_MSG);
	}
}

public class Interface {

	public static void main(String[] args) {
		A a = new A();
		a.sayChinese();
		a.sayEnglish();
		a.sayChineseAndEnglish();
	}
}
