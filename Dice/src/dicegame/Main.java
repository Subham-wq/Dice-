package dicegame;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
static int biasdigit;
static int j;
public static void main(String[]args) {
	System.out.println("Do you want Biased Game?");
	Scanner b = new Scanner(System.in); 
	String bias=b.nextLine();
	
		
		if(bias.toLowerCase().equals("yes")||bias.toLowerCase().equals("no")) {
		meth2(bias);	
			
		}else{
			System.out.println("Type yes or no");
		}
	}
public static void meth2(String bias) {
	boolean repeat=true;
	int k=0;
	boolean dice_number=true;
	boolean bias_level=true;
	
if(bias.equals("yes")) {
	
	System.out.println("Enter your bias digit");
	while(dice_number) {
	try {
	Scanner c=new Scanner(System.in);	
    int biasdigit=c.nextInt();
    if(biasdigit<=6) {
    dice_number=false;
   
    }
    else if(biasdigit>=7){
    	System.out.println("Enter value less then 7 and greater then zero");
    	
    }
    }
	catch(InputMismatchException e) {
		System.out.println("Enter a digit");

	}}
    Biaseddice dice=new Biaseddice();
	System.out.println("Enter your level of Biaseness");
	while(bias_level){
	try {
	Scanner c=new Scanner(System.in);
	int j=c.nextInt();
	bias_level=false;
	}
	catch(InputMismatchException e) {
		System.out.println("Enter a no");
	}
	}
	while(repeat) {
	try {
	System.out.println("How many times do you want to throw the dice?");
	Scanner z=new Scanner(System.in);
	int l=z.nextInt();
	for(int m=0;m<l;m++) {
    dice.biased(biasdigit,j);
	}
	repeat=false;
	}
	catch(InputMismatchException e) {
		System.out.println("Enter a no");
      
		}}}
	
	else{
		Dice dice =new Dice();
		
		 System.out.println("How many times do you want to throw the dice?");
		  while(repeat){
		  try {
			  Scanner c=new Scanner(System.in);
			   int l=c.nextInt();
			   for(int m=0;m<l;m++) {
			   dice.helo();
			   } repeat=false;
		   }
		   catch(InputMismatchException e){
		   System.out.println("Enter a no");
		   }
		
		  }
	   
	}
}
}


