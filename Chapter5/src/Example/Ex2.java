package Example;

public class Ex2 {
int m,num,index;
public void setM(int m) {
	this.m=m;
}
public int getM() {
	return this.m;
}
public int[] dic(int m) {
	int[] count=new int[10];
	int n;
	while(m!=0) {
		n=m%10;
		count[n]++;
		m/=10;
	}
	return count;
}
public void print(int count[]) {
	for(int i:count) {
		System.out.print(i+" ");
	}

}
public int getIndex(int count[]) {
	index=0;
	for(int i=0;i<count.length;i++) {
		if(count[index]<=count[i])
			index=i;
	}
	return index;
}
	public static void main(String[] args) {
		Ex2 e=new Ex2();
		e.setM(22366);
		int count[]=e.dic(e.getM());
		e.print(count);
System.out.println(e.getIndex(count));
	}

}
