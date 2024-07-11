package sito;


import java.util.ArrayList;
import java.util.List;

public class ConcreteSito implements Sito {
	private List < Observer > observers = new ArrayList < >();
	private String state ;
	
	public String getState () {
		return state ;
	}
	
	public void setState ( String state ) {
		this . state = state ;
		notifyObservers () ;
	}

	@Override
	public void attach(Observer o) {
		observers . add ( o ) ;
		
	}

	@Override
	public void detach(Observer o) {
		observers . remove ( o ) ;
		
	}

	@Override
	public void notifyObservers() {
		for ( Observer observer : observers ) {
			observer.onNewArticle();
		}
		
	}

}
