package objects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class white_deck {
	//50 cards
	ArrayList<card> whiteCards = new ArrayList<card>();
	ArrayList<card> whiteDiscard = new ArrayList<card>();
	public white_deck(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("src//objects//white_words"));
			for(int i = 0; i < 50; i++){
					whiteCards.add(new card(br.readLine()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Shuffle(whiteCards);
	}
	public void Shuffle(ArrayList<card> deck){
		shuffle shuf = new shuffle(deck);
		whiteCards = shuf.getDeck();
		
	}
}
