package Exa;

public class 例4_2 {
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void grade() {
		switch (grade / 10) {
		case 6:
			System.out.println(this.getGrade() + "分数属于及格");
			break;
		case 7:
		case 8:
			System.out.println(this.getGrade() + "分数属于良好");
			break;
		case 9:
			System.out.println(this.getGrade() + "分数属于优秀");
			break;
		case 10:
			System.out.println(this.getGrade() + "分数属于满分");
			break;
		default:
			System.out.println(this.getGrade() + "分数属于不及格");
			break;
		}
	}

	public static class test {
		public static void main(String[] args) {
			例4_2 e1 = new 例4_2();
			e1.setGrade(76);
			e1.grade();
		}

	}

}
