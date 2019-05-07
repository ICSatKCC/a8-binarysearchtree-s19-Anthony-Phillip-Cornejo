public class Player {
	public String playerName;
	public Pokemon p;
	public int turnOrder;
	public int passes;

	// Player Object constructor
	Player() {
		this.playerName = "";
		this.p = null;
		this.passes = 0;
		this.turnOrder = 0;
	}

	Player(String playerName, Pokemon p) {
		this.playerName = new String(playerName);
		this.p = p;
		this.passes = 0;
		this.turnOrder = 0;

	}

	// getters
	public String getPlayerName() {
		return playerName;
	}

	public String getPName() {
		return this.p.getName();
	}

	public String getP() {
		return this.p.toString();
	}

	public int getPasses() {
		return this.passes;
	}

	// Setters
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setTurnOrder(int turnOrder) {
		this.turnOrder = this.turnOrder;
	}

	public void setPasses(int passes) {
		this.passes = passes;
	}
}// end class.
