package main;

import players.*;

public class Main {
	public static void main (String[] args) {
		OldCassettePlayer oldMusicPlayer = new OldCassettePlayer();
		ModernMusicPlayer modernMusicPlayer = new Adapter(oldMusicPlayer);
		modernMusicPlayer.playDigital();;
	}
}
