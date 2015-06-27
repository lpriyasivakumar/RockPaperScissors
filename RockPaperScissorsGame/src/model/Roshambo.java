package model;

public enum Roshambo {
	ROCK, PAPER, SCISSORS;

	@Override
	public String toString() {
		String stringValue = "";

		switch (this.ordinal()) {
		case 0:
			stringValue = "Rock";
			break;
		case 1:
			stringValue = "Paper";
			break;
		default:
			stringValue = "Scissors";
			break;
		}
		return stringValue;
	}
	
	
	
}
