package ch9;

import java.util.logging.Level;
import java.util.logging.Logger;

interface Nozo{
	int TYPE = 0;
	public void jump();
}

public class Bozo implements Nozo {
	private static final Logger logger = Logger.getGlobal();
public Bozo(){
    //type = 1;
}
public void jump(){
	logger.log(Level.ALL, "jumping.."+TYPE);
	logger.log(Level.ALL, "jumping.."+TYPE);
}
public static void main(String [] args){
	Nozo b = new Bozo();
	b.jump();
}
}

