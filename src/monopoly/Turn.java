package src.monopoly;

public class Turn{
	private int totalPlayer;
	private int player = 0;		//Initiate player index

	public Turn(int totalPlayer) {
		this.totalPlayer = totalPlayer;
	}

	public int getPlayer() {
		return this.player;
	}

	public void setTotalPlayer(int totalPlayer) {
		this.totalPlayer = totalPlayer;
	}

	public void nextPlayer() {
		this.player = (this.player + 1) % this.totalPlayer;
	}
}
