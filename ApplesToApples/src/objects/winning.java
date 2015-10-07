package objects;

public class winning {
	card blackWin;
	card whiteWin;
	public winning(card white, card black){
		whiteWin = white;
		blackWin = black;
	}
	public String getBlackWin(){
		return blackWin.getWord();
	}
	public String getWhiteWin(){
		return whiteWin.getWord();
	}
	public void setBlackWin(String word){
		blackWin = new card(word);
	}
	public void setWhiteWin(String word){
		whiteWin = new card(word);
	}
}
