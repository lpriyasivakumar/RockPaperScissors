package model;

public class User extends Player {	
	
	public User(String name) {
		this.name = name;
		}
	
	
	public void setRoshambo(String s) {
		if (s.equalsIgnoreCase("r")) {
			this.val = Roshambo.ROCK;
		} else if (s.equalsIgnoreCase("p")) {
			this.val = Roshambo.PAPER;
		} else if (s.equalsIgnoreCase("s")) {
			this.val = Roshambo.SCISSORS;
		}
		
	}
	public Roshambo generateRoshambo(){
		return val;
	}
}
