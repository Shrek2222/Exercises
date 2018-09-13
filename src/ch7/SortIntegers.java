package ch7;
public class SortIntegers {
	/**
	 * return 0 if all values are sorted else 1
	 * @param values
	 * @return
	 */
public int sort(int[] values) {
	int local = Integer.MIN_VALUE;
	int ret = 0; //False
	for(int i : values) {
		if (i > local) {
			local = i;
		} else {
			ret = 1;
			break;
		}
	}
	return ret;
}

//public static void main(String args[]) {
//	System.out.println(sort(new int[] {1,2,3}));
//	System.out.println(sort(new int[] {1,2,3,2}));
//}
}
