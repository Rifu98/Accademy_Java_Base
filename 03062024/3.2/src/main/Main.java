package main;

public class Main {

	public static void main(String[] args) {
        String str = "tazza pazza";
        String lowerStr = str.toLowerCase();
        String adiacenti = "";
        String nonAdiacenti = "";

        for (int i = 0; i < lowerStr.length() - 1; i++) {
            char ch = lowerStr.charAt(i);
            if ((ch == 'p' || ch == 's')) {
                continue;
            }
            if (lowerStr.charAt(i) == lowerStr.charAt(i + 1)) {
                if (!adiacenti.contains("" + ch)) {
                    adiacenti += ch;
                }
            } else if (lowerStr.lastIndexOf(ch) != i) {
                if (!nonAdiacenti.contains("" + ch)) {
                    nonAdiacenti += ch;
                }
            }
        }
        System.out.println("Doppie adiacenti:");
        
        for(int i = 0; i < adiacenti.length(); i++) {
            System.out.println(adiacenti.charAt(i));
        }
        
        System.out.println("Doppie non adiacenti:");

        for(int i = 0; i < nonAdiacenti.length(); i++) {
            System.out.println(nonAdiacenti.charAt(i));
        }
	}

}
