package ch7;
public class NameHasC {
	public static void exer (String [] names){		
		for(String i: names){
			int j = i.indexOf(" ");
			if (i.indexOf("c",j) > 0) {
				System.out.println(i+ " has a 'c' in their last name.");
			} else System.out.println(i+ " does not have a 'c' in their last name. Sad!");
		}
	}
}
