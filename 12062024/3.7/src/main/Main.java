package main;

import sito.*;

public class Main {
	public static void main (String[] args) {
		ConcreteSito sito = new ConcreteSito();
		User user1 = new User();
		User user2 = new User();
		sito.attach(user1);
		sito.attach(user2);
	}
}
