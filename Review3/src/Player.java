
public class Player {

	private String _name;
	private double _score;
	private int _level;
	private double _healthPerc;
	
	// default constructor
	public Player() {}
	
	// constructor that initializes all fields
	public Player(String name, double score, int level, double healthPerc) {
		_name = name;
		_score = score;
		_level = level;
		_healthPerc = healthPerc;
	}
	
	// getter for name	
	public String getName() {
		return _name;
	}
	
	// getter for score	
	public double getScore() {
		return _score;
	}
	
	// getter for level
	public int getLevel() {
		return _level;
	}
	
	// getter for Health percentage
	public double getHealthPerc() {
		return _healthPerc;
	}
	
	// setter for name
	public void setName(String name) {
		_name = name;
	}
	
	// setter for score
	public void setScore(double score) {
		_score = score;
	}
	
	// setter for level
	public void setLevel(int level) {
		_level = level;
	}
	
	// setter for Health percentage
	public void setHealthPerc(double healthPerc) {
		_healthPerc = healthPerc;
	}
	
	// method to update the score 
	public void updateScore(double addScore) {
		_score += addScore;
	}
	
	// method to increase the level
	public void levelUp() {
		_level++;
	}
	
	// method to subtract 5.5% from the health percentage
	public void hitHealth() {
		_healthPerc -= 5.5;
	}
	
	// method to print all the player's information
	public void printInfo() {
		System.out.printf("Name: %s\nScore: %.2f\nLevel: %d\nHealth:%.2f\n\n", getName(), getScore(), getLevel(), getHealthPerc());
	}
}
