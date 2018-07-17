package ch9;

public class Testclass {
int [][]matrix = new int [2][3];
int a[] = {1,2,3};
int b[]={4,5,6};
static String str ;


static String srt = "abc";
public void initData(String[] arr){
	int ind = 0;
	for(String str: arr){
		
		ind++;
		
	}
}
	public void printData(String [] arr){
		for(String str: arr){
			System.out.println(str);
		}
		
		}
	

public static void main (String [] args){
	String br= "i";
	System.out.println(br.concat("abc"));
	
	System.out.println(str==srt);
	Testclass ot = new Testclass();
	String [] arr = new String[2];
	
	ot.printData(arr);
}

public int compute (int x, int y){
	return a[x] * b[y];
}
public void loadMatrix(){
	for(int x=0; x<matrix.length;x++){
		for(int y =0; y<matrix[x].length;y++){
			matrix [x][y] = compute (x,y);
		}
	}
}
}
