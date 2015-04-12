public class SimpleDotComGame{
public static void main(String[] args){
	int numOfGuess = 0;
	GameHelper helper = new GameHelper();
		
	SimpleDotCom theDotcom=  new SimpleDotCom();
	int randomNum = (int) (Math.random() * 5);

	int[] locations = {randomNum ,randomNum+1,randomNum+2};
	theDotcom.setLocationCells(locations);
	boolean isAlive = true ;
	
	while(isAlive == true){
		String guess = helper.getUserInput("enter a number");
		String result= theDotcom.checkYourself(guess);
		numOfGuess++;
		if(result.equals("kill")){
			isAlive=false;
			System.out.println("You took "+ numOfGuess +"guesses");
			}
		}
	}
}