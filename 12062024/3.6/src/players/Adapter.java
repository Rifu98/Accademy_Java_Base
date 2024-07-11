package players;

public class Adapter implements ModernMusicPlayer{
	private OldCassettePlayer oldCassettePlayer;
	
	public Adapter (OldCassettePlayer oldCassettePlayer) {
		this.oldCassettePlayer = oldCassettePlayer;
	}

	@Override
	public void playDigital() {
		this.oldCassettePlayer.play();
	}
	
}
