package dicegame;
import java.util.Random;
import java.util.Scanner;

public class Biaseddice {
	
public void biased(int i,int j) {
	Random random = new Random();
	int y=random.nextInt(5+j);
	if(y==0) {
		System.out.println(6);
	}
	else if(y<=5 && y!=0) {
		System.out.println(y);
	}
	else if(i==6 && y>5) {
		System.out.println(6);
	}
	else if(y>5 && i!=6){
		System.out.println(i);
	}
}

}
