package main;

import config.Config;

public class Main {
	public static void main (String[] args) {
		Config config = Config.getInstance();
		
		System.out.println(config.getConfig());
		
		config.setConfig("Custom");
		
		System.out.println(config.getConfig());
	}
}
