package objects;

import java.util.ArrayList;
import java.util.Random;

public class shuffle {
	Random gen = new Random();
	card temp;
	ArrayList<card> deck;
	public shuffle(ArrayList<card> deck){
		for(int i = 0; i < deck.size(); i++){
			int place = gen.nextInt(deck.size());
			temp = deck.get(i);
			deck.set(i, deck.get(place));
			deck.set(place, temp);
		}
		this.deck = deck;
	}
	public ArrayList<card> getDeck(){
		return deck;
	}
}
