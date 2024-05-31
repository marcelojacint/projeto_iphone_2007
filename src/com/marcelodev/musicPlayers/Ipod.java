package com.marcelodev.musicPlayers;

public class Ipod implements MusicPlayer{


	@Override
	public void touch() {
		System.out.println("playing");
		
	}

	@Override
	public void pause() {
		System.out.println("paused");
		
	}

	@Override
	public void selectMusic() {
		System.out.println("select music");
		
	}
}
