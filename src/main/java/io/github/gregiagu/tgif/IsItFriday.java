package io.github.gregiagu.tgif;

public class IsItFriday {
    public static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
