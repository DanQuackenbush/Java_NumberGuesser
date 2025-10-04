//import needed utilities
import java.util.Random;
import java.util.Scanner;
//write class with assignment name
public class NumberGuesser{
//declare scanner at class level
private static Scanner keyboard = new Scanner(System.in);	
	
//start building required methods
/*method 1 is isCorrect(int) which determins if the user's guess(UG) is correct or not by returning integers if the UG matches the secret number

@Param userGuess is the number the user inputs to play the game
@Param winningGuess is the random number generated the user must guess
@return tells user about guess 0 == correct, -1 == lower, 1 == higher	
*/
public static int isCorrect(int userGuess, int winningGuess){
	if(userGuess == winningGuess){
		return 0;
	}
	else if(userGuess < winningGuess){
		return -1;
	}
	else if( userGuess > winningGuess){
		return 1;
	}
}
/*method 2 is to get the random number, the object of the guessing game

@Param high is the higher limit of the random generator
*/
public static int generateGuess(int high){
	Random winningGuess = new Random();
	//DEBUG MODE FOR PROFESSOR TO TEST//
	System.out.println(winningGuess)
	return winningGuess.nextInt(high) +1;
}
/*method 3 is for getting the user's name, greeting them

@Param keyboard is name for input scanner
*/
public static String getNameGreet(Scanner keyboard){
	System.out.println("Please enter your name: ");
	String contestant = keyboard.nextLine();
	System.out.print("Hello" + contestant + " Would you like to play a game?")
	return contestant;
	
}
/*method 4 is for getting the user's guess

@Param keyboard is name for input scanner
*/
public static int getUserGuess(Scanner keyboard){
	System.out.println("If you would like to play enter a number between 1-100, if you wish to quit enter a 0")
	int userGuess = keyboard.nextInt();
	return userGuess;
}
/*method 5 is for playing the game|!

*/
public static void playGame(keyboard)
int userGuessCount = 0;
int winningGuess = generateGuess(100);

while(userGuess != 0){
	int userGuess = getUserGuess(keyboard);
	while(true){	
	System.out.println("Guess a number 1-100 to play, enter 0 to quit: ");
	while (userGuess < 1 || userGuess > 100){
	System.out.println("That is not a vaild guess! Guess a number 1-100 to play, enter 0 to quit:");
		userGuessCount++;
	}
	if(userGuess == 0){
		System.out.println("Thank you for playing! your guess count was: " + userGuessCount);
	break;
	}
	int result = isCorrect(userGuess, winningGuess);
	}
		if(result == 0){
	System.out.println("YOU WIN!!! Your guess count was: " +userGuessCount)
	break;
}
else if(result == -1){
	System.out.println("Too low, guess a higher number")
}	
else(result == 1){
	System.out.println("Too high, guess a lower number")
	}
	}
public static void main(Strin[] args){
	String contestant= getNameGreet(keyboard);
	playGame();
}
}










}