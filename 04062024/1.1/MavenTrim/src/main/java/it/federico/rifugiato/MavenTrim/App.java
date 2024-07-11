package it.federico.rifugiato.MavenTrim;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        String exampleString = "   Hello, world!   ";
        String trimmedString = StringUtils.trim(exampleString);
        System.out.println("Stringa originale: '" + exampleString + "'");
        System.out.println("Stringa dopo il trim: '" + trimmedString + "'");
    }
}
