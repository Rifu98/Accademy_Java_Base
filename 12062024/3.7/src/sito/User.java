package sito;

public class User implements Observer {
	public String stato;

	@Override
	public void onNewArticle() {
		System.out.println("Nuovo articolo");
		
	}

}
