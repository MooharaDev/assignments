//mohammad alomrani 817571

public class Shuffle {
	public static void main(String[] args) {
		int[] deck = new int[51];
		String[] suits = {"Speads", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {
				"Ace", "2", "3", "4", "5",
				"6", "7", "8", "9", "10",
				"Jack", "Queen", "King"
				};
		String suit;
		String rank;
		
		for(int i=0;i<deck.length;i++) {
			deck[i] = i;
		}
		
		// shuffling the deck
		shuffle(deck);


		// picks the first four numbers of the shuffled deck
		for(int i=0;i<4;i++) {
			rank = ranks[deck[i] % 13];
			suit = suits[deck[i] / 13];
			
			System.out.println("Card number is " + deck[i] + ": " + rank + " of " + suit + " ");
		}
		
	}
	
	// shuffling method using temp
	static void shuffle(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			int random = (int)(Math.random()*arr.length);
			temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;
			
			
		}
		
	}
	
	
}