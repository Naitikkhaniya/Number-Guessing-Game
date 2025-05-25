import java.util.*;

//Main Class
class FinalGame{
	static int player1Count = 1;
	static int player2Count = 1;
	
	//Instance Block For Game Starting
	static {
		System.out.println("\n---: Welcome To Game :---\n");
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		// Using Math Class For Random Number 
		int secretNumber = (int)(Math.random()*100);
		
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		
		p1.startingGaming(secretNumber, player1Count, player2Count);

	}	
}

//Class For Player 1 Turn 
class Player1{
	
	static Scanner sc = new Scanner(System.in);
	void startingGaming(int secretNumber,int player1Count,int player2Count){
		
		Player2 p2 = new Player2();
		
		System.out.print("Player 1, Enter Your Guess :- ");
		int player1Guess = sc.nextInt();
		
		if(player1Guess < secretNumber){
			
			System.out.println("Its Too Low Guess!, Try Again Next Time ");
			System.out.println();
			player1Count++;
			
			p2.startingGaming(secretNumber, player1Count, player2Count);
			
		}else if (player1Guess > secretNumber){
			
			System.out.println("Its Too High Guess!, Try Again Next Time ");			
			System.out.println();
			player1Count++;
			
			p2.startingGaming(secretNumber, player1Count, player2Count);
			
		}else if(player1Guess == secretNumber){
			
			System.out.println("\n \nPerfact Guess! Player 1, \n \n----You Won The Game---- \nIn " + player1Count + " Count");	
			
			//For Get Out From Whole Code
			System.exit(0);
			
		}		
	}
}

//Class For Player 2 Turn
class Player2{
	static Scanner sc = new Scanner(System.in);
	
	void startingGaming(int secretNumber,int player1Count,int player2Count){
		
		Player1 p1 = new Player1();
		
		System.out.print("Player 2, Enter Your Guess :- ");
		int player2Guess = sc.nextInt();
		
		if(player2Guess < secretNumber){
			
			System.out.println("Its Too Low Guess!, Try Again Next Time ");
			System.out.println();
			player2Count++;
			
			p1.startingGaming(secretNumber, player1Count, player2Count);
			
		}else if (player2Guess > secretNumber){
			
			System.out.println("Its Too High Guess!, Try Again Next Time ");			
			System.out.println();
			player2Count++;
			
			p1.startingGaming(secretNumber, player1Count, player2Count);
			
		}else if(player2Guess == secretNumber){
			
			System.out.println("Perfact Guess! Player 2, \n----You Won The Game---- \nIn " + player2Count + " Count");	
			
			//For Get Out From Whole Code
			System.exit(0);
			
		}
	}
}