package model;

public class Jets extends Player {
	
	public Jets() {
		this.name = "The Jets"	;	
	}

	@Override
	public Roshambo generateRoshambo() {
		this.val = Roshambo.ROCK;
		return this.val;
	}

}
