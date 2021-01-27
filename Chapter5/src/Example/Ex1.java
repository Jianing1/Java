package Example;

public class Ex1 {
	double avg;
	int sum,max,min;

	public int GetArraySum(int score[]) {
		sum = 0;
		for (int i : score) {
			sum += i;
		}
		return sum;
	}

	public int GetArrayMax(int score[]) {
		max = score[0];
		for (int i : score) {
			if (i > max)
				max = i;
		}
return max;
	}
	public int GetArrayMin(int score[]) {
		min=score[0];
		for(int i:score) {
			if(i<min)
				min=i;
		}
		return min;
	}
	public double GetArrayAvg(int score[]) {
		avg=(double)(this.sum-this.max-this.min)/(double)(score.length-2);
		return avg;
	}
	public void print(int score[]) {
		System.out.println(this.GetArraySum(score));
		System.out.println(this.GetArrayMax(score));
		System.out.println(this.GetArrayMin(score));
		System.out.println(this.GetArrayAvg(score));
	}
	public static void main(String[] args) {
		int score[]= {90,78,90,96,67,78,92,79,85};
		Ex1 e=new Ex1();
		e.print(score);
	}
}
