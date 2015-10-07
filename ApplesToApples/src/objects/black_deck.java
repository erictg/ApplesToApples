package objects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class black_deck {
	//20 cards
	ArrayList<card> blackCards = new ArrayList<card>();
	ArrayList<card> blackDiscard = new ArrayList<card>();
	public black_deck(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("src//objects//black_words"));
			for(int i = 0; i < 20; i++){
					blackCards.add(new card(br.readLine()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Shuffle(blackCards);
	}
	public void Shuffle(ArrayList<card> deck){
		shuffle shuf = new shuffle(deck);
		blackCards = shuf.getDeck();
	}
}
