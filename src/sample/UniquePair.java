package sample;

public class UniquePair {

	public static void main(String[] args) {
		String[] ppl = {"Donald","Mickey","Minni","Daisy","Scrooge"};
		for(int i = 0;i<ppl.length;++i) {
			for(int j = i+1;j<ppl.length;++j) {
				System.out.println(ppl[i]+" "+ppl[j]);
			}
		}

	}

}
