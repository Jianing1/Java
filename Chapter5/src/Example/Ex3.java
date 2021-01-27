package Example;

public class Ex3 {
	int n, data;
	int[][] arr;

	public int[][] assigin(int n) {
		arr = new int[n][n];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				data = row + col + 1;
				if (data <= n) {
					arr[row][col] = data;
				} else {
					arr[row][col] = data % n;
				}
			}
		}
		return arr;
	}
	public void print(int [][]arr) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Ex3 e=new Ex3();
		int k[][]=e.assigin(4);
		e.print(k);
	}
}
