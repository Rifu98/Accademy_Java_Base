package sito;

public interface Sito {
	void attach ( Observer o ) ;
	void detach ( Observer o ) ;
	void notifyObservers () ;
}
