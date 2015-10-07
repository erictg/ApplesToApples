package objects;

import java.util.ArrayList;
import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		ArrayList<playerHand> player = new ArrayList<playerHand>(); 
		black_deck bd = new black_deck();
		white_deck wd = new white_deck();
		for(int i = 0; i < 7; i++){
			String name;
			Scanner r = new Scanner(System.in);
			name = r.nextLine();
			if(name.equals(""))
				break;
			player.add(new playerHand(name));
		}
		System.out.println("black Card");
		System.out.println(bd.blackCards.get(0).getWord());
		bd.blackDiscard.add(bd.blackCards.get(0));
		bd.blackCards.remove(0);
		System.out.println("");
		for(int i = 0; i < 7; i++){
			for(int x = 0; x < player.size(); x ++){
				player.get(x).addCard(wd.whiteCards.get(0));
				wd.whiteDiscard.add(wd.whiteCards.get(0));
				wd.whiteCards.remove(0);
			}
		}
		for(int x = 0; x < player.size(); x++){
			System.out.println("");
			System.out.println(player.get(x).getName() +"'s Cards");
			System.out.println("");
			for(int i = 0; i < 7; i++){
				System.out.println(player.get(x).getCard(i).getWord());
			}
		}
		if(wd.whiteCards.size() == 0){
			wd.Shuffle(wd.whiteDiscard);
			wd.whiteCards = wd.whiteDiscard;
		}
		if(bd.blackCards.size() == 0){
			bd.Shuffle(bd.blackDiscard);
			bd.blackCards = bd.blackDiscard;
		}
	}
}
