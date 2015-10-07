package objects;

import java.util.ArrayList;

public class playerHand {
	ArrayList<card> hand = new ArrayList<card>();
	String name;
	public playerHand(String name){
		this.name = name;
	}
	public card getCard(int i){
		return hand.get(i);
	}
	public String getName(){
		return name;
	}
	public void addCard(card c){
		hand.add(c);
	}
}
