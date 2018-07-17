package ch9;
interface Nozo{
	int type = 0;
	public void jump();
}

public class Bozo implements Nozo {
public Bozo(){
    type = 1;
}
public void jump(){
	System.out.println("jumping.."+type);;
}
public static void main(String [] args){
	Nozo b = new Bozo();
	b.jump();
}
}

