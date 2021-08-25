package dicegame;
import java.util.Random;

public class Dice {
	public void helo() {
		Random random=new Random();
		int y=random.nextInt(5);
		if(y==0) {
			System.out.println(6);
		}
		else {
			System.out.println(y);
		}
	}

}
