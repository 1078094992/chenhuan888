public class BeerSong{
	public static void main(String[] args){
		int beerNum=99;
		String word="bottles";
		
		while(beerNum>0){
			
			if(beerNum==1){
				word="bottles";//The number of the bottles is odd.
			}
			System.out.println(beerNum+" "+word+" of beer on the wall");
			System.out.println(beerNum+" "+"of beer.");
			System.out.println("Take one down .");
			System.out.println("Pass it around.");
			beerNum=beerNum-1;
			
			if(beerNum>0){
				System.out.println(beerNum+" "+word+" of beer on the wall");
			}else{
				System.out.println("No more bottles of beer on the wall");
			}//the result of "else"
		}//the result of"'while"
	}//the main method finish
}//class finish