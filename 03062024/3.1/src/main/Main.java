package main;

public class Main {

	public static void main(String[] args) {
        String str = "tazza matta";
        String lowerStr = str.toLowerCase();
        String adiacenti = "";

        for (int i = 0; i < lowerStr.length()-1; i++) {
            char ch = lowerStr.charAt(i);
            char nextCh = lowerStr.charAt(i+1);
            if ((ch == 'p' || ch == 's')) {
                continue;
            }
            if (ch == nextCh) {
                if (!adiacenti.contains("" + ch)) {
                    adiacenti += ch;
                }
            } 
        }
        
        System.out.println("Doppie adiacenti:");
        
        for(int i = 0; i < adiacenti.length(); i++) {
            System.out.println(adiacenti.charAt(i));
        }
	}

}
