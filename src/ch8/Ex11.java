package ch8;

public class Ex11 {
	private static void printBinary(int x) {
		System.out.println("X is "+x+" = ");		
		while(x > 0) {
			System.out.print(x%2);
			x = x/2;
		}
		System.out.println();
		
	}
	private static void printHT(int x) {		
		System.out.println();
		String[] qns = new String[9];
		for(int i = 0 ;i<9;++i) {
			qns[i] = (x%2==0?"H ":"T ");
			if (x > 0) {
				x = x/2;
			}			
		}
		for(int i = qns.length-1; i >=0; --i) {
			System.out.print(qns[i]);
			if(i%3 == 0) System.out.println();
		}
	}
	public static void main(String[] args) {
		//System.out.println((0/1)+" "+(1/1)+" "+(2/2)+" "+(3/2));
		int[] sample = {0,1,2,7,8,126,510,511};
		for(int i : sample) {
			//printBinary(i);
			printHT(i);
		}
	}

}
