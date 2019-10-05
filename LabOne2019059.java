
public class LabOne2019059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabOne2019059();
	}
	
	public LabOne2019059() {
		//here just need  to change the value to test the program.(more practical)
		//exerciceOne(11);
		//dogsAge(-2.5);
		//chessboard(2,2);
	}
	
	
	public void exerciceOne(int a) {
		// i called my variable there to make more easy to test and run the program
		// i used the if and else if because i think is the better way to run this
		int side = a;
		
		if(side<3) {
			System.out.println("give me more sides");
		}
		if(side>10) {
			System.out.println("less sides plz");
		}
		if(side==3) {
			System.out.println("My name is Triangle");
		}

		else if(side==4) {
			System.out.println("My name is Rectangle");
		}
		else if(side==5) {
			System.out.println("My name is Pentagon");
		}
		else if(side==6) {
			System.out.println("My name is Hexagon");
		}
		else if(side==7) {
			System.out.println("My name is Heptagon");
		}
		else if(side==8) {
			System.out.println("My name is Hoctogon");
		}
		else if(side==9) {
			System.out.println("My name is Nonagon");
		}
		else if(side==10) {
			System.out.println("My name is Decagon");
		}
		
		
		
	}
	public void dogsAge(double a) {
		// i called my variable there to make more easy to test and run the program
		// i used the if and else if because i think is the better way to run this
		double myAge = a;
		double dogsAge =0;
		 
		if(a>0&&a<=2) {
			
			dogsAge = a*10.5;
			System.out.println("If i was a dog, my age would be "+ dogsAge);
			}
		else if(a>2) {
			
			dogsAge = ((a-2)*4) + 21;
			System.out.println("If i was a dog, my age would be "+ dogsAge);
			}
		else if(a<0) {
			System.out.println("ERROR - i cant have a negative age =-( ");
		}
		
	}
	public void chessboard(int i, int j) {
		// i called my variable there to make more easy to test and run the program
		// i used the if and else if because i think is the better way to run this	
		// i put first the "error message" to the program see if are in our out and after that
		// see where exactly the queen is.		
		int columm = i;
		int row = j;
		
		if (i<=0 || i>8 || j<=0 || j>8) {
			System.out.println("ERROR -  the queen is out of the chessboard");
		}
		
		else if(i%2!=0 && j%2!=0 || i%2==0 && j%2==0 ) {
			System.out.println("the queen is in the WHITE square ");
			}
		else if(i%2==0 && j%2!=0 || i%2!=0 && j%2==0) {
			System.out.println("the queen is in the BLACK square ");
			}
		
		
		

	}

}


	
