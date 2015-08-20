package Ackermann;

public class Main {
	
	public static int ackermann(int m, int n) {
		if(m == 0) return n+1;
		if(n == 0) return ackermann(m-1, 1);
		return ackermann(m-1, ackermann(m, n-1));
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.println("ackermann(" + i + ", " + j + ") = " + ackermann(i, j));
			}
		}
	}

}
