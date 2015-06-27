package model;

public class Sharks extends Player {
	
	public Sharks() {
		this.name ="The Sharks";
		
	}

	@Override
	public Roshambo generateRoshambo() {
		int num = (int)((Math.random() * 3));
		this.val = Roshambo.values()[num];
		return this.val;
	}
}
