package ch9;
class Super { }
class Sub extends Super { }
public class SuperClass {
	public static int count = 4;
	int poop = 6;
public static void main (String []args){
	SuperClass s1 = new SuperClass();
	SuperClass s4 = new SuperClass();
	s1.poop = 8;
	s1.count = 6;
	s4.count = 9;
	System.out.println(new SuperClass().poop);
	Sub s2 =  new Sub();
}
}
