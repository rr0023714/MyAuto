package DataStructures;

public class GameEntry {

	private String name;
	private int score;
	
	//Constructor 
	public GameEntry(String name, int score){
		this.name = name;
		this.score = score;
	}
		
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public String toString() {
		return "GameEntry [name=" + name + ", score=" + score + "]";
	}
	
}
