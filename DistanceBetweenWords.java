package com.prep;

public class DistanceBetweenWords {
	
	private static final String document;

    static {
        final StringBuffer sb = new StringBuffer();
        sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
        sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
        sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

        document = sb.toString();
    }

    public static double shortestDistance(final String document, String word1, String word2) {
        final String[] words = document.split("[,. ]");

        int wordCount = 0;
        double wordOneCount = 0;
        double wordTwoCount = 0;
        double shortestDistance = Double.MAX_VALUE;
        for (String word : words) {
            if (word.equalsIgnoreCase(word1)) wordOneCount = wordCount + (word.length() / 2d);
            else if (word.equalsIgnoreCase(word2)) wordTwoCount = wordCount + (word.length() / 2d);

            if (wordOneCount > 0 && wordTwoCount > 0) {
                shortestDistance = Math.min(shortestDistance, Math.abs(wordTwoCount - wordOneCount));
            }

            wordCount += word.length() + 1;
        }

        System.out.println(String.format("Word1 : %s, word2: %s, distance: %s", word1, word2, shortestDistance));

        return shortestDistance;
    }

    public static boolean pass() {
        return shortestDistance(document, "and", "graphic") == 6d &&
                shortestDistance(document, "transfer", "it") == 14d &&
                shortestDistance(document, "Design", "filler") == 25d;
    }

    public static void main(String[] args) {
        if (pass()) System.out.println("Pass");
        else System.out.println("Some Fail");
    }

}
